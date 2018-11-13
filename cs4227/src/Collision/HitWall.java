package Collision;

import Avatar.AvatarInterface;
import CreateMaze.CreateRoom;


public class HitWall 
{
    private int health;
    public int wallHit(String wallTypeHit)
    {         
        Avatar.Avatar avatar = new Avatar.Avatar();
        health = avatar.getHP();
        if( wallTypeHit == "UnlockedDoor")
        {
            return health;
        }
        else if ( wallTypeHit == "SpickedWall")
        {
            health = health-5;
            avatar.setCurrentHP(health);
            return health;
        }
        else if ( wallTypeHit == "SolidWall")
        {
            health = health-1;
            avatar.setCurrentHP(health);
            return health;
        }
        else if ( wallTypeHit == "DestructableWall")
        {
            health = health-2;
            avatar.setCurrentHP(health);
            return health;
        }
        return health;
    }
}
