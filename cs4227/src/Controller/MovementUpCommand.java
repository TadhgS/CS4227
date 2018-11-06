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
public class MovementUpCommand implements Command {

    Movement movement;
    public MovementUpCommand(Movement movement)
    {
        this.movement = movement;
    }
    
    @Override
    public void execute() 
    {
        movement.moveUp();
    }
    
}
