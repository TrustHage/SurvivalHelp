package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CraftingMenu {
	
	public void openRecipe(Player player){
		Inventory recipe = Bukkit.createInventory(null, 9, "Recipes");
		
		recipe.setItem(2, new ItemStack(Material.ANVIL));
		recipe.setItem(4, new ItemStack(Material.IRON_BLOCK));
		recipe.setItem(6, new ItemStack(Material.IRON_INGOT));
		
		player.openInventory(recipe);
	}

}
