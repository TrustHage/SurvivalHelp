package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu5 {

	public void openRecipe5(Player player){
		Inventory recipe5 = Bukkit.createInventory(null, 54, "Recipes Page: 5");
		
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
		
		recipe5.setItem(0, new ItemStack(Material.PRISMARINE, 1, (short)2));
		recipe5.setItem(1, new ItemStack(Material.SEA_LANTERN));
		recipe5.setItem(2, new ItemStack(Material.DIRT, 1, (short)1));
		recipe5.setItem(3, new ItemStack(Material.SLIME_BLOCK));
		recipe5.setItem(4, new ItemStack(Material.MOSSY_COBBLESTONE));
		recipe5.setItem(5, new ItemStack(Material.SMOOTH_BRICK, 1, (short)1));
		recipe5.setItem(6, new ItemStack(Material.SMOOTH_BRICK, 1, (short)3));
		recipe5.setItem(7, new ItemStack(Material.RED_SANDSTONE));
		recipe5.setItem(8, new ItemStack(Material.RED_SANDSTONE, 1, (short)2));
		recipe5.setItem(9, new ItemStack(Material.RED_SANDSTONE, 1, (short)1));
		recipe5.setItem(10, new ItemStack(Material.STONE_PLATE));
		recipe5.setItem(11, new ItemStack(Material.WOOD_PLATE));
		recipe5.setItem(12, new ItemStack(Material.LEVER));
		recipe5.setItem(13, new ItemStack(Material.STONE_BUTTON));
		recipe5.setItem(14, new ItemStack(Material.WOOD_BUTTON));
		recipe5.setItem(15, new ItemStack(Material.TRAP_DOOR));
		recipe5.setItem(16, new ItemStack(Material.IRON_TRAPDOOR));
		recipe5.setItem(17, new ItemStack(Material.PISTON_BASE));
		recipe5.setItem(18, new ItemStack(Material.PISTON_STICKY_BASE));
		recipe5.setItem(19, new ItemStack(Material.FENCE_GATE));
		recipe5.setItem(20, new ItemStack(Material.ACACIA_FENCE_GATE));
		recipe5.setItem(21, new ItemStack(Material.BIRCH_FENCE_GATE));
		recipe5.setItem(22, new ItemStack(Material.DARK_OAK_FENCE_GATE));
		recipe5.setItem(23, new ItemStack(Material.SPRUCE_FENCE_GATE));
		recipe5.setItem(24, new ItemStack(Material.ACACIA_FENCE));
		recipe5.setItem(25, new ItemStack(Material.BIRCH_FENCE));
		recipe5.setItem(26, new ItemStack(Material.DARK_OAK_FENCE));
		recipe5.setItem(27, new ItemStack(Material.SPRUCE_FENCE));
		recipe5.setItem(28, new ItemStack(Material.DIODE));
		recipe5.setItem(29, new ItemStack(Material.DISPENSER));
		recipe5.setItem(30, new ItemStack(Material.JUKEBOX));
		recipe5.setItem(31, new ItemStack(Material.MINECART));
		recipe5.setItem(32, new ItemStack(Material.POWERED_MINECART));
		recipe5.setItem(33, new ItemStack(Material.STORAGE_MINECART));
		recipe5.setItem(34, new ItemStack(Material.RAILS));
		recipe5.setItem(35, new ItemStack(Material.POWERED_RAIL));
		recipe5.setItem(36, line);
		recipe5.setItem(37, line);
		recipe5.setItem(38, line);
		recipe5.setItem(39, line);
		recipe5.setItem(40, line);
		recipe5.setItem(41, line);
		recipe5.setItem(42, line);
		recipe5.setItem(43, line);
		recipe5.setItem(44, line);
		recipe5.setItem(45, previouspage);
		recipe5.setItem(53, nextpage);
		
		
		player.openInventory(recipe5);
	}
	
}
