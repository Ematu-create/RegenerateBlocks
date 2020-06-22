package me.ematu.regenerate.blocks;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Hopper;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.ematu.regenerate.Main;


public class Hoppers {

	@SuppressWarnings("deprecation")
	public static void tolva(Block b, BlockState state) {
		if(b.getType() == Material.HOPPER || b.getType() == Material.HOPPER_MINECART) {
	      	  Hopper tolva = (Hopper) b.getState();    
	        	Byte data = b.getData();b.setData(data);
	    		  if(b.getLocation() != b.getLocation()) {
	    			  Inventory inv = Bukkit.createInventory(null, InventoryType.HOPPER, tolva.getBlock().getType().name());
	    			  
	            	  inv.setContents(tolva.getInventory().getContents());
	            	  ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
	      	    	  for(ItemStack i : inv.getContents())
	    	          {
	    	    		if(i != null)
	    	           {
	    	    		stacks.add(i);
	    	    		}
	    	    	 }
	              	tolva.getInventory().clear();	  
		             b.getDrops().clear();
		             b.setType(Material.AIR);
			           FileConfiguration config = Main.getInstance().getConfig();
			           long segundos = config.getLong("Time") + 20;
		                Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
		                    public void run() {
		                        if(state.getBlock().getType() == Material.HOPPER) {
		                         	Block reg = state.getBlock();
		                         	reg.setType(Material.HOPPER);
		                         	reg.setData(data);
		                         	Hopper hop = (Hopper)reg.getState();
		                            Inventory inven = hop.getInventory();                 	  
		                         	inven.setContents(inv.getContents());
		                           } 
		                        if(state.getBlock().getType() == Material.HOPPER_MINECART) {
		                         	Block reg = state.getBlock();
		                         	reg.setType(Material.HOPPER_MINECART);
		                         	reg.setData(data);
		                         	Hopper hop = (Hopper)reg.getState();
		                            Inventory inven = hop.getInventory();                 	  
		                         	inven.setContents(inv.getContents());
		                           } 
		                    }
		                  },  segundos);            
	    		  }
	      	  
			}	
}
	
}
