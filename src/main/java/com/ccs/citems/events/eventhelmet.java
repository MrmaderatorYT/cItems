package com.ccs.citems.events;

import com.ccs.citems.items.manager;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class eventhelmet implements Listener {

    @EventHandler
    public void Helmet(InventoryCloseEvent event) {
        Player p = (Player) event.getPlayer();

            if (p.getInventory().getHelmet() != null && p.getInventory().getHelmet().containsEnchantment(Enchantment.SILK_TOUCH)) {
                PotionEffect health = new PotionEffect(PotionEffectType.REGENERATION, 10000000, 2);
                PotionEffect dolphins = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 10000000, 1);
                p.addPotionEffect(health);
                p.addPotionEffect(dolphins);
            } else {

                    p.removePotionEffect(PotionEffectType.REGENERATION);
                    p.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
                }
            }

        }


