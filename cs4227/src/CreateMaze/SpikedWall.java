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
public class SpikedWall extends Wall{

    @Override
    public String name()
    {
        return "Spiked Wall";
    }

    @Override
    public Boolean destructable()
    {
        return false;
    }
    
    @Override
    public double damage() 
    {
        return 7.5;
    }

    @Override
    public int position() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
