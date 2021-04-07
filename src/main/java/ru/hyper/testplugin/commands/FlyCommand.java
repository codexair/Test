package ru.hyper.testplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Console doesn't work :) ");
            return true;
        }

        Player p = (Player) sender;
        if(args.length == 0) {
            p.setFlying(true);
            p.sendMessage(ChatColor.GOLD + "Flying is activate for you!");
            return true;
        } else{
            p.setFlying(false);
            p.sendMessage(ChatColor.GOLD + "Flying is stopping for you!");
        }
        return true;
    }
}
