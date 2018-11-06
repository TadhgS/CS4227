/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avatar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tadhg
 */
public class CareTaker 
{
    private List<Memento> mementoList = new ArrayList<Memento>();
    
    public void add(Memento hpState)
    {
        mementoList.add(hpState);
    }
    
    public Memento get(int i)
    {
        return mementoList.get(i);
    }
    
}
