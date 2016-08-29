package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingMenu4 {

	public void openRecipe4(Player player){
		Inventory recipe4 = Bukkit.createInventory(null, 54, "Recipes Page: 4");
		
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
		
		recipe4.setItem(0, new ItemStack(Material.STAINED_CLAY, 1, (short)4));
		recipe4.setItem(1, new ItemStack(Material.STAINED_CLAY, 1, (short)5));
		recipe4.setItem(2, new ItemStack(Material.STAINED_CLAY, 1, (short)6));
		recipe4.setItem(3, new ItemStack(Material.STAINED_CLAY, 1, (short)7));
		recipe4.setItem(4, new ItemStack(Material.STAINED_CLAY, 1, (short)8));
		recipe4.setItem(5, new ItemStack(Material.STAINED_CLAY, 1, (short)9));
		recipe4.setItem(6, new ItemStack(Material.STAINED_CLAY, 1, (short)10));
		recipe4.setItem(7, new ItemStack(Material.STAINED_CLAY, 1, (short)11));
		recipe4.setItem(8, new ItemStack(Material.STAINED_CLAY, 1, (short)12));
		recipe4.setItem(9, new ItemStack(Material.STAINED_CLAY, 1, (short)13));
		recipe4.setItem(10, new ItemStack(Material.STAINED_CLAY, 1, (short)14));
		recipe4.setItem(11, new ItemStack(Material.STAINED_CLAY, 1, (short)15));
		recipe4.setItem(12, new ItemStack(Material.GLASS));
		recipe4.setItem(13, new ItemStack(Material.STAINED_GLASS));
		recipe4.setItem(14, new ItemStack(Material.STAINED_GLASS, 1, (short)1));
		recipe4.setItem(15, new ItemStack(Material.STAINED_GLASS, 1, (short)2));
		recipe4.setItem(16, new ItemStack(Material.STAINED_GLASS, 1, (short)3));
		recipe4.setItem(17, new ItemStack(Material.STAINED_GLASS, 1, (short)4));
		recipe4.setItem(18, new ItemStack(Material.STAINED_GLASS, 1, (short)5));
		recipe4.setItem(19, new ItemStack(Material.STAINED_GLASS, 1, (short)6));
		recipe4.setItem(20, new ItemStack(Material.STAINED_GLASS, 1, (short)7));
		recipe4.setItem(21, new ItemStack(Material.STAINED_GLASS, 1, (short)8));
		recipe4.setItem(22, new ItemStack(Material.STAINED_GLASS, 1, (short)9));
		recipe4.setItem(23, new ItemStack(Material.STAINED_GLASS, 1, (short)10));
		recipe4.setItem(24, new ItemStack(Material.STAINED_GLASS, 1, (short)11));
		recipe4.setItem(25, new ItemStack(Material.STAINED_GLASS, 1, (short)12));
		recipe4.setItem(26, new ItemStack(Material.STAINED_GLASS, 1, (short)13));
		recipe4.setItem(27, new ItemStack(Material.STAINED_GLASS, 1, (short)14));
		recipe4.setItem(28, new ItemStack(Material.STAINED_GLASS, 1, (short)15));
		recipe4.setItem(29, new ItemStack(Material.STONE, 1, (short)1));
		recipe4.setItem(30, new ItemStack(Material.STONE, 1, (short)3));
		recipe4.setItem(31, new ItemStack(Material.STONE, 1, (short)5));
		recipe4.setItem(32, new ItemStack(Material.STONE, 1, (short)2));
		recipe4.setItem(33, new ItemStack(Material.STONE, 1, (short)4));
		recipe4.setItem(34, new ItemStack(Material.STONE, 1, (short)6));
		recipe4.setItem(35, new ItemStack(Material.PRISMARINE));
		recipe4.setItem(36, line);
		recipe4.setItem(37, line);
		recipe4.setItem(38, line);
		recipe4.setItem(39, line);
		recipe4.setItem(40, line);
		recipe4.setItem(41, line);
		recipe4.setItem(42, line);
		recipe4.setItem(43, line);
		recipe4.setItem(44, line);
		recipe4.setItem(45, previouspage);
		recipe4.setItem(53, nextpage);
		
		player.openInventory(recipe4);
	}
	
}
