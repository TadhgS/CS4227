
package Maze;

import Avatar.Avatar;
import Gui.CreateGui;
import Interceptor.ConcreteInterceptor;
import Interceptor.Dispatcher;

/**
 *
 * @author Tadhg
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Interceptor.ConcreteInterceptor i = new ConcreteInterceptor();
        //Interceptor.Dispatcher d = new Dispatcher(i);
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
