package ru.hyper.testplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
           if(!(sender instanceof Player)){
            sender.sendMessage("Console is not allowed to use this command!");
            return true;
           }
          if(args.length == 0){
           Player p = (Player) sender;
           if(!p.hasPermission("heal.plug"){
             player.sendMessage("Permission error!");
             return true;
          } else {
           p.setHealth(20);
           p.sendMessage("You have been healed");
           return true;
         }
        return true;
    }
}
