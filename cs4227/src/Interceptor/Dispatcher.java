/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.ArrayList;

/**
 *
 * @author Dsims
 */
public class Dispatcher
{
    ArrayList registeredInterceptors = new ArrayList();
    public Dispatcher(){}
    
    public void register(Interceptor i)
    {
        registeredInterceptors.add(i);
    }
    
    public void dispatch()
    {
        ((Interceptor)registeredInterceptors.get(0)).runIntercept();
    }
    
    public void dispatch(String x)
    {
        ((Interceptor)registeredInterceptors.get(0)).runInterceptForScore();
    }
}
