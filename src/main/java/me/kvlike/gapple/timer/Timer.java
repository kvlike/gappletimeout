package me.kvlike.gapple.timer;

import me.kvlike.gapple.Gapple;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;


public class Timer {

    private int timecount;
    private int taskID;
    private final Plugin plugin = Gapple.getPlugin(Gapple.class);
    private int time;
    private Player player;
    private String type;

    public void setTimecount(int timecount) {
        this.timecount = timecount;
    }

    public Timer(int timecount, Player player, String type){
        this.timecount = timecount;
        this.player = player;
        this.type = type;
    }

    public void startTimer(){
        time = timecount;
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        this.taskID = scheduler.scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                if(time == 0){
                    player.sendMessage(ChatColor.GREEN + "["+type+"] Koniec cooldownu!");
                    stopTimer();
                    return;
                }
                if(time == 90){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 90 sekund!");
                }
                if(time == 60){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 60 sekund!");
                }
                if(time == 30){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 30 sekund!");
                }
                if(time == 10){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 10 sekund!");
                }
                if(time == 5){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 5 sekund!");
                }
                if(time == 4){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 4 sekund!");
                }
                if(time == 3){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 3 sekund!");
                }
                if(time == 2){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 2 sekund!");
                }
                if(time == 1){
                    player.sendMessage(ChatColor.GOLD + "["+type+"] Koniec cooldownu za 1 sekund!");
                }
                time--;
            }
        }, 0L, 20L);
        return;

    }

    public void stopTimer() {
        Bukkit.getScheduler().cancelTask(taskID);
        if(type == "Golden Apple") {
            Gapple.checkMapApple.replace(player, false);
        }
        else if(type == "Notch Apple"){
            Gapple.checkMapGod.replace(player, false);
        }
        else if(type == "Totem"){
            Gapple.checkMapTotem.replace(player, false);
        }
    }
}
