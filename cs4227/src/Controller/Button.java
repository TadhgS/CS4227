/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class Button 
{

    public static String pressed;
    public Button()
    {
        switch(pressed)
        {
            case "up":
                up();
                
            case "down":
                down();
                
            case "left":
                left();
                
            case "right":
                right();
                
            case "attack":
                attack();
                
            case "run":
                run();
                
            case "start":
                start();
        }
    }

    public void up()
    {
        System.out.print("You moved up");
    }
    
    public void down()
    {
        System.out.print("You moved down");
    }
    
    public void left()
    {
        System.out.print("You moved left");
    }
    
    public void right()
    {
        System.out.print("You moved right");
    }
    
    public void attack()
    {
        System.out.print("You attacked");
    }
    
    public void run()
    {
        System.out.print("You ran away");
    }
    
    public void start()
    {
       System.out.print("Game started");
    }
}
