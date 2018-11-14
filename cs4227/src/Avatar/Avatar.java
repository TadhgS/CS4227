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
     public int atk, score;
     
    public Avatar()
    {
        this.maxHp = 40;
        this.atk = 2;
        this.score = 0;
    }
    
    public int getScore()
    {
       return score; 
    }
    
    public void setScore(int score)
    {
        this.score += score;
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

    public int setState()
    {
        return this.currentHp;
    }
    
    public Memento saveState()
    {
     return new Memento(currentHp,score,atk);
    }

   public void getState(Memento memento)
   {
      currentHp = memento.getHp();
   }

   
    
}