package me.trusthage.survivalhelp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RecipeCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player))return false;
		Player player = (Player)sender;
		
		openAnvil(player.getPlayer());
		
		return false;
	}
	
	public void openAnvil(Player player){
		Inventory anvilcrft = Bukkit.createInventory(null, InventoryType.WORKBENCH);
		
		ItemStack ironingot = new ItemStack(Material.IRON_INGOT);
		ItemStack ironblock = new ItemStack(Material.IRON_BLOCK);
		ItemStack anvil = new ItemStack(Material.ANVIL);
		
		anvilcrft.setItem(0, anvil);
		anvilcrft.setItem(1, ironblock);
		anvilcrft.setItem(2, ironblock);
		anvilcrft.setItem(3, ironblock);
		anvilcrft.setItem(5, ironingot);
		anvilcrft.setItem(7, ironingot);
		anvilcrft.setItem(8, ironingot);
		anvilcrft.setItem(9, ironingot);
		
		player.openInventory(anvilcrft);
	}
	
	public void openIronBlock(Player player){
		Inventory ironblockcrft = Bukkit.createInventory(null, InventoryType.WORKBENCH);
		
		ItemStack ironblock = new ItemStack(Material.IRON_BLOCK);
		ItemStack ironingot = new ItemStack(Material.IRON_INGOT);
		
		ironblockcrft.setItem(1, ironingot);
		ironblockcrft.setItem(2, ironingot);
		ironblockcrft.setItem(3, ironingot);
		ironblockcrft.setItem(4, ironingot);
		ironblockcrft.setItem(5, ironingot);
		ironblockcrft.setItem(6, ironingot);
		ironblockcrft.setItem(7, ironingot);
		ironblockcrft.setItem(8, ironingot);
		ironblockcrft.setItem(9, ironingot);
		ironblockcrft.setItem(0, ironblock);
		
		player.openInventory(ironblockcrft);
	}
	
	public void openIronIngot(Player player){
		Inventory ironingotcrft = Bukkit.createInventory(null, InventoryType.FURNACE);
		
		ItemStack ironore = new ItemStack(Material.IRON_ORE);
		ItemStack coal = new ItemStack(Material.COAL);
		ItemStack ironingot = new ItemStack(Material.IRON_INGOT);
		
		ironingotcrft.setItem(0, ironore);
		ironingotcrft.setItem(1, coal);
		ironingotcrft.setItem(2, ironingot);
			
		player.openInventory(ironingotcrft);
	}

}
