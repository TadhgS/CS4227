/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author William
 */
public class Tiles extends Tile{

    @Override
    public String name()
    {
        return "Tile";
    }

    @Override
    public Boolean destructable()
    {
        return false;
    }
    
    @Override
    public int damage() 
    {
        return 0;
    }

    
}
