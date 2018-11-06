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
public class MovementLeftCommand implements Command {

    Movement movement;
    public MovementLeftCommand(Movement movement)
    {
        this.movement = movement;
    }
    
    @Override
    public void execute() 
    {
        movement.moveLeft();
    }
    
}
