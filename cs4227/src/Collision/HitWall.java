package Collision;

import Avatar.Avatar;
import Avatar.AvatarInterface;
import Controller.PlayerDisplayInfo;
import CreateMaze.Assembler;
import CreateMaze.CreateRoom;
import static Gui.CreateGui.gameText;


public class HitWall 
{
    Avatar avatar;
    int roomSize;
    int moveBy;
    public HitWall(Avatar a,int roomSize){
        avatar = a;
        this.roomSize = roomSize;
    }
    
    public Boolean checkIfWall()
    {
        if(avatar.getPosition()-roomSize < 0  && PlayerDisplayInfo.movementAction == "Moving Up")
        {
            return true;
        }
        
        else if(avatar.getPosition()+roomSize >= roomSize*roomSize  && PlayerDisplayInfo.movementAction == "Moving Down")
        {
            return true;
        }
        
        else if(avatar.getPosition()%roomSize == 0  && PlayerDisplayInfo.movementAction == "Moving Left")
        {
            return true;
        }
        
        else if((avatar.getPosition()+1)%roomSize == 0  && PlayerDisplayInfo.movementAction == "Moving Right")
        {
            return true;
        }
        else
            return false;
    }
    
    public Avatar wallHitHealth(CreateMaze.Assembler wall)
    {         
        avatar.setCurrentHP(avatar.getHP() + wall.getParts().get(1).damage());
        return avatar;
    }
    
    public Boolean wallHitDoor(CreateMaze.Assembler wall)
    {
        return wall.getParts().get(1).destructable();
    }

    public int getWall() {
        
        if(PlayerDisplayInfo.movementAction == "Moving Up")
        {
            return avatar.getPosition();
        }
        
        else if(PlayerDisplayInfo.movementAction == "Moving Down")
        {
            return (((avatar.getPosition()- (avatar.getPosition()% roomSize))/roomSize)+avatar.getPosition()% roomSize)+1;
        }
        
        else if(PlayerDisplayInfo.movementAction == "Moving Left")
        {
            return (roomSize*2)+ avatar.getPosition()/roomSize;
        }
        
        else
        {
            return ((roomSize*2)+ (avatar.getPosition()-roomSize)/roomSize)+roomSize;
        }
    }
}