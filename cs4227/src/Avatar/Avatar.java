/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avatar;

/**
 *
 * @author Sean
 */
public class Avatar implements AvatarInterface
{
    
     public static int maxHp, currentHp;
     public int atk, score, floor, position, points;
     
    public Avatar()
    {
        this.maxHp = 40;
        currentHp = maxHp;
        this.atk = 2;
        this.score = 0;
        this.floor = 1;
        this.position = 1;
        this.points = 0;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void setPoints(int point)
    {
        this.points += point;
    }
    
    public int getScore()
    {
       return score; 
    }
    
    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public int getHP() 
    {
        return currentHp;
    }

    @Override
    public int getAtk() 
    {
        return this.atk;
    }
    
    @Override
    public void setCurrentHP(int hp)
    {
        this.currentHp = hp;
    }

    @Override
    public void setCurrentAtk(int currentAtk) 
    {
        this.atk = currentAtk;
    }
    

     public Memento saveState()
     {
      return new Memento(currentHp,score,atk,floor,position);
   }


   public void getState(Memento memento)
   {
      currentHp = memento.getHp();
      score = memento.getScore();
      atk = memento.getAtk();
      floor = memento.getFloor();
      position = memento.getPosition();
      
   }
   
    public void setFloor(int floor) 
    {
        this.floor = floor;
    }

    public int getFloor() 
    {
        return floor;
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public void setPosition(int position)
    {
        this.position = position;
    }
}
