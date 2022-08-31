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
        /*if (!(sender instanceof Player)){
            sender.sendMessage("Only players can use this command");
            return true;
        }   */
        Player player = (Player) sender;
        //створення нового об'єкта класу.
       // if(cmd.getName().equalsIgnoreCase("items")&& sender.hasPermission("citems.gui")){
            //cmd - це те, там де public boolean on Command. items - команда. citems.gui - право на виконання команди
        if(sender.hasPermission("citems.gui")){
            Bukkit.getServer().getPluginManager().callEvent(new guiEvents((Player) sender));
            //видача палка в інвеентар
            return true;
        }



        else{
            sender.sendMessage( "§4You do not have permission!");
            return false;

        }
    }
}
