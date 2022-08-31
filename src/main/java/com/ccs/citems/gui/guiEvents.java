package com.ccs.citems.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class guiEvents extends Event {
    private static final HandlerList HANDLERS= new HandlerList();
    Player player;
    public guiEvents(Player player){
        this.player = player;
    }
    public Player getPlayer(){
    return player;
    }

    @Override
    public HandlerList getHandlers(){
        return HANDLERS;

    }
    public static HandlerList getHandlerList(){
        return HANDLERS;
    }
}
