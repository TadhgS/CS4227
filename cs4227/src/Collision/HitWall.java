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
        if( wallTypeHit == "UnlockedDoor")
        {
            return avatar;
        }
        else if ( wallTypeHit == "SpickedWall")
        {
            health = health-5;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "SolidWall")
        {
            health = health-1;
            avatar.setCurrentHP(health);
            return avatar;
        }
        else if ( wallTypeHit == "DestructableWall")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return avatar;
        }
        return avatar;
    }
    
    public Boolean wallHitDoor(String wallTypeHit)
    {
        if( wallTypeHit == "UnlockedDoor")
        {
            return true;
        }
        else if ( wallTypeHit == "DestructableWall")
        {
            return true;
        }
        else
            return false;
    }
}
