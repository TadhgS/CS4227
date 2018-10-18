
package Maze;
import Gui.CreateGui;

/**
 *
 * @author Tadhg
 */
public class Main 
{
    public static void main(String[] args) 
    {
        showGui();
    }

    private static void showGui() 
    {
        CreateGui l = new CreateGui();
        l.setVisible(true);
    }
    
}
