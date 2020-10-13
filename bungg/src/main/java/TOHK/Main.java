package TOHK;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

public class Main extends Plugin implements Listener {
    @Override
    public void onEnable(){
        System.out.println("hi");
        getProxy().getPluginManager().registerListener(this,this);
    }
    @EventHandler
    public void onChange(ProxyPingEvent event){
        ServerPing serverPing = event.getResponse();
        serverPing.getPlayers().setMax(serverPing.getPlayers().getOnline()+1);
        event.setResponse(serverPing);
    }
}
