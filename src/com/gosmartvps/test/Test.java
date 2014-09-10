package com.gosmartvps.test;

import com.ingotpowered.api.Ingot;
import com.ingotpowered.api.events.EventHandler;
import com.ingotpowered.api.events.PlayerLoginAttemptEvent;
import com.ingotpowered.api.plugins.Plugin;

public class Test extends Plugin implements EventHandler {

    public void onEnable() {
        Ingot.getServer().getEventFactory().registerHooks(this, this);
    }

    public void onDisable() {
        System.out.println("Bye!");
    }

    public void onConnectionAttempt(PlayerLoginAttemptEvent e) {
        System.out.println(e.getUsername() + " connecting from " + e.getHostname());
        e.setCancelled(true);
    }
}
