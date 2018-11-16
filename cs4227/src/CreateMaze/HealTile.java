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
public class HealTile extends Heal
{

    @Override
    public String name() 
    {
        return "Heal";
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
