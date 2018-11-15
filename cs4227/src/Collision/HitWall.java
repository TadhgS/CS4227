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
        if( wallTypeHit == "Door")
        {
            return avatar;
        }
        else if ( wallTypeHit == "Spiked")
        {
            health = health-5;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "Metal")
        {
        health = health;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "Destructable")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        return avatar;
    }
    
    public Boolean wallHitDoor(String wallTypeHit)
    {
        if( wallTypeHit == "Door")
        {
            return true;
        }
        else if ( wallTypeHit == "Destructable")
        {
            return true;
        }
        else
            return false;
    }
}
