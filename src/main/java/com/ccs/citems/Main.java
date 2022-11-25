package com.ccs.citems;

import com.ccs.citems.commands.command;
import com.ccs.citems.events.eventBoots;
import com.ccs.citems.events.eventhelmet;
import com.ccs.citems.events.eventpickaxe;
import com.ccs.citems.events.eventstick;
import com.ccs.citems.gui.gui;
import com.ccs.citems.items.manager;//импорт пакета manager
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin{
@Override
//when enabled
    public void  onEnable(){
    manager.init();
    getServer().getPluginManager().registerEvents(new eventstick(), this);
    getServer().getPluginManager().registerEvents(new eventpickaxe(), this);
    getServer().getPluginManager().registerEvents(new eventhelmet(), this);
    getServer().getPluginManager().registerEvents(new eventBoots(), this);
    getServer().getPluginManager().registerEvents(new gui(), this);
    //commands
    getCommand("items").setExecutor(new command());


}
@Override
    public void onDisable(){
    //when disable says
    Bukkit.getConsoleSender().sendMessage("bye, have a good time!");

}
}
