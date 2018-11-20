/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Avatar.Avatar;

/**
 *
 * @author Dsims
 */
public class ContextObject 
{
    String userName = "";
    DateTimeFormatter dtf;
    LocalDateTime now;
    String inOut ;
    int score;
    
    public ContextObject(String n)
    {
        //Sends data when user logs in
        userName = n;
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        now = LocalDateTime.now();
        inOut = " logged in ";
    }
    public ContextObject()
    {
        //Sends data when user logs out
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        now = LocalDateTime.now();
        inOut = " logged out at ";
    }
    public ContextObject(Avatar a)
    {
        //Wehn user dies sends users score
        score = a.getPoints();
        now =LocalDateTime.now();
    }
    
}
