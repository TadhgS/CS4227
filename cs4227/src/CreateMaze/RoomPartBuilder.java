/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author 14138409
 */
public class RoomPartBuilder 
{
    //uses the builder to create different types of walls and tiles
    public Assembler createSpikedWall()
    {
        Assembler part = new Assembler();
        part.addPart(new Walls());
        part.addPart(new SpikedWall());
        return part;
    }
    
    public Assembler createDoorWall()
    {
        Assembler part = new Assembler();
        part.addPart(new Walls());
        part.addPart(new DoorWall());
        return part;
    }
    
    public Assembler createDestructableWall()
    {
        Assembler part = new Assembler();
        part.addPart(new Walls());
        part.addPart(new DestructableWall());
        return part;
    }
        
    public Assembler createSolidWall()
    {
        Assembler part = new Assembler();
        part.addPart(new Walls());
        part.addPart(new MetalWall());
        return part;
        
    }
    
    public Assembler createPlainTile()
    {
        Assembler part = new Assembler();
        part.addPart(new Tiles());
        part.addPart(new CobbleTile());
        return part;
    }
    
    public Assembler createMobTile()
    {
        Assembler part = new Assembler();
        part.addPart(new Tiles());
        part.addPart(new MobTile());
        return part;
    }
    
    public Assembler createHealTile()
    {
        Assembler part = new Assembler();
        part.addPart(new Tiles());
        part.addPart(new HealTile());
        return part;
    }
        
    public Assembler createCoinTile()
    {
        Assembler part = new Assembler();
        part.addPart(new Tiles());
        part.addPart(new CoinTile());
        return part;
        
    }       
}
