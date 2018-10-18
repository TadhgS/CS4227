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
    public int setCurrentHP(int currentHp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
