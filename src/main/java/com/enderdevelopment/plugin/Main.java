package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MakataBGSMP plugin has been enabled!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("MakataBGSMP plugin has been disabled!");
    }
}