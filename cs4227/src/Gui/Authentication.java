package Gui;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Authentication 
{
    public static boolean authenticate(String username)
    {
        //Creates login of type File
        File login = new File();
        //Creates arraylist which equals login.getFile()
        ArrayList<String> Info = login.getFile();
        //If username is in info it will return check as true
	int check = Info.indexOf(username);
        return check != -1;
    } 
}
