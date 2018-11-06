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
class Movement 
{
    String name;
    public Movement(String name)
    {
        this.name = name;
    }
    
    public void moveUp()
    {
        System.out.println("Moving Up");
    }
    
    public void moveDown()
    {
        System.out.println("Moving Down");

    }
    public void moveLeft()
    {
        System.out.println("Moving Left");

    }
    public void moveRight()
    {
        System.out.println("Moving Right");

    }
}
