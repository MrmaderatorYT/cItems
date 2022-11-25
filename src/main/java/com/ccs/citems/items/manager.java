// class witch get to player items
package com.ccs.citems.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class manager {
    public static ItemStack wand;
    public static ItemStack pickAxe;
    public static ItemStack helmet;
    public static ItemStack boots;


    public static void init() {
        createWand();
        createPickAxe();
        createHelmet();
        createBoots();


    }

    private static void createWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Stick of explosion");
        List<String> lore = new ArrayList<>();
        lore.add("§7Destroy everything");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.OXYGEN, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wand = item;
    }

    private static void createPickAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bPickaxe of doubling");
        List<String> lore = new ArrayList<>();
        lore.add("§7This pickaxe can double everything");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.SILK_TOUCH, 2, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        pickAxe = item;
    }
    private static void createHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Helmet of power");
        List<String> lore = new ArrayList<>();
        lore.add("§7This can help you in pvp");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.SILK_TOUCH, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        helmet = item;
    }
    private static void createBoots() {
        ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Boots of flying");
        List<String> lore = new ArrayList<>();
        lore.add("§7Let`s fly into the sky");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.SILK_TOUCH, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        boots = item;
    }
}