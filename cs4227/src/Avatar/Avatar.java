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
public class Avatar implements AvatarInterface{
    
     protected int hp;
     protected int atk;
     
    public Avatar(int hp, int atk){
        this.hp = 40;
        this.atk = 2;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public int getAtk() {
        return this.atk;
    }

   
    
}
