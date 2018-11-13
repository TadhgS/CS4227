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
public class RoomPartBuilderTest {
    
    public RoomPartBuilderTest() {
    }
    
    /**
     * Test of createSpikedWall method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateSpikedWall() {
        System.out.println("createSpikedWall");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Spiked Wall";
        Boolean expDestructable = false;
        Double expDamage = 7.5;
        Assembler result = instance.createSpikedWall();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createDoorWall method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateDoorWall() {
        System.out.println("createDoorWall");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Solid Wall";
        Boolean expDestructable = false;
        Double expDamage = 0.0;
        Assembler result = instance.createDoorWall();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
        
        expName = "Unlocked Door";
        expDestructable = false;
        expDamage = 0.0;
        assertEquals(expName, result.getParts().get(1).name());
        assertEquals(expDestructable, result.getParts().get(1).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(1).damage());
        
        
    }

    /**
     * Test of createDestructableWall method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateDestructableWall() {
        System.out.println("createDestructableWall");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Destructable Wall";
        Boolean expDestructable = true;
        Double expDamage = 0.1;
        Assembler result = instance.createDestructableWall();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createSolidWall method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateSolidWall() {
        System.out.println("createSolidWall");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Solid Wall";
        Boolean expDestructable = false;
        Double expDamage = 0.0;
        Assembler result = instance.createSolidWall();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createPlainTile method, of class RoomPartBuilder.
     */
    @Test
    public void testCreatePlainTile() {
        System.out.println("createPlainTile");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Plain Tile";
        Boolean expDestructable = false;
        Double expDamage = 0.0;
        Assembler result = instance.createPlainTile();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createMobTile method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateMobTile() {
        System.out.println("createMobTile");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Mob Tile";
        Boolean expDestructable = false;
        Double expDamage = 0.5;
        Assembler result = instance.createMobTile();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createHealTile method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateHealTile() {
        System.out.println("createHealTile");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Heal Tile";
        Boolean expDestructable = false;
        Double expDamage = -1.0;
        Assembler result = instance.createHealTile();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }

    /**
     * Test of createCoinTile method, of class RoomPartBuilder.
     */
    @Test
    public void testCreateCoinTile() {
        System.out.println("createCoinTile");
        RoomPartBuilder instance = new RoomPartBuilder();
        String expName = "Coin Tile";
        Boolean expDestructable = false;
        Double expDamage = 0.0;
        Assembler result = instance.createCoinTile();
        assertEquals(expName, result.getParts().get(0).name());
        assertEquals(expDestructable, result.getParts().get(0).destructable());
        assertEquals(expDamage, (Double)result.getParts().get(0).damage());
    }
}
