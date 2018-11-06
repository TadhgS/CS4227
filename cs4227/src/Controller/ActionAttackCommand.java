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
public class ActionAttackCommand implements Command {

    Actions actions;
    public ActionAttackCommand(Actions actions)
    {
        this.actions = actions;
    }
    
    @Override
    public void execute() 
    {
        actions.Attack();
    }
    
}