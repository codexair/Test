package ru.hyper.testplugin.listeners;

import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListeners implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        player.sendMessage("Блок поставлен: " + block.getX() + " " + block.getY() + " " + block.getZ());
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        player.sendMessage("Блок сломан: " + block.getX() + " " + block.getY() + " " + block.getZ());
        player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 1, 1);
    }
}
