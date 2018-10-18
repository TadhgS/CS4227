package Controller;

import Gui.CreateGui;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Daniel
 */
public class Button 
{

    public Button(String pressed)
    {
        switch(pressed)
        {
            case "up":
                up();
                break;
                
            case "down":
                down();
                break;
                
            case "left":
                left();
                break;
                
            case "right":
                right();
                break;
                
            case "attack":
                attack();
                break;
                
            case "run":
                run();
                break;
                
            case "start":
                start();
                break;
        }
    }

    public void up()
    {
        System.out.print("You moved up\n");
        //CreateGui.gameScreenText.setText("You moved up");
    }
    
    public void down()
    {
        System.out.print("You moved down\n");
    }
    
    public void left()
    {
        System.out.print("You moved left\n");
    }
    
    public void right()
    {
        System.out.print("You moved right\n");
    }
    
    public void attack()
    {
        System.out.print("You attacked\n");
    }
    
    public void run()
    {
        System.out.print("You ran away\n");
    }
    
    public void start()
    {
       System.out.print("Game started\n");
       //CreateGui.startButton.setVisible(false);
    }
}
