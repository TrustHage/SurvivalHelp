package me.trusthage.survivalhelp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class CraftingListener implements Listener{
	
	RecipeCommand recipe = new RecipeCommand();
	CraftingMenu menu = new CraftingMenu();
	
	@EventHandler
	public void onCraftClick(InventoryClickEvent e){
		if (!(e.getInventory().getName()).equalsIgnoreCase("Crafting")) return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR)) return;
		
		switch(e.getCurrentItem().getType()){
		case IRON_BLOCK:
			recipe.openIronBlock(player.getPlayer());
			break;
		case IRON_INGOT:
			recipe.openIronIngot(player.getPlayer());
			break;
		default:
			e.setCancelled(true);
		}
		
		
	}
	
	@EventHandler
	public void BookClick(PlayerInteractEvent e){
		Player player = (Player)e.getPlayer();
		if(ChatColor.stripColor(e.getItem().getItemMeta().getDisplayName()).equals("Recipe Book")){
			e.setCancelled(true);
			menu.openRecipe(player.getPlayer());
		}else{
			return;
		}
	}
	
	@EventHandler
	public void onCraftMenuClick(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		
		switch(e.getCurrentItem().getType()){
		case IRON_BLOCK:
			recipe.openIronBlock(player.getPlayer());
			break;
		case IRON_INGOT:
			recipe.openIronIngot(player.getPlayer());
			break;
		case ANVIL:
			recipe.openAnvil(player.getPlayer());
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}

}
