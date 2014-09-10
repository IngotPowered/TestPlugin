package com.gosmartvps.test;

import com.ingotpowered.api.Ingot;
import com.ingotpowered.api.plugins.Plugin;

public class Test extends Plugin {

    public void onEnable() {
        System.out.println("Config motd: " + Ingot.getServer().getConfig().getMOTD());
    }

    public void onDisable() {
        System.out.println("Bye!");
    }
}
