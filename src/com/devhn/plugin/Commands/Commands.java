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
    private static final String NOTE_PREFIX = "§c[ §4§l+ §c] ";
    private static final String ADD_PREFIX = "§c[ §4§l+ §c] ";
    private static final String REMOVE_PREFIX = "§c[ §4§l- §c] ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        boolean isOp = sender.isOp();

        if (args.length != 0) {
            if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(INFO_PREFIX + "§f§l도움말 -");
                sender.sendMessage("§7- §3§l/hr add §7- 아이템에 §3§l부속물을 추가§7합니다.");
                sender.sendMessage("§7- §3§l/hr remove §7- 아이템에 §3§l부속물을 삭제§7합니다.");
                sender.sendMessage(NOTE_PREFIX + "§3§l상세한 명령어 기능§7은 §3§l명령어만 치게 되면 §7나옵니다.");
                //TODO: 명령어 기능 생길 때 마다 Help 커맨드 작성하기
                if (!isOp) {
                    sender.sendMessage("for OP");
                    //TODO: OP 명령어 기능 생길 때 마다 Help 커맨드 작성하기
                }
            } else if (args[0].equalsIgnoreCase("info")) {
                sender.sendMessage(INFO_PREFIX + "§f§l정보 -");
                sender.sendMessage("- §7이 §3§l플러그인§7은 §3§l개발자 DevHN§7가 제작하였습니다.");

            } else if (args[0].equalsIgnoreCase("add")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§ladd 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr add lore §7- 아이템에 §3§l설명을 추가§7합니다.");
                    sender.sendMessage("§7- §3§l/hr add skill §7- 아이템에 §3§l스킬을 추가§7합니다.");
                    sender.sendMessage("§7- §3§l/hr add enchantment §7- 아이템에 §3§l마법을 부여§7합니다.");
                } else {
                    if (args[1].equalsIgnoreCase("lore")) {
                        //TODO: lore 추가 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("skill")) {
                        //TODO: skill 추가 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("enchantment")) {
                        //TODO: enchantment 추가 클래스 구현 후 넣기
                    }
                }
            } else if (args[0].equalsIgnoreCase("remove")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§lremove 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr remove lore §7- 아이템의 §3§l설명을 삭제§7합니다.");
                    sender.sendMessage("§7- §3§l/hr remove skill §7- 아이템의 §3§l스킬을 삭제§7합니다.");
                    sender.sendMessage("§7- §3§l/hr remove enchantment §7- 아이템의 §3§l마법을 삭제§7합니다.");
                    sender.sendMessage("§7- §3§l/hr remove all §7- 아이템의 §3§l부속물들을 삭제§7합니다.");
                } else {
                    if (args[1].equalsIgnoreCase("lore")) {
                        //TODO: lore 삭제 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("skill")) {
                        //TODO: skill 삭제 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("enchantment")) {
                        //TODO: enchantment 삭제 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("all")) {
                        //TODO: 모든 부속물 삭제 클래스 구현 후 넣기
                    }
                }
            }
        } else {
            sender.sendMessage(INFO_PREFIX + "§3§l/hr help §7를 통해 더 많은 §3§l명령어§7를 알아보세요.");
        }
        return false;
    }
}
