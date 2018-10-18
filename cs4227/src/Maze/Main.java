
package Maze;
import Avatar.Avatar;
import Gui.CreateGui;

/**
 *
 * @author Tadhg
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Avatar a = new Avatar();
        login();
    }
    
    private static void login() 
    {
        Gui.login l = new Gui.login();
        l.setVisible(true);
    }
    
    public static void showMazeGui() 
    {
        CreateGui l = new CreateGui();
        l.setVisible(true);
    }
}
