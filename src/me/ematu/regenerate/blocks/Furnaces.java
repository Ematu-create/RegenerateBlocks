package me.ematu.regenerate.blocks;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Furnace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.ematu.regenerate.Main;

public class Furnaces {

	@SuppressWarnings("deprecation")
	public static void horno(Block b, BlockState state) {
		if(b.getType() == Material.FURNACE) {
	      	  Furnace horno = (Furnace) b.getState();
				Byte data = b.getData();b.setData(data);
	    		  if(b.getLocation() != b.getLocation()) {
	    			  Inventory inv = Bukkit.createInventory(null, InventoryType.FURNACE, horno.getBlock().getType().name());
	    			  
	            	  inv.setContents(horno.getInventory().getContents());
	            	  ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
	      	    	  for(ItemStack i : inv.getContents())
	    	          {
	    	    		if(i != null)
	    	           {
	    	    		stacks.add(i);
	    	    		}
	    	    	 }
	              	horno.getInventory().clear();	  
		             b.getDrops().clear();
		             b.setType(Material.AIR);
			           FileConfiguration config = Main.getInstance().getConfig();
			           long segundos = config.getLong("Time") + 20;
		                Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
		                    public void run() {
		                        if(state.getBlock().getType() == Material.FURNACE) {
		                         	Block reg = state.getBlock();
		                         	reg.setType(Material.FURNACE);
		                         	reg.setData(data);
		                         	Furnace furn = (Furnace)reg.getState();
		                            Inventory inven = furn.getInventory();                 	  
		                         	inven.setContents(inv.getContents());
		                           } 
		                    }
		                  },  segundos);            
	    		  }
	      	  
			}	
}
	
}
