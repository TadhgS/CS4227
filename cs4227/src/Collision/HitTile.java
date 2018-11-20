/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collision;

import Controller.PlayerDisplayInfo;

/**
 *
 * @author Tadhg
 */
//walking on a tile
public class HitTile {
    
    Avatar.Avatar avatar;
    int roomSize;
    public HitTile(Avatar.Avatar a, int roomSize){
        avatar = a;
        this.roomSize = roomSize;
    }
    private int health;
    private int coin;
    public Avatar.Avatar tileHitHealth(String tileTypeHit)
    {         
        health = avatar.getHP();
        coin = avatar.getScore();
        if( tileTypeHit == "Mob")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Coin")
        {
            coin = coin+1;
            avatar.setScore(coin);
            return avatar;
        }
        else if ( tileTypeHit == "Heal")
        {
            health = health+2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( tileTypeHit == "Plain")
        {
            return avatar;
        }
        return avatar;
    }
        public int getMove()
    {
        if(PlayerDisplayInfo.movementAction == "Moving Up")
        {
            return roomSize *-1;
        }
        
        else if(PlayerDisplayInfo.movementAction == "Moving Down")
        {
            return roomSize;
        }
        
        else if(PlayerDisplayInfo.movementAction == "Moving Left")
        {
            return -1;
        }
        
        else
        {
            return 1;
        }
    }
}
