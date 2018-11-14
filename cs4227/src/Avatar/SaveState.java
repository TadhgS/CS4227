package Avatar;

import java.util.ArrayList;
import java.util.List;



public class SaveState
{
    private List<Memento> hpMementoList = new ArrayList<Memento>();
    private List<Memento> roomMementoList = new ArrayList<Memento>();
    
    public void addHp(Memento State)
    {
        hpMementoList.add(State);
    }
    
    public Memento getHp(int i)
    {
        return hpMementoList.get(i);
    }
    
    public void addRoom(Memento State)
    {
        roomMementoList.add(State);
    }
    
    public Memento getRoom(int i)
    {
        return roomMementoList.get(i);
    }

    public void addAvatar(Memento saveState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
