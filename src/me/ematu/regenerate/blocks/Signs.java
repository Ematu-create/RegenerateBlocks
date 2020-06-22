package me.ematu.regenerate.blocks;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.ematu.regenerate.Main;

public class Signs {

	public static void carteles(Block b, BlockState state) {
            if(b.getType().equals(Material.SIGN) || b.getType().equals(Material.SIGN_POST) || b.getType().equals(Material.WALL_SIGN)) {
          	  Sign signo = (Sign) b.getState();
          	  signo.getLines().clone();
          	  if(b.getLocation() != b.getLocation()) {	  
          		  ArrayList<String> lineas = new ArrayList<String>();
          		  for(int i=0;i<4;i++) {
          			  lineas.add(signo.getLine(i));
          		  }
          		  b.getDrops().clear();
  	              b.setType(Material.AIR);
  		           FileConfiguration config = Main.getInstance().getConfig();
  		           long segundos = config.getLong("Time") + 20;
  	              Bukkit.getScheduler().runTaskLater((Plugin)Main.getInstance(), new Runnable() {
  	                    public void run() {
  	                      if (state.getBlock().getType() == Material.SIGN || state.getBlock().getType() == Material.SIGN_POST || state.getBlock().getType() == Material.WALL_SIGN ) {
  	                    	  Block regen = state.getBlock();
  	                    	  Sign signo = (Sign)regen.getState();
  		            		  for(int i=0;i<lineas.size();i++) {
  		            			  signo.setLine(i, lineas.get(i));
  		            		  }   signo.update();
  	                      	}
  	                    }
  	                  },segundos);
          		  
          	  }	  
          		  }	  
          	  }
	}
