package xyz.balbucio.free.party.spigot;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.balbucio.free.party.spigot.Files.FileManager;

public final class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onLoad(){
        FileManager.loadConfig(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             package xyz.balbucio.free.party.spigot;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.balbucio.free.party.spigot.Files.FileManager;

public final class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onLoad(){
        FileManager.loadConfig(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
