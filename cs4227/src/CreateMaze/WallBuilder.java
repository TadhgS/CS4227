/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14138409
 */
public class WallBuilder 
{
    public FullWall createSpikedWall()
    {
        FullWall fullWall = new FullWall();
        fullWall.addPart(new SpikedWall());
        return fullWall;
    }
    
    public FullWall createDoorWall()
    {
        FullWall fullWall = new FullWall();
        fullWall.addPart(new SolidWall());
        fullWall.addPart(new UnlockedDoor());
        return fullWall;
    }
    
    public FullWall createDestructableWall()
    {
        FullWall fullWall = new FullWall();
        fullWall.addPart(new DestructableWall());
        return fullWall;
    }
        
    public FullWall createSolidWall()
    {
        FullWall fullWall = new FullWall();
        fullWall.addPart(new SolidWall());
        return fullWall;
        
    }
            
}
