//class witch shows gui
package com.ccs.citems.gui;

import com.ccs.citems.items.manager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class gui implements Listener {
    private Inventory gui;
        public void openGui(Player player){
            gui = Bukkit.createInventory(null, InventoryType.HOPPER);
            ItemStack item = new ItemStack(Material.STICK, 1);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName("§6Stick of explosion");
            item.setItemMeta(meta);
            gui.setItem(0, item);
            player.openInventory(gui);


            ItemStack itemtwo = new ItemStack(Material.DIAMOND_PICKAXE, 1);
            ItemMeta metatwo = item.getItemMeta();
            metatwo.setDisplayName("§bPickaxe of doubling");
            itemtwo.setItemMeta(metatwo);
            gui.setItem(1, itemtwo);
            player.openInventory(gui);

            ItemStack itemthree = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta metathree = item.getItemMeta();
            metathree.setDisplayName("Helmet of power");
            itemthree.setItemMeta(metathree);
            gui.setItem(2, itemthree);
            player.openInventory(gui);


            ItemStack itemfour = new ItemStack(Material.GOLDEN_BOOTS, 1);
            ItemMeta metafour = item.getItemMeta();
            metafour.setDisplayName("§bBoots of flying");
            itemfour.setItemMeta(metafour);
            gui.setItem(3, itemfour);
            player.openInventory(gui);


            ItemStack itemfive = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
            ItemMeta metafive = item.getItemMeta();
            metafive.setDisplayName("§4§l§nComming soon");
            itemfive.setItemMeta(metafive);
            gui.setItem(4, itemfive);
            player.openInventory(gui);

        }
        @EventHandler
    public void guiClickEvent(InventoryClickEvent event){
            InventoryView view = event.getView();
            if (!event.getInventory().equals(gui)||view.getTitle().equals("§apanel of items")){
                return;
            }
            event.setCancelled(true);

            switch (event.getSlot()){
                case 0:
                    Player player = (Player) event.getWhoClicked();
                    player.closeInventory();
                    player.getInventory().addItem(manager.wand);
                    break;
                case 1:
                    Player player1 = (Player) event.getWhoClicked();
                    player1.closeInventory();
                    player1.getInventory().addItem(manager.pickAxe);
                    break;
                case 2:
                    Player player2 = (Player) event.getWhoClicked();
                    player2.closeInventory();
                    player2.getInventory().addItem(manager.helmet);
                    break;
                case 3:
                    Player player3 = (Player) event.getWhoClicked();
                    player3.closeInventory();
                    player3.getInventory().addItem(manager.boots);



                }
            }

        @EventHandler
    public void openGuiEvent(guiEvents event){
            openGui(event.getPlayer());

        }

}
