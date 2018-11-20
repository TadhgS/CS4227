package CreateMaze;

import org.junit.Test;
import static org.junit.Assert.*;

public class SmallRoomTest 
{    
    public SmallRoomTest() 
    {
    }
    
    @Test
    public void testCreateWalls() 
    {
        System.out.println("createWalls");
        SmallRoom instance = new SmallRoom();
        instance.createWalls();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createTiles method, of class SmallRoom.
     */
    @Test
    public void testCreateTiles() 
    {
        System.out.println("createTiles");
        SmallRoom instance = new SmallRoom();
        instance.createTiles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}