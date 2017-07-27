package com.devhn.plugin.function;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public class Lore {

    public static String tempStr;

    public static String setTempStr(String str) {
        return str = tempStr;
    }

    public void addLore(int ID, int DATA, int STACK, String[] Lore, CommandSender sender) {
        try {
            Integer.parseInt(String.valueOf(tempStr));

            ItemStack itemStack = new MaterialData(ID, (byte) DATA).toItemStack(STACK);
            ItemMeta itemMeta = itemStack.getItemMeta();

        } catch (NumberFormatException e) {
            sender.sendMessage("§c[ §4§l! §c] §3§l줄 수§7를 입력해주세요.");
            return;
        }
    }

    public void removeLore() {

    }

    public boolean isContaintedLore() {
        return true;
    }
}
