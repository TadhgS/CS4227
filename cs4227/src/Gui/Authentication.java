package Gui;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
class Authentication 
{
    public static boolean authenticate(String username)
    {
        File login = new File();
        ArrayList<String> Info = login.getFile();
	int check = Info.indexOf(username);
        return check != -1;
    } 
}
