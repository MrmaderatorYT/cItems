package com.ccs.citems.events;

import com.ccs.citems.items.manager;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class eventpickaxe implements Listener {


    @EventHandler
    public static void onRightClicktwo(BlockBreakEvent event) {

        Block blockBroken = event.getBlock();
        Player player = event.getPlayer();
        ItemStack itemStack = event.getPlayer().getInventory().getItem(event.getPlayer().getInventory().getHeldItemSlot());

        if (itemStack != null) // I swapped this with the line below because we need to check if the ItemStack exists before we try to check if it has ItemMeta#
        {
            if (itemStack.hasItemMeta()) // here we check if the ItemStack has any ItemMeta
            {
                if (itemStack.getItemMeta().hasDisplayName()) // see here, I removed the "pickaxe of doubling" argument because it's not needed
                {
                    // String pickaxe_of_doubling = itemStack.getItemMeta().getDisplayName(); // we then fetch the name of the item
                    if (itemStack.getItemMeta().getDisplayName().equals("§bPickaxe of doubling")) {
                        ItemStack item = new ItemStack(blockBroken.getType(), 2);
                        blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), item);

                    }

                }
            }
        }

    }


    }






