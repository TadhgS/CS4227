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
        System.out.println("Starting Game...");
    }
    
    public void Attack()
    {
        action = "attack";
        target.request(action);
        System.out.println("You Attack");

    }
    public void Run()
    {
        action = "run";
        target.request(action);
        System.out.println("You Run Away");

    }   
}
