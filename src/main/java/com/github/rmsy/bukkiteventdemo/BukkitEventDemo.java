package com.github.rmsy.bukkiteventdemo;

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

    @Override
    public void onEnable() {
        this.console = getLogger();
    }

    public void onDisable() {
        this.console = null;
    }
}
