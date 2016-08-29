package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class CraftingMenu7 {
	
	@SuppressWarnings("deprecation")
	public void openRecipe7(Player player){
		Inventory recipe7 = Bukkit.createInventory(null, 54, "Recipes Page: 7");
		
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
		
		Potion p = new Potion(PotionType.REGEN, 2);
		ItemStack regen = p.toItemStack(1);
		Potion p1 = new Potion(PotionType.SPEED, 2);
		ItemStack speed = p1.toItemStack(1);
		Potion p2 = new Potion(PotionType.FIRE_RESISTANCE, 2);
		ItemStack fire_resistance = p2.toItemStack(1);
		Potion p3 = new Potion(PotionType.POISON, 2);
		ItemStack poison = p3.toItemStack(1);
		Potion p4 = new Potion(PotionType.INSTANT_HEAL, 2);
		ItemStack instant_heal = p4.toItemStack(1);
		Potion p5 = new Potion(PotionType.NIGHT_VISION, 2);
		ItemStack night_vision = p5.toItemStack(1);
		Potion p6 = new Potion(PotionType.WEAKNESS, 2);
		ItemStack weakness = p6.toItemStack(1);
		Potion p7 = new Potion(PotionType.STRENGTH, 2);
		ItemStack strength = p7.toItemStack(1);
		Potion p8 = new Potion(PotionType.SLOWNESS, 2);
		ItemStack slowness = p8.toItemStack(1);
		Potion p9 = new Potion(PotionType.JUMP, 2);
		ItemStack jump = p9.toItemStack(1);
		Potion p10 = new Potion(PotionType.INSTANT_DAMAGE, 2);
		ItemStack instant_damage = p10.toItemStack(1);
		Potion p11 = new Potion(PotionType.WATER_BREATHING, 2);
		ItemStack water_breathing = p11.toItemStack(1);
		Potion p12 = new Potion(PotionType.INVISIBILITY, 2);
		ItemStack invisibility = p12.toItemStack(1);
		
		Potion p13 = new Potion(PotionType.REGEN, 2);
		ItemStack regen2 = p13.toItemStack(1);
		Potion p14 = new Potion(PotionType.SPEED, 2);
		ItemStack speed2 = p14.toItemStack(1);
		Potion p15 = new Potion(PotionType.POISON, 2);
		ItemStack poison2 = p15.toItemStack(1);
		Potion p16 = new Potion(PotionType.INSTANT_HEAL, 2);
		ItemStack instant_heal2 = p16.toItemStack(1);
		Potion p17 = new Potion(PotionType.STRENGTH, 2);
		ItemStack strength2 = p17.toItemStack(1);
		Potion p18 = new Potion(PotionType.JUMP, 2);
		ItemStack jump2 = p18.toItemStack(1);
		Potion p19 = new Potion(PotionType.INSTANT_DAMAGE, 2);
		ItemStack instant_damage2 = p19.toItemStack(1);
		
		recipe7.setItem(0, new ItemStack(Material.ARROW));
		recipe7.setItem(1, new ItemStack(Material.IRON_BARDING));
		recipe7.setItem(2, new ItemStack(Material.GOLD_BARDING));
		recipe7.setItem(3, new ItemStack(Material.DIAMOND_BARDING));
		recipe7.setItem(4, new ItemStack(Material.GLASS_BOTTLE));
		recipe7.setItem(5, new ItemStack(Material.CAULDRON));
		recipe7.setItem(6, new ItemStack(Material.BREWING_STAND));
		recipe7.setItem(7, new ItemStack(Material.SPECKLED_MELON));
		recipe7.setItem(8, new ItemStack(Material.BLAZE_POWDER));
		recipe7.setItem(9, new ItemStack(Material.FERMENTED_SPIDER_EYE));
		recipe7.setItem(10, new ItemStack(Material.MAGMA_CREAM));
		
		recipe7.setItem(11, regen);
		recipe7.setItem(12, speed);
		recipe7.setItem(13, fire_resistance);
		recipe7.setItem(14, poison);
		recipe7.setItem(15, instant_heal);
		recipe7.setItem(16, night_vision);
		recipe7.setItem(17, weakness);
		recipe7.setItem(18, strength);
		recipe7.setItem(19, slowness);
		recipe7.setItem(20, jump);
		recipe7.setItem(21, instant_damage);
		recipe7.setItem(22, water_breathing);
		recipe7.setItem(23, invisibility);
		
		recipe7.setItem(24, regen2);
		recipe7.setItem(25, speed2);
		recipe7.setItem(26, poison2);
		recipe7.setItem(27, instant_heal2);
		recipe7.setItem(28, strength2);
		recipe7.setItem(29, jump2);
		recipe7.setItem(30, instant_damage);
		
		recipe7.setItem(36, line);
		recipe7.setItem(37, line);
		recipe7.setItem(38, line);
		recipe7.setItem(39, line);
		recipe7.setItem(40, line);
		recipe7.setItem(41, line);
		recipe7.setItem(42, line);
		recipe7.setItem(43, line);
		recipe7.setItem(44, line);
		recipe7.setItem(45, previouspage);
		recipe7.setItem(53, nextpage);
		
		player.openInventory(recipe7);
	}

}
