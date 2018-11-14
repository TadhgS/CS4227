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
public class DestructableWall extends Wall
{
    @Override
    public String name() 
    {
        return "Destructable Wall";
    }

    @Override
    public Boolean destructable() 
    {
        return true;
    }

    @Override
    public double damage() {
        return 0.1;
    }
    
}
