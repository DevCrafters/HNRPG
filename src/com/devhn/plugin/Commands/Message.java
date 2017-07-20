package com.devhn.plugin.Commands;

import org.bukkit.ChatColor;

/**
 * Created by DevHN on 16/07/2017.
 */

public enum Message {
    OP_ONLY("[ ! ] 관리자만 가능한 명령어입니다."),;

    private final String target;

    Message(String msg) {
        this.target = msg;
    }

    @Override
    public String toString() {
        return colorize(target);
    }

    public static String colorize(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
