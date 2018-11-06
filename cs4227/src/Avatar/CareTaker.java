package Avatar;

import java.util.ArrayList;
import java.util.List;



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
