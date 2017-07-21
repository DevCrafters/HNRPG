package com.devhn.plugin.Commands;

import org.bukkit.command.CommandExecutor;

import java.util.List;

/**
 * Created by DevHN on 10/07/2017.
 */

public abstract class Command implements CommandExecutor {
    public abstract String getName();

    public abstract String getDescription();

    public abstract List<String> getAliases();

    public abstract List<String> getUsageInstructions();
}
