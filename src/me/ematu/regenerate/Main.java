package me.ematu.regenerate;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.ematu.regenerate.blocks.Banners;
import me.ematu.regenerate.blocks.Chests;
import me.ematu.regenerate.blocks.Dispensers;
import me.ematu.regenerate.blocks.Droppers;
import me.ematu.regenerate.blocks.Furnaces;
import me.ematu.regenerate.blocks.Hoppers;
import me.ematu.regenerate.blocks.JukeBox;
import me.ematu.regenerate.blocks.Others;
import me.ematu.regenerate.blocks.Signs;
import me.ematu.regenerate.blocks.Skulls;

public class Main
  extends JavaPlugin
  implements Listener
{

	private static Main instance;
	public String rutaConfig;
  	public void onEnable()
  	{  
	    instance = this;
	    registerConfig();
  		Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
  		Bukkit.getServer().getPluginCommand("tnt").setExecutor(new Comando());
  	}
  	
  	public void onDisable()
  	{
  		
  	}

  	public static void materials(Block b, BlockState state) {
		Others.otrosbloques(b, state);
		Chests.cofres(b, state);
		Signs.carteles(b, state);
		Hoppers.tolva(b, state);
		Furnaces.horno(b, state);
		Droppers.soltador(b, state);
		Dispensers.dispensador(b, state);
		Banners.banners(b, state);
		Skulls.cabezas(b, state);
		JukeBox.tocadiscos(b, state);
	}
  	 	
    public void registerConfig()
    {
      File config = new File(getDataFolder(), "config.yml");
      this.rutaConfig = config.getPath();
      if (!config.exists())
      {
        getConfig().options().copyDefaults(true);
        saveConfig();
      }
    }

    public static Main getInstance() {
        return instance;
      }
}