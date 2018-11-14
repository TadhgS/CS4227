
package Avatar;
import CreateMaze.Room;

class Memento 
{
    private int Hp,Score,attack;
    private Room room;
    
    public Memento(int hp,int score,int attack)
    {
        this.Hp = hp;  
        this.Score = score;
        this.attack = attack;
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
        return Score;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public Room getRoom()
    {
        return room;
    }
    
}
