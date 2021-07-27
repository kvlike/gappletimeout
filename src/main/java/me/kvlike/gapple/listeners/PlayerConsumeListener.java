package me.kvlike.gapple.listeners;

import me.kvlike.gapple.Gapple;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class PlayerConsumeListener implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent e){

        if(e.getItem().getType() == Material.GOLDEN_APPLE){
            if(Gapple.checkMapApple.get(e.getPlayer())){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "Nie mozesz jeszcze tego zjesc!");
            }
            else {
                Gapple.checkMapApple.replace(e.getPlayer(), true);
                Gapple.timerMapApple.get(e.getPlayer()).setTimecount(10);
                Gapple.timerMapApple.get(e.getPlayer()).startTimer();
            }
        }
        else if(e.getItem().getType() == Material.ENCHANTED_GOLDEN_APPLE){
            if(Gapple.checkMapGod.get(e.getPlayer())){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatColor.RED + "Nie mozesz jeszcze tego zjesc!");
            }
            else {
                Gapple.checkMapGod.replace(e.getPlayer(), true);
                Gapple.timerMapGod.get(e.getPlayer()).setTimecount(90);
                Gapple.timerMapGod.get(e.getPlayer()).startTimer();
            }
        }

    }

}
