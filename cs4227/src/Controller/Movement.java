/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author danie
 */
class Movement 
{
    String name;
    public Movement(String name)
    {
        this.name = name;
    }
    
    public void moveUp()
    {
        PlayerDisplayInfo.movementAction = "Moving Up";
    }
    
    public void moveDown()
    {
        PlayerDisplayInfo.movementAction = "Moving Down";

    }
    public void moveLeft()
    {
        PlayerDisplayInfo.movementAction = "Moving Left";

    }
    public void moveRight()
    {
        PlayerDisplayInfo.movementAction = "Moving Right";
    }
}
