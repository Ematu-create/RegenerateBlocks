package me.ematu.regenerate;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

import me.ematu.regenerate.blocks.Others;

public class Events implements Listener{

	// #### QUIERE HACER UNA FLECHA EXPLOSIVA
	// QUE AL TIRARLA REGENERE LOS BLOQUES Y SUS INVENTARIOS
	
	@EventHandler
  	public void onEntityExplode(EntityExplodeEvent e) {
		FileConfiguration config = Main.getInstance().getConfig();
		List<String> mundos = config.getStringList("Worlds");
		String mundo = e.getEntity().getWorld().getName();
		
		for (int i=0;i<mundos.size();i++) {
			if(mundos.get(i).equals(mundo)) { // HACER UN FOR Y SI EL MUNDO EN EL QUE EXPLOTA ESTA EN LA CONFIG 
			
		  		for(Block b : e.blockList()) { 
		  			if(b.getType() != Material.TNT) { // UN FOR DE TODOS LOS BLOQUES QUE EXPLOTA Y SI SE DIFERENCIA DE TNT PARA NO REGENERAR LA TNT TAMBIEN
		  				
		  				// BLOCK STATE DE TODOS LOS BLOQUES PARA REGENERARLOS
		  				BlockState state = b.getState();
		  				state.setData(state.getData());
		  				
		  				// MATERIALS SACA LOS BLOQUES MAS IMPORTANTES ANTES QUE EL BLOCK STATE PARA GURADARLOS CON SUS COSAS
		  				// SU POSISICION, INVENTARIOS Y CARACTERISTICAS
		  				Main.materials(b, state);
		  				b.getLocation().clone();  
		                
		  				// DESPUES DE DESAPARECER LAS COSAS IMPORTANTES CON EL .materials SACAR EL RESTO DESPUES DE 4SEG
		  				Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
		                   public void run() {
		                    	b.setType(Material.AIR);
		                    	if(config.getString("Dropped").equals("false")) {
		                    		Others.clearItems(b);
		                    	}
		                    }
		                  },  4L);
		  				
		  				// BUKKIT SCHEDULER DETECTANDO EL TIMEPO EN LA CONFIG Y LUEGO UN state.update(true,false); PARA REGENERAR EL BLOCK STATE
		  				// LAS RESPACTIVAS CLASES YA DETECTAN EL TIEMPO DE LA CONFIG +20 PARA GENERAR LO IMPORTANTE DESPUES DE EL BLOCK STATE - (LO NO IMPORTANTE)
			  				long segundos = config.getLong("Time");
			                Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
			                    public void run() {
			                      state.update(true,false);
			                    	if(config.getString("Dropped").equals("false")) {
			                    		Others.clearItems(b);
			                    	}
			                    	// VERSION ES UNA CLASE PARA LOS SONIDOS, COMPATIBLES PARA 1.7.10 HASTA LA 1.18.9
			                      Version.version(state.getLocation());
			                    }
			                  },  segundos);        			
		  			}
		  		}
		  		return;
			}
		}
  	}
	
}
