package com.github.rmsy.bukkiteventdemo;

import com.github.rmsy.bukkiteventdemo.listeners.GenericListener;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nullable;
import java.util.logging.Logger;

/**
 * Plugin.
 */
public class BukkitEventDemo extends JavaPlugin {
    /**
     * Server console. Can be null if the plugin is not enabled.
     */
    @Nullable
    private Logger console;

    public void onDisable() {
        this.console = null;
        HandlerList.unregisterAll(this);
    }

    @Override
    public void onEnable() {
        this.console = getLogger();
        Bukkit.getPluginManager().registerEvents(new GenericListener(), this);
    }
}
