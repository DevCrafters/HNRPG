package com.devhn.plugin.Commands;

import com.devhn.plugin.function.Lore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.StringJoiner;

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
                sender.sendMessage("§7- §3§l/hr create §7- 여러 §3§l부속물을 생성§7합니다.");
                sender.sendMessage("§7- §3§l/hr set §7- 여러 §3§l옵션을 설정§7합니다.");
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

            } else if (args[0].equalsIgnoreCase("create")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§lcreate 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr create item §7- §3§아이템을 생성§7합니다.");
                    sender.sendMessage("§7- §3§l/hr create block §7- §3§l블럭을 생성§7합니다.");
                    sender.sendMessage("§7- §3§l/hr create npc §7- §3§lNPC를 생성§7합니다.");
                    sender.sendMessage("§7- §3§l/hr create world §7- §3§l월드를 생성§7합니다.");
                } else {
                    if (args[1].equalsIgnoreCase("item")) {
                        //TODO: item 생성 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("block")) {
                        //TODO: block 생성 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("npc")) {
                        //TODO: npc 생성 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("world")) {
                        //TODO: world 생성 클래스 구현 후 넣기
                    }
                }

            } else if (args[0].equalsIgnoreCase("set")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§lset 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr set event §7- §3§l이벤트를 설정§7합니다.");
                    sender.sendMessage("§7- §3§l/hr set path §7- §3§lNPC가 다닐 길을 설정§7합니다.");
                    sender.sendMessage("§7- §3§l/hr set world §7- §3§l월드의 옵션을 설정§7합니다.");
                } else {
                    if (args[1].equalsIgnoreCase("event")) {
                        //TODO: event 설정 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("path")) {
                        //TODO: path 설정 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("world")) {
                        //TODO: world 설정 클래스 구현 후 넣기
                    }
                }

            } else if (args[0].equalsIgnoreCase("add")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§ladd 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr add lore <줄 수> <설명> §7- 아이템에 §3§l설명을 추가§7합니다.");
                    sender.sendMessage("§7- §3§l/hr add skill §7- 아이템에 §3§l스킬을 추가§7합니다.");
                    sender.sendMessage("§7- §3§l/hr add enchantment §7- 아이템에 §3§l마법을 부여§7합니다.");
                } else {
                    if (args[1].equalsIgnoreCase("lore")) {
                        Lore.setTempStr(args[2]);

                        StringJoiner j = new StringJoiner(" ");
                        for (int i=2; i < args.length; i++) {
                            j.add(args[i]);
                        }

                    } else if (args[1].equalsIgnoreCase("skill")) {
                        //TODO: skill 추가 클래스 구현 후 넣기
                    } else if (args[1].equalsIgnoreCase("enchantment")) {
                        //TODO: enchantment 추가 클래스 구현 후 넣기
                    }
                }
            } else if (args[0].equalsIgnoreCase("remove")) {
                if (args.length <= 1) {
                    sender.sendMessage(INFO_PREFIX + "§f§lremove 커맨드 정보 -");
                    sender.sendMessage("§7- §3§l/hr remove lore <줄 수/all> §7- 아이템의 §3§l설명을 삭제§7합니다.");
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
