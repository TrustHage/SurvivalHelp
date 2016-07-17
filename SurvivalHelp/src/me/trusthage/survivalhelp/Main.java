package me.trusthage.survivalhelp;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable(){
		logger.info("SurvivalHelp has been enabled.");
		getCommand("recipe").setExecutor(new RecipeCommand());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new CraftingListener(), this);
	}
	
	@Override
	public void onDisable(){
		logger.info("SurvivalHelp has been disabled.");
	}

}
