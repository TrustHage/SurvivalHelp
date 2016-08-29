package me.trusthage.survivalhelp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftCommand implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		
		if(!(sender instanceof Player))return false;
		Player player = (Player)sender;
		
		player.openWorkbench(null, true);
		
		return false;
	}

}
