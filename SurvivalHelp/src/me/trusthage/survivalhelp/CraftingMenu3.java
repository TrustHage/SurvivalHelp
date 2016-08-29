package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu3 {
	
	public void openRecipe3(Player player){
		Inventory recipe3 = Bukkit.createInventory(null, 54, "Recipes Page: 3");
		
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
		
		recipe3.setItem(0, new ItemStack(Material.DIAMOND_BLOCK));
		recipe3.setItem(1, new ItemStack(Material.IRON_BLOCK));
		recipe3.setItem(2, new ItemStack(Material.LAPIS_BLOCK));
		recipe3.setItem(3, new ItemStack(Material.EMERALD_BLOCK));
		recipe3.setItem(4, new ItemStack(Material.COAL_BLOCK));
		recipe3.setItem(5, new ItemStack(Material.WOOL));
		recipe3.setItem(6, new ItemStack(Material.BOOKSHELF));
		recipe3.setItem(7, new ItemStack(Material.NOTE_BLOCK));
		recipe3.setItem(8, new ItemStack(Material.CLAY));
		recipe3.setItem(9, new ItemStack(Material.JACK_O_LANTERN));
		recipe3.setItem(10, new ItemStack(Material.TNT));
		recipe3.setItem(11, new ItemStack(Material.WOOD_STAIRS));
		recipe3.setItem(12, new ItemStack(Material.SPRUCE_WOOD_STAIRS));
		recipe3.setItem(13, new ItemStack(Material.BIRCH_WOOD_STAIRS));
		recipe3.setItem(14, new ItemStack(Material.JUNGLE_WOOD_STAIRS));
		recipe3.setItem(15, new ItemStack(Material.ACACIA_STAIRS));
		recipe3.setItem(16, new ItemStack(Material.DARK_OAK_STAIRS));
		recipe3.setItem(17, new ItemStack(Material.COBBLESTONE_STAIRS));
		recipe3.setItem(18, new ItemStack(Material.BRICK_STAIRS));
		recipe3.setItem(19, new ItemStack(Material.SMOOTH_STAIRS));
		recipe3.setItem(20, new ItemStack(Material.SANDSTONE_STAIRS));
		recipe3.setItem(21, new ItemStack(Material.QUARTZ_STAIRS));
		recipe3.setItem(22, new ItemStack(Material.RED_SANDSTONE_STAIRS));
		recipe3.setItem(23, new ItemStack(Material.COBBLE_WALL));
		recipe3.setItem(24, new ItemStack(Material.COBBLE_WALL, 1, (short)1));
		recipe3.setItem(25, new ItemStack(Material.REDSTONE_BLOCK));
		recipe3.setItem(26, new ItemStack(Material.NETHER_BRICK));
		recipe3.setItem(27, new ItemStack(Material.QUARTZ_BLOCK));
		recipe3.setItem(28, new ItemStack(Material.QUARTZ_BLOCK, 1, (short)1));
		recipe3.setItem(29, new ItemStack(Material.QUARTZ_BLOCK, 1, (short)2));
		recipe3.setItem(30, new ItemStack(Material.HAY_BLOCK));
		recipe3.setItem(31, new ItemStack(Material.HARD_CLAY));
		recipe3.setItem(32, new ItemStack(Material.STAINED_CLAY));
		recipe3.setItem(33, new ItemStack(Material.STAINED_CLAY, 1, (short)1));
		recipe3.setItem(34, new ItemStack(Material.STAINED_CLAY, 1, (short)2));
		recipe3.setItem(35, new ItemStack(Material.STAINED_CLAY, 1, (short)3));
		recipe3.setItem(36, line);
		recipe3.setItem(37, line);
		recipe3.setItem(38, line);
		recipe3.setItem(39, line);
		recipe3.setItem(40, line);
		recipe3.setItem(41, line);
		recipe3.setItem(42, line);
		recipe3.setItem(43, line);
		recipe3.setItem(44, line);
		recipe3.setItem(45, previouspage);
		recipe3.setItem(53, nextpage);
		
		player.openInventory(recipe3);
	}

}
