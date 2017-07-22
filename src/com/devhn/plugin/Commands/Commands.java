package com.devhn.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by DevHN on 10/07/2017.
 */

public class Commands implements CommandExecutor {

    private static final String INFO_PREFIX = "§c[ §4§li §c] ";
    private static final String NOTICE_PREFIX = "§c[ §4§l! §c] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        boolean isOp = sender.isOp();

        if (args[0].equalsIgnoreCase("help")) {
            sender.sendMessage(INFO_PREFIX + "§f§l도움말 -");
            sender.sendMessage("추후 명령어 기능 생기면 여기다 넣을겁니다.");
            //TODO: 명령어 기능 생길 때 마다 Help 커맨드 작성하기
            if (!isOp) {
                sender.sendMessage("for OP");
                //TODO: OP 명령어 기능 생길 때 마다 Help 커맨드 작성하기
            }

        } else if (args[0].equalsIgnoreCase("info")) {
            sender.sendMessage(INFO_PREFIX + "§f§l정보 -");
            sender.sendMessage("- §7이 §3§l플러그인§7은 §3§l개발자 DevHN§7가 제작하였습니다.");

        } else if (args[0].equalsIgnoreCase("add")) {
            if (args[1].equalsIgnoreCase("lore")) {
                //TODO: lore 추가 클래스 구현 후 넣기
            } else if (args[1].equalsIgnoreCase("skill")) {
                //TODO: skill 추가 클래스 구현 후 넣기
            } else if (args[1].equalsIgnoreCase("enchantment")) {
                //TODO: enchantment 추가 클래스 구현 후 넣기
            }
        }
        sender.sendMessage(INFO_PREFIX + "§3§l/hr help §7를 통해 더 많은 §3§l명령어§7를 알아보세요.");

        return true;
    }
}
