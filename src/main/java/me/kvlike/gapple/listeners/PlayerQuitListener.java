package me.kvlike.gapple.listeners;

import me.kvlike.gapple.Gapple;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){

        Gapple.checkMapApple.remove(e.getPlayer());
        Gapple.timerMapApple.remove(e.getPlayer());
        Gapple.checkMapGod.remove(e.getPlayer());
        Gapple.timerMapGod.remove(e.getPlayer());
        Gapple.checkMapTotem.remove(e.getPlayer());
        Gapple.timerMapTotem.remove(e.getPlayer());

    }

}
