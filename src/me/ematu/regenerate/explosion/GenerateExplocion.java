package me.ematu.regenerate.explosion;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;

public class GenerateExplocion {

	public void generateExplodeRegen(Location location, int radius) {	
		TNTPrimed TNT = (TNTPrimed) location.getWorld().spawnEntity(location, EntityType.PRIMED_TNT);
		TNT.setYield(radius);
		TNT.setFuseTicks(0);
	}
	
}
