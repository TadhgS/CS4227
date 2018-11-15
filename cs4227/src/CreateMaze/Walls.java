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
public class Walls extends Wall{

    @Override
    public String name()
    {
        return "Wall";
    }

    @Override
    public Boolean destructable()
    {
        return false;
    }
    
    @Override
    public double damage() 
    {
        return 0;
    }

    
}
