package me.kvlike.gapple.listeners;

import me.kvlike.gapple.Gapple;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

public class EntityResurrectListener implements Listener {

    @EventHandler
    public void onResurrect(EntityResurrectEvent e){

        if(e.getEntity() instanceof Player){
            Player player = (Player) e.getEntity();

            if(Gapple.checkMapTotem.get(player)){
                e.setCancelled(true);
            }
            else {
                Gapple.checkMapTotem.replace(player, true);
                Gapple.timerMapTotem.get(player).setTimecount(60);
                Gapple.timerMapTotem.get(player).startTimer();
            }
        }

    }

}
