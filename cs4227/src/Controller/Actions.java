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
public class Actions 
{
    String name;
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
        System.out.println("You Attack");

    }
    public void Run()
    {
        System.out.println("You Run Away");

    }   
}
