package com.buildtools.BuildServerCore.Commands;

import com.buildtools.BuildServerCore.CustomClasses.Component;
import com.buildtools.BuildServerCore.CustomClasses.ComponentTeleport;
import com.buildtools.BuildServerCore.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MapEnableCommand implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){
        if(commandSender instanceof Player){
            Component.messageToPublicChatFormat(ChatColor.BLUE, "WorldManager", "Bad Command");
        } else {
            Component.messageToPublicChatFormat(ChatColor.BLUE, "WorldManager", "You aren't a player. Please log in.");
        }

        return true;
    }
}
