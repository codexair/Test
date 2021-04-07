package ru.hyper.testplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!sender.hasPermission("info.plug")) {
            sender.sendMessage(ChatColor.RED + "Permission error");
            return true;
        } else {
            if(args.length == 0) {
                return false;
            }
            if(args.length == 1) {
                String name = args[0];
                Player p = Bukkit.getPlayer(name);
                if(p == null) {
                    sender.sendMessage(p.getName() + " is not online");
                    return true;
                }
                if(args[0].contains(p.getName())) {
                    if(!sender.hasPermission("info.plag")) {
                        sender.sendMessage("U don't have permission!");
                        return true;
                    }
                    sender.sendMessage("Health: " + p.getHealth());
                    sender.sendMessage("IP: " + p.getAddress().getAddress());
                    sender.sendMessage("EXP: " + p.getExp());
                    sender.sendMessage("Nick: " + p.getDisplayName());
                    return true;

                }
            }
        }
        return true;
    }
}