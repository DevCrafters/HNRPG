package com.devhn.plugin;

import com.devhn.plugin.Commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by DevHN on 10/07/2017.
 */

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        setupPlugin();
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("[ DevHN ] 플러그인을 성공적으로 종료하였습니다.");
    }

    private void setupPlugin() {
        getServer().getLogger().info("[ DevHN ] 플러그인을 성공적으로 실행하였습니다.");
        getCommand("hr").setExecutor(new Commands());
    }
}
