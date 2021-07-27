package me.kvlike.gapple.listeners;

import me.kvlike.gapple.Gapple;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){

        if(Gapple.checkMapTotem.get(e.getEntity())){
            Gapple.timerMapTotem.get(e.getEntity()).stopTimer();
        }
        if(Gapple.checkMapApple.get(e.getEntity())){
            Gapple.timerMapApple.get(e.getEntity()).stopTimer();
        }
        if(Gapple.checkMapGod.get(e.getEntity())){
            Gapple.timerMapGod.get(e.getEntity()).stopTimer();
        }


    }

}
