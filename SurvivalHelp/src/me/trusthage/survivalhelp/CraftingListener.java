package me.trusthage.survivalhelp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CraftingListener implements Listener{
	
	RecipeCommand recipe = new RecipeCommand();
	
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

}
