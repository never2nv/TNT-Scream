package me.never2nv.tntscream;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TNTScream extends JavaPlugin {
	
	public void onEnable() {
		PluginManager manager = this.getServer().getPluginManager();
		
		manager.registerEvents(new TNTListener(), this);
	}
	
	public void onDisable() {
		
	}
}
