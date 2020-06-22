package me.ematu.regenerate.blocks;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.banner.Pattern;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import me.ematu.regenerate.Main;

public class Banners {
	
	@SuppressWarnings("deprecation")
	public static void banners(Block b, BlockState state) {
        if(b.getType().equals(Material.BANNER) || b.getType().equals(Material.STANDING_BANNER) || b.getType().equals(Material.WALL_BANNER)) {
      	  Banner banner = (Banner) b.getState();
      	  banner.getData().clone();
      	  if(b.getLocation() != b.getLocation()) {	  
      		  Byte data = b.getData();
      		  b.setData(data);
      		  DyeColor colors = banner.getBaseColor();
      		  List<Pattern> patternsType = banner.getPatterns();
      		  banner.setBaseColor(colors);
      		  banner.setPatterns(patternsType);
      		  
      		      b.getDrops().clear();
	              b.setType(Material.AIR);
		           FileConfiguration config = Main.getInstance().getConfig();
		           long segundos = config.getLong("Time") + 20;
	               Bukkit.getScheduler().runTaskLater((Plugin)Main.getInstance(), new Runnable() {
	                    public void run() {
	                      if (state.getBlock().getType() == Material.BANNER || state.getBlock().getType() == Material.STANDING_BANNER || state.getBlock().getType() == Material.WALL_BANNER ) {
	                    	  Block regen = state.getBlock();
	                    	  Banner banner = (Banner)regen.getState();	
		            		  banner.setBaseColor(colors);
		            		  banner.setPatterns(patternsType);
	                    	  banner.update();
	                      	}
	                    }
	                  },segundos);
      		  
      	  }	  
      		  }	  
      	  }
}
