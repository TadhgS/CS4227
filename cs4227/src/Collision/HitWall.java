package Collision;

import Avatar.AvatarInterface;
import CreateMaze.CreateRoom;


public class HitWall 
{
    Avatar.Avatar avatar;
    public HitWall(Avatar.Avatar a){
        avatar = a;
    }
    private int health;
    
    public Avatar.Avatar wallHitHealth(String wallTypeHit)
    {         
        health = avatar.getHP();
        if( wallTypeHit == "Unlocked Door")
        {
            return avatar;
        }
        else if ( wallTypeHit == "Spiked Wall")
        {
            health = health-5;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "Solid Wall")
        {
            health = health-1;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "Destructable Wall")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        return avatar;
    }
    
    public Boolean wallHitDoor(String wallTypeHit)
    {
        if( wallTypeHit == "Unlocked Door")
        {
            return true;
        }
        else if ( wallTypeHit == "Destructable Wall")
        {
            return true;
        }
        else
            return false;
    }
}
