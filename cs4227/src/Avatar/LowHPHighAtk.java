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
//decorator character, not implemented
public class LowHPHighAtk extends AvatarDecorator{

    public LowHPHighAtk(Avatar avatar) {
        super(avatar);
    }
    
  
    @Override
    public int getHP() {
       return avatar.getHP() - 10;
    }

    @Override
    public int getAtk() {
        return avatar.getAtk() + 1;
    }

    @Override
    public void setCurrentHP(int currentHp) {
        avatar.currentHp = currentHp;
    }

    @Override
    public void setCurrentAtk(int currentAtk) {
        avatar.atk = currentAtk;
    }
}
