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
public class MobTile extends Mob
{

    @Override
    public String name() 
    {
        return "Mob";
    }

    @Override
    public Boolean destructable() 
    {
        return false;
    }

    @Override
    public int damage() 
    {
        return 2;
    }
    
}
