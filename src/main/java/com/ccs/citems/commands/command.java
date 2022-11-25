package com.ccs.citems.commands;
//import com.ccs.citems.gui;

import com.ccs.citems.gui.guiEvents;
import com.ccs.citems.items.manager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args){
        //check permission
        if(sender.hasPermission("citems.gui")){
            Bukkit.getServer().getPluginManager().callEvent(new guiEvents((Player) sender));
            return true;
        }



        else{
            sender.sendMessage( "§4You do not have permission!");
            return false;

        }
    }
}
