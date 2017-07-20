package com.devhn.plugin.Commands;

import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by DevHN on 12/07/2017.
 */

public class HelpCommand extends Command {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        boolean isOp = sender.isOp();
        if (!isOp) {
            sender.sendMessage(Message.OP_ONLY.toString());
        } else {
            sender.sendMessage("오피구나 알았어");
        }
        return true;
    }

    private TreeMap<String, Command> commands;
    public HelpCommand() {
        commands = new TreeMap<>();
    }

    public Command registerCommand(Command command) {
        commands.put(command.getAliases().get(0), command);
        return command;
    }

    @Override
    public String getName() {
        return ("도움말 커맨드");
    }

    @Override
    public String getDescription() {
        return ("이 플러그인의 명령어 목록을 알아봅니다.");
    }

    @Override
    public List<String> getAliases() {
        return Arrays.asList("/hr help");
    }

    @Override
    public List<String> getUsageInstructions()
    {
        return Collections.singletonList("명령어 설명");
    }

}