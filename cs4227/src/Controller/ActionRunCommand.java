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
public class ActionRunCommand implements Command {

    Actions actions;
    public ActionRunCommand(Actions actions)
    {
        this.actions = actions;
    }
    
    @Override
    public void execute() 
    {
        actions.Run();
    }
    
}