package com.devhn.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by DevHN on 10/07/2017.
 */

public class Commands implements CommandExecutor {

    private static final String PREFIX = "§c[ §4§li §c] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        boolean isOp = sender.isOp();
        switch (args.length) {
            case 1:
                if (!isOp) {
                    if (args[0].equalsIgnoreCase("help")) {
                        sender.sendMessage(PREFIX + "§f§l도움말 -");
                        sender.sendMessage("");
                    } else if (args[0].equalsIgnoreCase("info")) {
                        sender.sendMessage(PREFIX + "§f§l정보 -");
                        sender.sendMessage("- §7이 §3§l플러그인§7은 §3§l개발자 DevHN§7가 제작하였습니다.");
                    }
                }
                break;
            case 2:
            default:
        }
        return true;
    }
}
