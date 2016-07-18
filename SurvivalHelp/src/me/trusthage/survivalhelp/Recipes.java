package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Recipes {

	public void saddleRecipe(){
		ItemStack saddle = new ItemStack(Material.SADDLE);
		
		ShapedRecipe srecipe = new ShapedRecipe(saddle);
		srecipe.shape("  L"
					, "LLL"
					, " L ");
		srecipe.setIngredient('L', Material.LEATHER);
		Bukkit.getServer().addRecipe(srecipe);
	}
	
	public void recipeBook(){
		ItemStack book = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta bookMeta = book.getItemMeta();
		
		bookMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Recipe Book");
		book.setItemMeta(bookMeta);
		
		ShapelessRecipe bookrecipe = new ShapelessRecipe(book);
		bookrecipe.addIngredient(1, Material.WORKBENCH);
		bookrecipe.addIngredient(1, Material.BOOK);
		Bukkit.getServer().addRecipe(bookrecipe);
	}
	
}
