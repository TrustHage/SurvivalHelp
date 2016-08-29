package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu8 {
	
	public void openRecipe8(Player player){
		Inventory recipe8 = Bukkit.createInventory(null, 54, "Recipes Page: 8");
		
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();
		ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta nextpageMeta = nextpage.getItemMeta();
		ItemStack previouspage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta previouspageMeta = nextpage.getItemMeta();
		
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);
		nextpageMeta.setDisplayName("Next Page");
		nextpage.setItemMeta(nextpageMeta);
		previouspageMeta.setDisplayName("Previous Page");
		previouspage.setItemMeta(previouspageMeta);
		
		player.openInventory(recipe8);
	}

}
