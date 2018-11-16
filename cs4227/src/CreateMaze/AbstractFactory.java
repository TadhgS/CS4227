/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author David Sims
 */
public abstract class AbstractFactory 
{
    public abstract Room getRoom(String roomsize);
}
