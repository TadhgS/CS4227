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
class ActionStartCommand implements Command {

    Actions actions;
    public ActionStartCommand(Actions actions)
    {
        this.actions = actions;
    }
    
    @Override
    public void execute() 
    {
        actions.Start();
    }
    
}
