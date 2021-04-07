package ru.hyper.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import ru.hyper.testplugin.listeners.BlockListeners;
import ru.hyper.testplugin.commands.FlyCommand;
import ru.hyper.testplugin.commands.InfoCommand;
import ru.hyper.testplugin.listeners.PlayerListeners;

public class Main extends JavaPlugin {
    @Override
    public void onLoad(){
        getServer().getConsoleSender().sendMessage("Плагин загружается..");
    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListeners(), this);
        getServer().getPluginManager().registerEvents(new BlockListeners(), this);
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand ("info").setExecutor(new InfoCommand());
        getServer().getConsoleSender().sendMessage("Плагин успешно включен!");
    }
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage("Плагин успешно выключен!");
    }
}
