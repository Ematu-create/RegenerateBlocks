package me.ematu.regenerate.blocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import me.ematu.regenerate.Main;

public class Others {

	@SuppressWarnings("deprecation")
	public static void otrosbloques(Block b, BlockState state) {
		
		if(b.getType().equals(Material.CARPET)) {
     	   Byte data = b.getData();b.setData(data);
   	       b.setType(Material.AIR); 
           b.getDrops().clear();
           FileConfiguration config = Main.getInstance().getConfig();
           long segundos = config.getLong("Time") + 20;
           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
               @SuppressWarnings("unlikely-arg-type")
				public void run() {
                    state.update(true,false);
                    b.setData(data);
                    state.getBlock().getDrops().clear();
                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
                  }
             },  segundos);
		}
		
		if(b.getType().equals(Material.REDSTONE_COMPARATOR_ON)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.RED_ROSE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.REDSTONE_COMPARATOR_ON)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.DOUBLE_PLANT)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.LONG_GRASS)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.YELLOW_FLOWER)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.REDSTONE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.STONE_PLATE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WOOD_PLATE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.GOLD_PLATE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.IRON_PLATE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.ACACIA_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.BIRCH_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.DARK_OAK_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.IRON_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.IRON_DOOR_BLOCK)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.JUNGLE_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.SPRUCE_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.TRAP_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WOODEN_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WOOD_DOOR)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.ACTIVATOR_RAIL)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.RAILS)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.DETECTOR_RAIL)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.POWERED_RAIL)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.TRIPWIRE_HOOK)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.STRING)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.DETECTOR_RAIL)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.TRIPWIRE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.TORCH)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.LEVER)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.STONE_BUTTON)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WOOD_BUTTON)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.BROWN_MUSHROOM)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.HUGE_MUSHROOM_1)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.HUGE_MUSHROOM_2)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.MUSHROOM_SOUP)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.RED_MUSHROOM)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.DEAD_BUSH)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.SAPLING)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WATER_LILY)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.VINE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.SUGAR_CANE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.SUGAR_CANE_BLOCK)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.WATCH)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.POTATO)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.REDSTONE_WIRE)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.CACTUS)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.LEATHER)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
		}
		if(b.getType().equals(Material.LADDER)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
        }
		if(b.getType().equals(Material.REDSTONE_TORCH_ON)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
     }
		if(b.getType().equals(Material.REDSTONE_TORCH_OFF)) {
	     	   Byte data = b.getData();b.setData(data);
	   	       b.setType(Material.AIR); 
	           b.getDrops().clear();
	           FileConfiguration config = Main.getInstance().getConfig();
	           long segundos = config.getLong("Time") + 20;
	           Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
	               @SuppressWarnings("unlikely-arg-type")
					public void run() {
	                    state.update(true,false);
	                    b.setData(data);
	                    state.getBlock().getDrops().clear();
	                    state.getBlock().getDrops().remove(state.getBlock().getDrops());
	                  }
	             },  segundos);
       }
	}
	
	
	public static void clearItems(Block b) {
		for(Entity e : b.getWorld().getEntities()) {
			if(e.getType() == EntityType.DROPPED_ITEM) {
						if(e.getLocation().distance(b.getLocation()) <= 1) {
							e.remove();
						}	
						if(e.getLocation().distance(b.getLocation().add(0,1,0)) <= 2) {
							e.remove();
						}
			}		
		}
	}
	
	
}
