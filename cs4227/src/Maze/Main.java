
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
        showGui();
    }
    
    private static void showGui() 
    {
        CreateGui l = new CreateGui();
        l.setVisible(true);
    }
}
