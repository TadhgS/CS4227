/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dsims
 */
public class RoomFactoryTest {
    /**
     * Test of getRoom method, of class RoomFactory.
     */
    @Test
    public void testGetSmallRoom() 
    {
        System.out.println("getSmallRoom");
        String roomsize = "Small";
        RoomFactory instance = new RoomFactory();
        Room result = instance.getRoom(roomsize);
        ArrayList t = result.createTiles();
        ArrayList w = result.createWalls();   
        assertEquals(4,t.size());
        assertEquals(8,w.size());
    }
    
    @Test
    public void testGetMediumRoom() 
    {
        System.out.println("getMediumRoom");
        String roomsize = "Medium";
        RoomFactory instance = new RoomFactory();
        Room expResult = null;
        Room result = instance.getRoom(roomsize);
        ArrayList t = result.createTiles();
        ArrayList w = result.createWalls();   
        assertEquals(9,t.size());
        assertEquals(12,w.size());
    }
    
    
    @Test
    public void testGetLargeRoom() 
    {
        System.out.println("getLargeRoom");
        String roomsize = "Large";
        RoomFactory instance = new RoomFactory();
        Room expResult = null;
        Room result = instance.getRoom(roomsize);
        ArrayList t = result.createTiles();
        ArrayList w = result.createWalls();   
        assertEquals(16,t.size());
        assertEquals(16,w.size());
    }
    
}
