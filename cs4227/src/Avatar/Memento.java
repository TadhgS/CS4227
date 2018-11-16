
package Avatar;

class Memento 
{
    private int Hp,score,atk,floor,position;
    

    public Memento(int hp,int score,int atk, int floor, int position)

    {
        this.Hp = hp;
        this.score = score;
        this.atk = atk;
        this.floor = floor;
        this.position = position;
        
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
    
    public int getFloor()
    {
        return floor;
    }
    
    public int getPosition()
    {
        return position;
    }
    
}
