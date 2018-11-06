/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author Sean
 */
public class CoinTile  extends Tile
{

    @Override
    public String name() 
    {
        return "Coin Tile";
    }

    @Override
    public Boolean destructable() 
    {
        return false;
    }

    @Override
    public double damage() 
    {
        return 0.0;
    }
    
}
