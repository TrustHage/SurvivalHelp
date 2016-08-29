package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu {
	
	public void openRecipe(Player player){
		Inventory recipe1 = Bukkit.createInventory(null, 54, "Recipes Page: 1");
		
		ItemStack line = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
		ItemMeta lineMeta = line.getItemMeta();
		ItemStack nextpage = new ItemStack(Material.ENDER_PEARL);
		ItemMeta nextpageMeta = nextpage.getItemMeta();
		
		lineMeta.setDisplayName("-");
		line.setItemMeta(lineMeta);
		nextpageMeta.setDisplayName("Next Page");
		nextpage.setItemMeta(nextpageMeta);
		
		recipe1.setItem(0, new ItemStack(Material.WOOD));
		recipe1.setItem(1, new ItemStack(Material.WOOD, 1, (short)1));
		recipe1.setItem(2, new ItemStack(Material.WOOD, 1, (short)2));
		recipe1.setItem(3, new ItemStack(Material.WOOD, 1, (short)3));
		recipe1.setItem(4, new ItemStack(Material.WOOD, 1, (short)4));
		recipe1.setItem(5, new ItemStack(Material.WOOD, 1, (short)5));
		recipe1.setItem(6, new ItemStack(Material.STICK));
		recipe1.setItem(7, new ItemStack(Material.TORCH));
		recipe1.setItem(8, new ItemStack(Material.WORKBENCH));
		recipe1.setItem(9, new ItemStack(Material.CHEST));
		recipe1.setItem(10, new ItemStack(Material.FURNACE));
		recipe1.setItem(11, new ItemStack(Material.LADDER));
		recipe1.setItem(12, new ItemStack(Material.FENCE));
		recipe1.setItem(13, new ItemStack(Material.BOAT));
		recipe1.setItem(14, new ItemStack(Material.SIGN));
		recipe1.setItem(15, new ItemStack(Material.PAINTING));
		recipe1.setItem(16, new ItemStack(Material.BED));
		recipe1.setItem(17, new ItemStack(Material.STEP));
		recipe1.setItem(18, new ItemStack(Material.STEP, 1, (short)1));
		recipe1.setItem(19, new ItemStack(Material.STEP));
		recipe1.setItem(20, new ItemStack(Material.STEP, 1, (short)3));
		recipe1.setItem(21, new ItemStack(Material.STEP, 1, (short)4));
		recipe1.setItem(22, new ItemStack(Material.STEP, 1, (short)5));
		recipe1.setItem(23, new ItemStack(Material.STEP, 1, (short)6));
		recipe1.setItem(24, new ItemStack(Material.STEP, 1, (short)7));
		recipe1.setItem(25, new ItemStack(Material.WOOD_STEP));
		recipe1.setItem(26, new ItemStack(Material.WOOD_STEP, 1, (short)1));
		recipe1.setItem(27, new ItemStack(Material.WOOD_STEP, 1, (short)2));
		recipe1.setItem(28, new ItemStack(Material.WOOD_STEP, 1, (short)3));
		recipe1.setItem(29, new ItemStack(Material.WOOD_STEP, 1, (short)4));
		recipe1.setItem(30, new ItemStack(Material.WOOD_STEP, 1, (short)5));
		recipe1.setItem(31, new ItemStack(Material.WOOD_DOOR));
		recipe1.setItem(32, new ItemStack(Material.SPRUCE_DOOR));
		recipe1.setItem(33, new ItemStack(Material.BIRCH_DOOR));
		recipe1.setItem(34, new ItemStack(Material.JUNGLE_DOOR));
		recipe1.setItem(35, new ItemStack(Material.ACACIA_DOOR));
		recipe1.setItem(36, line);
		recipe1.setItem(37, line);
		recipe1.setItem(38, line);
		recipe1.setItem(39, line);
		recipe1.setItem(40, line);
		recipe1.setItem(41, line);
		recipe1.setItem(42, line);
		recipe1.setItem(43, line);
		recipe1.setItem(44, line);
		recipe1.setItem(53, nextpage);
		
		player.openInventory(recipe1);
	}

}
