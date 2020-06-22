package me.ematu.regenerate;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Comando implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	    if (!(sender instanceof Player)) {
			  if(args.length == 0) {
				  System.out.println("RegenerateBLocks: Try with: /tnt reload");
				  return true;	  
			   }
			  if(args.length == 1) {
				  if(args[0].equalsIgnoreCase("reload")) {
				     System.out.println("RegenerateBLocks: ¡Config reloaded!");
				     System.out.println("RegenerateBLocks: ¡Config reloaded!");
				     Main.getInstance().reloadConfig();
				     Main.getInstance().reloadConfig();
				     return true;
				    }
			   }
	      } 
	      Player player = (Player)sender;
		  if(args.length == 0) {
			  player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8»&cTry with: /tnt reload!"));	
			  return true;	  
		   }
		  if(args.length == 1) {
			  if(args[0].equalsIgnoreCase("reload")) {
				  Main.getInstance().reloadConfig();
				  Main.getInstance().reloadConfig();
				  player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8»&a¡Config reloaded!")); 
				  return true; 
			  }
			}
	     return true;
	}

}
