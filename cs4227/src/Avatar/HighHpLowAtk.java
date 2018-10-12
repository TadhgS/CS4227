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
public class HighHpLowAtk extends AvatarDecorator{
     public  HighHpLowAtk(Avatar avatar) {
        super(avatar);
    }
    
  
    @Override
    public int getHP() {
       return avatar.getHP() + 10;
    }

    @Override
    public int getAtk() {
        return avatar.getAtk() - 1;
    }
}