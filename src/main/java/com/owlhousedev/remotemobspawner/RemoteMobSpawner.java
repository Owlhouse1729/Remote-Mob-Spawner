package com.owlhousedev.remotemobspawner;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RemoteMobSpawner extends JavaPlugin {
    RemoteMobSpawner instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        Bukkit.getLogger().info(ChatColor.GRAY + "RemoteMobSpawner Loaded.");
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
    }
}
