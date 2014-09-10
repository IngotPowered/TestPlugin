package com.gosmartvps.test;

import com.ingotpowered.api.Ingot;
import com.ingotpowered.api.events.EventHandler;
import com.ingotpowered.api.events.list.PlayerKickEvent;
import com.ingotpowered.api.events.list.PlayerLoginAttemptEvent;
import com.ingotpowered.api.plugins.Plugin;

public class Test extends Plugin implements EventHandler {

    public void onEnable() {
        Ingot.getServer().getEventFactory().registerHooks(this, this);
    }

    public void onDisable() {
        System.out.println("Bye!");
    }

    public void cancelKickEvent(PlayerKickEvent e) {
        if (e.getPlayer().getUsername().equals("dreadiscool")) {
            e.setCancelled(true);
        }
    }
}
