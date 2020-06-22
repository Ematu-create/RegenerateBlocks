package me.ematu.regenerate.blocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Jukebox;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.ematu.regenerate.Main;

public class JukeBox {

	@SuppressWarnings("deprecation")
	public static void tocadiscos(Block b, BlockState state) {
        if(b.getType().equals(Material.JUKEBOX)) {
      	  Jukebox tocadiscos = (Jukebox) b.getState();
      	  tocadiscos.getData().clone();
      	  if(b.getLocation() != b.getLocation()) {	  
      		  Byte data = b.getData();
      		  b.setData(data);
      		  Material cancion = tocadiscos.getPlaying();
      		  tocadiscos.setPlaying(cancion);
      		      b.getDrops().clear();
	              b.setType(Material.AIR);
		           FileConfiguration config = Main.getInstance().getConfig();
		           long segundos = config.getLong("Time") + 20;
	               Bukkit.getScheduler().runTaskLater((Plugin)Main.getInstance(), new Runnable() {
	                    public void run() {
	                      if (state.getBlock().getType() == Material.JUKEBOX) {
	                    	  Block regen = state.getBlock();
	                    	  Jukebox craneo = (Jukebox)regen.getState();
	                    	  craneo.setPlaying(cancion);
	                    	  craneo.update();
	                      	}
	                    }
	                  },segundos);
      		  
      	  }	  
      		  }	  
      	  }
	
	
	
}
