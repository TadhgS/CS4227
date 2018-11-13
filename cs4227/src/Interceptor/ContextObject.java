/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

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
    
    public ContextObject(String n)
    {
        userName = n;
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        now = LocalDateTime.now();
        inOut = " logged in ";
    }
    public ContextObject()
    {
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        now = LocalDateTime.now();
        inOut = " logged out at ";
    }
    
}
