
package Avatar;
import CreateMaze.Room;

class Memento 
{
    private int Hp,score,atk;

    private Room room;
    

    public Memento(int hp,int score,int atk)

    {
        this.Hp = hp;
        this.score = score;
        this.atk = atk;
    }
    
    public Memento(Room room)
    {
        this.room = room;   
    }
    
    public int getHp()
    {
        return Hp;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public int getAtk()
    {
        return atk;

    }
    
    public Room getRoom()
    {
        return room;
    }
    
}
