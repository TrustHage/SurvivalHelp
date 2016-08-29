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
	CraftingMenu2 menu2 = new CraftingMenu2();
	CraftingMenu3 menu3 = new CraftingMenu3();
	CraftingMenu4 menu4 = new CraftingMenu4();
	CraftingMenu5 menu5 = new CraftingMenu5();
	CraftingMenu6 menu6 = new CraftingMenu6();
	CraftingMenu7 menu7 = new CraftingMenu7();
	CraftingMenu8 menu8 = new CraftingMenu8();
	
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
			break;
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
	public void onFurnaceClick(InventoryClickEvent e){
		if (!(e.getInventory().getName()).equalsIgnoreCase("Furnace")) return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType() == Material.AIR)) return;
		
		switch(e.getCurrentItem().getType()){
		default:
			e.setCancelled(true);
			break;
		}
		
		
	}
	
	@EventHandler
	public void onRecipeClick(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 1")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			menu2.openRecipe2(player.getPlayer());
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe2Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 2")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu3.openRecipe3(player.getPlayer());
			}else{
				menu.openRecipe(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe3Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 3")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu4.openRecipe4(player.getPlayer());
			}else{
				menu2.openRecipe2(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe4Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 4")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu5.openRecipe5(player.getPlayer());
			}else{
				menu3.openRecipe3(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe5Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 5")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu6.openRecipe6(player.getPlayer());
			}else{
				menu4.openRecipe4(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe6Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 6")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu7.openRecipe7(player.getPlayer());
			}else{
				menu5.openRecipe5(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe7Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 7")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				menu8.openRecipe8(player.getPlayer());
			}else{
				menu6.openRecipe6(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}
	
	@EventHandler
	public void onRecipe8Click(InventoryClickEvent e){
		if(!(e.getInventory().getName().equals("Recipes Page: 8")))return;
		
		Player player = (Player)e.getWhoClicked();
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)return;
		switch(e.getCurrentItem().getType()){
		case ENDER_PEARL:
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("Next Page")){
				
			}else{
				menu7.openRecipe7(player.getPlayer());
			}
			break;
		default:
			e.setCancelled(true);
			break;
		}
	}

}
