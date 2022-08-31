package com.ccs.citems.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class eventPickaxeCores implements Listener {

    static ItemStack nullTool = new ItemStack(Material.AIR, 1);

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        final ItemStack stack = e.getPlayer().getInventory().getItemInMainHand();
        final Block broken = e.getBlock();
        if (!e.getBlock().getType().name().contains("ORE")) return;

        if (stack == null || !stack.getType().name().contains("PICKAXE")) {
            broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), getOreResult(broken.getType(), false));
        }

        if (hasEnchant(stack, Enchantment.SILK_TOUCH)) {

            e.setCancelled(true);
            broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), getOreResult(broken.getType(), true));
            broken.breakNaturally(nullTool);
        }
    }

    public ItemStack getOreResult(Material ore, boolean pickSilkTouch) {
        switch(ore) {
            case LAPIS_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.LAPIS_ORE, 1);
                else
                    return new ItemStack(Material.LAPIS_LAZULI, RandomUtil.getIntRandomRange(4, 8));
            case DEEPSLATE_LAPIS_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 1);
                else
                    return new ItemStack(Material.LAPIS_LAZULI, RandomUtil.getIntRandomRange(4, 8));


            case REDSTONE_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.REDSTONE_ORE, 1);
                else
                    return new ItemStack(Material.REDSTONE, RandomUtil.getIntRandomRange(4, 5));
            case DEEPSLATE_REDSTONE_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 1);
                else
                    return new ItemStack(Material.REDSTONE, RandomUtil.getIntRandomRange(4, 5));


            case DEEPSLATE_COAL_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_COAL_ORE, 1);
                else
                    return new ItemStack(Material.COAL, 1);
            case COAL_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.COAL_ORE, 1);
                else
                    return new ItemStack(Material.COAL, 1);


            case GOLD_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.GOLD_ORE, 1);
                else
                    return new ItemStack(Material.GOLD_INGOT, 1);
            case DEEPSLATE_GOLD_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_GOLD_ORE, 1);
                else
                    return new ItemStack(Material.GOLD_INGOT, 1);


            case IRON_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.IRON_ORE, 1);
                else
                    return new ItemStack(Material.IRON_INGOT, 1);
            case DEEPSLATE_IRON_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_IRON_ORE, 1);
                else
                    return new ItemStack(Material.IRON_INGOT, 1);


            case DIAMOND_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DIAMOND_ORE, 1);
                else
                    return new ItemStack(Material.DIAMOND, 1);
            case DEEPSLATE_DIAMOND_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 1);
                else
                    return new ItemStack(Material.DIAMOND, 1);


            case COPPER_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.COPPER_ORE, 1);
                else
                    return new ItemStack(Material.COPPER_INGOT, 1);
            case DEEPSLATE_COPPER_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_COPPER_ORE, 1);
                else
                    return new ItemStack(Material.COPPER_INGOT, 1);


            case EMERALD_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.EMERALD_ORE, 1);
                else
                    return new ItemStack(Material.EMERALD, 1);
            case DEEPSLATE_EMERALD_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 1);
                else
                    return new ItemStack(Material.EMERALD, 1);


            case ANCIENT_DEBRIS:
                if (pickSilkTouch)
                    return new ItemStack(Material.ANCIENT_DEBRIS, 1);
                else
                    return new ItemStack(Material.NETHERITE_SCRAP, 1);
            case NETHER_GOLD_ORE:
                if (pickSilkTouch)
                    return new ItemStack(Material.NETHER_GOLD_ORE, 1);
                else
                    return new ItemStack(Material.GOLD_NUGGET, RandomUtil.getIntRandomRange(4, 8));


            default: return null;
        }
    }

    public static boolean hasEnchant(ItemStack stack, Enchantment ench) {
        if (!stack.hasItemMeta()) return false;

        final ItemMeta meta = stack.getItemMeta();

        return meta.hasEnchant(ench);
    }

}
