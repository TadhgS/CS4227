package Collision;

import Avatar.AvatarInterface;
import CreateMaze.CreateRoom;


public class HitWall 
{
    private int health;
    public int wallHit(String wallTypeHit)
    {         
        health = AvatarInterface.getHP();
        if( wallTypeHit == "UnlockedDoor")
        {
            CreateRoom.createRoom();
            return health;
        }
        else if ( wallTypeHit == "SpickedWall")
        {
            health = health-5;
            AvatarInterface.setCurrentHP(health);
            return health;
        }
        else if ( wallTypeHit == "SolidWall")
        {
            health = health-1;
            AvatarInterface.setCurrentHP(health);
            return health;
        }
        else if ( wallTypeHit == "DestructableWall")
        {
            health = health-2;
            AvatarInterface.setCurrentHP(health);
            CreateRoom.createRoom();
            return health;
        }
        return health;
    }
}
