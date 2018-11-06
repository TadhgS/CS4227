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
class Remote 
{
    Command command;
    
    public Remote()
    {}
    
    public void setCommand(Command command)
    {
        this.command = command;
    }
    
    public void buttonPressed()
    {
        command.execute();
    }
}
