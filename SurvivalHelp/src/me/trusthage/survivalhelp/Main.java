package me.trusthage.survivalhelp;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	Logger logger = Logger.getLogger("Minecraft");
	Recipes recipes = new Recipes();
	
	@Override
	public void onEnable(){
		plugin = this;
		logger.info("SurvivalHelp has been enabled.");
		getCommand("recipe").setExecutor(new RecipeCommand());
		getCommand("craft").setExecutor(new CraftCommand());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new CraftingListener(), this);
		recipes.saddleRecipe();
		recipes.recipeBook();
	}
	
	@Override
	public void onDisable(){
		logger.info("SurvivalHelp has been disabled.");
	}

}
