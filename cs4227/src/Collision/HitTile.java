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
        coin = avatar.getScore();
        if( tileTypeHit == "Mob Tile")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Coin Tile")
        {
            coin = coin+1;
            avatar.setScore(coin);
            return avatar;
        }
        else if ( tileTypeHit == "Heal Tile")
        {
            health = health+2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Plain Tile")
        {
            return avatar;
        }
        return avatar;
    }
    
}
