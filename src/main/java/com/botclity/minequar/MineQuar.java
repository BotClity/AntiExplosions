package com.botclity.minequar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MineQuar extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Explosions(),this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
