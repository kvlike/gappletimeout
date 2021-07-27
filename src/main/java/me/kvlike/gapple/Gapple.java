package me.kvlike.gapple;

import me.kvlike.gapple.listeners.*;
import me.kvlike.gapple.timer.Timer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Gapple extends JavaPlugin {

    public static Map<Player, Timer> timerMapApple;
    public static Map<Player, Boolean> checkMapApple;

    public static Map<Player, Timer> timerMapGod;
    public static Map<Player, Boolean> checkMapGod;

    public static Map<Player, Timer> timerMapTotem;
    public static Map<Player, Boolean> checkMapTotem;

    @Override
    public void onEnable() {

        timerMapApple = new HashMap<>();
        checkMapApple = new HashMap<>();
        timerMapGod = new HashMap<>();
        checkMapGod = new HashMap<>();
        timerMapTotem = new HashMap<>();
        checkMapTotem = new HashMap<>();

        getServer().getPluginManager().registerEvents(new PlayerConsumeListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);
        getServer().getPluginManager().registerEvents(new EntityResurrectListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);

    }

}
