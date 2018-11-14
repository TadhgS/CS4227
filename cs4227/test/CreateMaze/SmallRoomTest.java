/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

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
public class SmallRoomTest {
    
    public SmallRoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createWalls method, of class SmallRoom.
     */
    @Test
    public void testCreateWalls() {
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
    public void testCreateTiles() {
        System.out.println("createTiles");
        SmallRoom instance = new SmallRoom();
        instance.createTiles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
