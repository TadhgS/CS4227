/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 *
 * @author Tadhg
 */
public class Adapter implements AdapterInterface
{

    Sounds adaptee;
    
    public Adapter(Sounds adaptee)
    {
        this.adaptee = adaptee;
    }
    @Override
    public void request(String action) 
    {
        try {
            //Sends action to Sounds.playSound
            this.adaptee.playSound(action);
        } catch (IOException ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Adapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}