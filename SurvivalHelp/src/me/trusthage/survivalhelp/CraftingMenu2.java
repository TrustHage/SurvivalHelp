package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu2 {
	
	public void openRecipe2(Player player){
		Inventory recipe2 = Bukkit.createInventory(null, 54, "Recipes Page: 2");
		
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
		
		recipe2.setItem(0, new ItemStack(Material.DARK_OAK_DOOR));
		recipe2.setItem(1, new ItemStack(Material.WOOD_PICKAXE));
		recipe2.setItem(2, new ItemStack(Material.STONE_PICKAXE));
		recipe2.setItem(3, new ItemStack(Material.IRON_PICKAXE));
		recipe2.setItem(4, new ItemStack(Material.GOLD_PICKAXE));
		recipe2.setItem(5, new ItemStack(Material.DIAMOND_PICKAXE));
		recipe2.setItem(6, new ItemStack(Material.WOOD_SPADE));
		recipe2.setItem(7, new ItemStack(Material.STONE_SPADE));
		recipe2.setItem(8, new ItemStack(Material.IRON_SPADE));
		recipe2.setItem(9, new ItemStack(Material.GOLD_SPADE));
		recipe2.setItem(10, new ItemStack(Material.DIAMOND_SPADE));
		recipe2.setItem(11, new ItemStack(Material.WOOD_AXE));
		recipe2.setItem(12, new ItemStack(Material.STONE_AXE));
		recipe2.setItem(13, new ItemStack(Material.IRON_AXE));
		recipe2.setItem(14, new ItemStack(Material.GOLD_AXE));
		recipe2.setItem(15, new ItemStack(Material.DIAMOND_AXE));
		recipe2.setItem(16, new ItemStack(Material.WOOD_HOE));
		recipe2.setItem(17, new ItemStack(Material.STONE_HOE));
		recipe2.setItem(18, new ItemStack(Material.IRON_HOE));
		recipe2.setItem(19, new ItemStack(Material.GOLD_HOE));
		recipe2.setItem(20, new ItemStack(Material.DIAMOND_HOE));
		recipe2.setItem(21, new ItemStack(Material.FISHING_ROD));
		recipe2.setItem(22, new ItemStack(Material.FLINT_AND_STEEL));
		recipe2.setItem(23, new ItemStack(Material.SHEARS));
		recipe2.setItem(24, new ItemStack(Material.BUCKET));
		recipe2.setItem(25, new ItemStack(Material.COMPASS));
		recipe2.setItem(26, new ItemStack(Material.WATCH));
		recipe2.setItem(27, new ItemStack(Material.MAP));
		recipe2.setItem(28, new ItemStack(Material.GLOWSTONE));
		recipe2.setItem(29, new ItemStack(Material.SNOW_BLOCK));
		recipe2.setItem(30, new ItemStack(Material.SMOOTH_BRICK));
		recipe2.setItem(31, new ItemStack(Material.BRICK));
		recipe2.setItem(32, new ItemStack(Material.SANDSTONE));
		recipe2.setItem(33, new ItemStack(Material.SANDSTONE, 1, (short)2));
		recipe2.setItem(34, new ItemStack(Material.SANDSTONE, 1, (short)1));
		recipe2.setItem(35, new ItemStack(Material.GOLD_BLOCK));
		recipe2.setItem(36, line);
		recipe2.setItem(37, line);
		recipe2.setItem(38, line);
		recipe2.setItem(39, line);
		recipe2.setItem(40, line);
		recipe2.setItem(41, line);
		recipe2.setItem(42, line);
		recipe2.setItem(43, line);
		recipe2.setItem(44, line);
		recipe2.setItem(45, previouspage);
		recipe2.setItem(53, nextpage);
		
		player.openInventory(recipe2);
	}

}
