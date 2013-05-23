package com.github.rmsy.bukkiteventdemo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import javax.annotation.Nonnull;

/**
 * Generic event listener.
 */
public class GenericListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockBreak(@Nonnull final BlockBreakEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getDisplayName() + ChatColor.YELLOW + " broke a block!");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(@Nonnull final PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setDisplayName(ChatColor.RED + player.getName());
    }
}
