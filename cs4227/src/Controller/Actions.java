/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.Sounds;
import Data.Adapter;
import Data.AdapterInterface;

/**
 *
 * @author danie
 */
public class Actions 
{
    String name;
    String action;
    AdapterInterface target = new Adapter(new Sounds());
    public Actions(String name)
    {
        this.name = name;
    }
    
    public void Start()
    {
        PlayerDisplayInfo.movementAction = "Starting Game ...";
    }
    
    public void Attack()
    {
        action = "attack";
        //Sends action to AdapterInterface
        target.request(action);
        PlayerDisplayInfo.movementAction = "You Attack the Enemy\n" + "Oh......You didnt die....yet\n"; 
    }
    public void Run()
    {
        action = "run";
        //Sends action to AdapterInterface
        target.request(action);
        PlayerDisplayInfo.movementAction = "You ran... like a coward\n";
    }   
}
