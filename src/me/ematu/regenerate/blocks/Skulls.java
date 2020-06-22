package me.ematu.regenerate.blocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.Skull;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.ematu.regenerate.Main;

public class Skulls {

	@SuppressWarnings("deprecation")
	public static void cabezas(Block b, BlockState state) {
        if(b.getType().equals(Material.SKULL) || b.getType().equals(Material.SKULL_ITEM)) {
      	  Skull craneo = (Skull) b.getState();
      	  craneo.getData().clone();
      	  if(b.getLocation() != b.getLocation()) {	  
      		  Byte data = b.getData();
      		  b.setData(data);
      		  SkullType tipo = craneo.getSkullType();
      		  String textura = craneo.getOwner();
      		  BlockFace face = craneo.getRotation();
      		  craneo.setSkullType(tipo);
      		  craneo.setOwner(textura);
      		  craneo.setRotation(face);
      		      b.getDrops().clear();
	              b.setType(Material.AIR);
		           FileConfiguration config = Main.getInstance().getConfig();
		           long segundos = config.getLong("Time") + 20;
	               Bukkit.getScheduler().runTaskLater((Plugin)Main.getInstance(), new Runnable() {
	                    public void run() {
	                      if (state.getBlock().getType() == Material.SKULL || state.getBlock().getType() == Material.SKULL_ITEM) {
	                    	  Block regen = state.getBlock();
	                    	  Skull craneo = (Skull)regen.getState();
	                    	  craneo.setSkullType(tipo);
	                    	  craneo.setOwner(textura);
	                    	  craneo.setRotation(face);
	                    	  craneo.update();
	                      	}
	                    }
	                  },segundos);
      		  
      	  }	  
      		  }	  
      	  }
	
}
