/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import Avatar.Avatar;
import Gui.login;
import java.io.*;

/**
 *
 * @author Dsims
 */
public class ConcreteInterceptor implements Interceptor 
{
    String name;
    public ConcreteInterceptor()
    {
        
    }
    
    public ConcreteInterceptor(ContextObject CO)
    {
        String inOut = CO.inOut;
        name = login.userName;
        String date = CO.now.toString();
        
        try
        {
            String fileName = "./src/Data/logDetails.txt";
            FileWriter fw = new FileWriter(fileName,true); //the true will append the new data
            fw.write(name + inOut + date + "\n");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    
    public ConcreteInterceptor(Avatar a)
    {
        int score = a.getScore();
        name = login.userName;
        try
        {
            String fileName = "./src/Data/leaderBoard.txt";
            FileWriter fw = new FileWriter(fileName,true); //the true will append the new data
            fw.write(name + " " + score + "\n");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
