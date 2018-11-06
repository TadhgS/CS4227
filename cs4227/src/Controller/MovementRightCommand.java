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
public class MovementRightCommand implements Command {

    Movement movement;
    public MovementRightCommand(Movement movement)
    {
        this.movement = movement;
    }
    
    @Override
    public void execute() 
    {
        movement.moveRight();
    }
    
}
