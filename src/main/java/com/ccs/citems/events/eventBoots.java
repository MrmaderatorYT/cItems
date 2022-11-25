package com.ccs.citems.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.ArrayList;

public class eventBoots implements Listener {

    @EventHandler
    public void Boots(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();
        if (player.getInventory().getBoots() != null && player.getInventory().getBoots().hasItemMeta() && player.getInventory().getBoots().getItemMeta().getDisplayName().equals("Boots of flying")) {

                player.setAllowFlight(true);
        } else {
            player.setAllowFlight(false);
        }
        }
    }


