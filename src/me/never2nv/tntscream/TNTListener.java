package me.never2nv.tntscream;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class TNTListener implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockPlace(BlockPlaceEvent event){
		if (event.isCancelled()) return;
		
		if (event.getBlock().getType() == Material.TNT){
			event.setCancelled(true);
			
			Player player = event.getPlayer();
			
			player.chat("Hey, I just tried to place " + ChatColor.DARK_RED + "TNT!");
			
			}
		
		if (event.getBlock().getType() == Material.BEDROCK){
			event.setCancelled(true);
			
			Player player = event.getPlayer();
			
			player.chat("Hey, I just tried to place " + ChatColor.DARK_RED + "BEDROCK!");
			
			}
		
		if (event.getBlock().getType() == Material.LAVA_BUCKET){
			event.setCancelled(true);
			
			Player player = event.getPlayer();
			
			player.chat("Hey, I just placed a " + ChatColor.DARK_RED + "LAVA BUCKET!");
			
			}
		
		if (event.getBlock().getType() == Material.FLINT_AND_STEEL){
			event.setCancelled(false);
			
			Player player = event.getPlayer();
			
			player.chat("Hey, I just lit a fire with " + ChatColor.DARK_RED + "FLINT & STEEL!");
			
			}
			
		}
		                       
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onExplosionsPrime(ExplosionPrimeEvent event){
		if (event.isCancelled()) return;
		
		if (event.getEntity() instanceof TNTPrimed){
			event.setCancelled(true);

		}
	}
}
