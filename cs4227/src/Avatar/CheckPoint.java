package Avatar;

import java.util.ArrayList;
import java.util.List;



public class CheckPoint
{
    private List<Memento> avatarMementoList = new ArrayList<Memento>();
    private List<Memento> roomMementoList = new ArrayList<Memento>();
    
    public void addAvatar(Memento State)
    {
        avatarMementoList.add(State);
    }
    
    public Memento getAvatar(int i)
    {
        return avatarMementoList.get(i);
    }
    
    public Memento getLastAvatar()
    {
        return avatarMementoList.get(avatarMementoList.size()-1);
    }
    
    public void addRoom(Memento State)
    {
        roomMementoList.add(State);
    }
    
    public Memento getRoom(int i)
    {
        return roomMementoList.get(i);
    }
    
}
