package me.ematu.regenerate.blocks;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.ematu.regenerate.Main;

public class Chests {
	
	
	@SuppressWarnings("deprecation")
	public static void cofres(Block b, BlockState state) {
			if(b.getType() == Material.CHEST || b.getType() == Material.TRAPPED_CHEST) {
		      	  Chest cofres = (Chest) b.getState();
	  				Byte data = b.getData();
	  				b.setData(data);	  
		      	    cofres.getBlockInventory().getContents().clone();    
		    		  if(b.getLocation() != b.getLocation()) {
		    			  Inventory inv = Bukkit.createInventory(null, cofres.getInventory().getSize(), cofres.getBlock().getType().name());
		            	  inv.setContents(cofres.getBlockInventory().getContents());
		            	  ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
		      	    	  for(ItemStack i : inv.getContents())
		    	          {
		    	    		if(i != null)
		    	           {
		    	    		stacks.add(i);
		    	    		}
		    	    	 }
		              	cofres.getBlockInventory().clear();	  
			             b.getDrops().clear();
			             b.setType(Material.AIR);
				           FileConfiguration config = Main.getInstance().getConfig();
				           long segundos = config.getLong("Time") + 20;
				           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
			                    public void run() {
			                        if(state.getBlock().getType() == Material.CHEST) {
			                         	Block reg = state.getBlock();
			                         	reg.setType(Material.CHEST);
			                         	reg.setData(data);
			                         	Chest chest = (Chest)reg.getState();
			                            Inventory inven = chest.getInventory();                 	  
			                         	inven.setContents(inv.getContents());
			                           } 
			                        if(state.getBlock().getType() == Material.TRAPPED_CHEST) {
			                         	Block reg = state.getBlock();
			                         	reg.setType(Material.TRAPPED_CHEST);
			                         	reg.setData(data);
			                         	Chest chest = (Chest)reg.getState();
			                            Inventory inven = chest.getInventory();                 	  
			                         	inven.setContents(inv.getContents());
			                           } 
			                      }
			                  }, segundos);           
		    		     } 	  
				  }	
	   	}
	
}
