package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu6 {
	
	public void openRecipe6(Player player){
		Inventory recipe6 = Bukkit.createInventory(null, 54, "Recipes Page: 6");
		
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
		
		recipe6.setItem(0, new ItemStack(Material.DETECTOR_RAIL));
		recipe6.setItem(1, new ItemStack(Material.REDSTONE_TORCH_ON));
		recipe6.setItem(2, new ItemStack(Material.REDSTONE_LAMP_OFF));
		recipe6.setItem(3, new ItemStack(Material.TRIPWIRE_HOOK));
		recipe6.setItem(4, new ItemStack(Material.ACTIVATOR_RAIL));
		recipe6.setItem(5, new ItemStack(Material.DAYLIGHT_DETECTOR));
		recipe6.setItem(6, new ItemStack(Material.DROPPER));
		recipe6.setItem(7, new ItemStack(Material.HOPPER));
		recipe6.setItem(8, new ItemStack(Material.HOPPER_MINECART));
		recipe6.setItem(9, new ItemStack(Material.EXPLOSIVE_MINECART));
		recipe6.setItem(10, new ItemStack(Material.REDSTONE_COMPARATOR));
		recipe6.setItem(11, new ItemStack(Material.TRAPPED_CHEST));
		recipe6.setItem(12, new ItemStack(Material.IRON_PLATE));
		recipe6.setItem(13, new ItemStack(Material.GOLD_PLATE));
		recipe6.setItem(14, new ItemStack(Material.LEATHER_HELMET));
		recipe6.setItem(15, new ItemStack(Material.IRON_HELMET));
		recipe6.setItem(16, new ItemStack(Material.GOLD_HELMET));
		recipe6.setItem(17, new ItemStack(Material.DIAMOND_HELMET));
		recipe6.setItem(18, new ItemStack(Material.LEATHER_CHESTPLATE));
		recipe6.setItem(19, new ItemStack(Material.IRON_CHESTPLATE));
		recipe6.setItem(20, new ItemStack(Material.GOLD_CHESTPLATE));
		recipe6.setItem(21, new ItemStack(Material.DIAMOND_CHESTPLATE));
		recipe6.setItem(22, new ItemStack(Material.LEATHER_LEGGINGS));
		recipe6.setItem(23, new ItemStack(Material.IRON_LEGGINGS));
		recipe6.setItem(24, new ItemStack(Material.GOLD_LEGGINGS));
		recipe6.setItem(25, new ItemStack(Material.DIAMOND_LEGGINGS));
		recipe6.setItem(26, new ItemStack(Material.LEATHER_BOOTS));
		recipe6.setItem(27, new ItemStack(Material.IRON_BOOTS));
		recipe6.setItem(28, new ItemStack(Material.GOLD_BOOTS));
		recipe6.setItem(29, new ItemStack(Material.DIAMOND_BOOTS));
		recipe6.setItem(30, new ItemStack(Material.WOOD_SWORD));
		recipe6.setItem(31, new ItemStack(Material.STONE_SWORD));
		recipe6.setItem(32, new ItemStack(Material.IRON_SWORD));
		recipe6.setItem(33, new ItemStack(Material.GOLD_SWORD));
		recipe6.setItem(34, new ItemStack(Material.DIAMOND_SWORD));
		recipe6.setItem(35, new ItemStack(Material.BOW));
		recipe6.setItem(36, line);
		recipe6.setItem(37, line);
		recipe6.setItem(38, line);
		recipe6.setItem(39, line);
		recipe6.setItem(40, line);
		recipe6.setItem(41, line);
		recipe6.setItem(42, line);
		recipe6.setItem(43, line);
		recipe6.setItem(44, line);
		recipe6.setItem(45, previouspage);
		recipe6.setItem(53, nextpage);
		
		player.openInventory(recipe6);
	}

}
