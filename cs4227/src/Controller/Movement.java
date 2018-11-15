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
        PlayerDisplayInfo.movementResult = "-2";
    }
    
    public void moveDown()
    {
        PlayerDisplayInfo.movementAction = "Moving Down";
        PlayerDisplayInfo.movementResult = "+2";

    }
    public void moveLeft()
    {
        PlayerDisplayInfo.movementAction = "Moving Left";
        PlayerDisplayInfo.movementResult = "-1";

    }
    public void moveRight()
    {
        PlayerDisplayInfo.movementAction = "Moving Right";
        PlayerDisplayInfo.movementResult = "+1";

    }
}
