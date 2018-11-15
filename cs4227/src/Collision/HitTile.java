/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collision;

/**
 *
 * @author Tadhg
 */
public class HitTile {
    
    Avatar.Avatar avatar;
    public HitTile(Avatar.Avatar a){
        avatar = a;
    }
    private int health;
    private int coin;
    public Avatar.Avatar tileHitHealth(String tileTypeHit)
    {         
        health = avatar.getHP();
        if( tileTypeHit == "Mob Tile")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Coin Tile")
        {
            health = health-5;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Heal Tile")
        {
            health = health-1;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Plain Tile")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        return avatar;
    }
    
}
