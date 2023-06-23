package com.botclity.minequar;

import com.destroystokyo.paper.event.block.TNTPrimeEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class Explosions implements Listener {
    public Explosions(){

    }
    @EventHandler
    public void explosions(EntityExplodeEvent e){
        if (e.getEntity() instanceof TNTPrimed){
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void exlosionsPrime(ExplosionPrimeEvent e){
        if (e.getEntity() instanceof Fireball || e.getEntity() instanceof TNTPrimed){
            e.setFire(false);
        }
    }
    @EventHandler
    public void TNTExplosion(BlockExplodeEvent e){
        e.setCancelled(true);
    }
}
