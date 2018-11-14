
package Avatar;
import CreateMaze.Room;

class Memento 
{
    private int Hp;
    private Room room;
    
    public Memento(int hp)
    {
        this.Hp = hp;   
    }
    
    public Memento(Room room)
    {
        this.room = room;   
    }
    
    public int getHp()
    {
        return Hp;
    }
    
    public Room getRoom()
    {
        return room;
    }
    
}
