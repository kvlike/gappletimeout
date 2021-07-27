package me.kvlike.gapple.listeners;

import me.kvlike.gapple.Gapple;
import me.kvlike.gapple.timer.Timer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Gapple.checkMapApple.put(e.getPlayer(), false);
        Gapple.timerMapApple.put(e.getPlayer(), new Timer(10, e.getPlayer(), "Golden Apple"));
        Gapple.checkMapGod.put(e.getPlayer(), false);
        Gapple.timerMapGod.put(e.getPlayer(), new Timer(90, e.getPlayer(), "Notch Apple"));
        Gapple.checkMapTotem.put(e.getPlayer(), false);
        Gapple.timerMapTotem.put(e.getPlayer(), new Timer(60, e.getPlayer(), "Totem"));

    }

}
