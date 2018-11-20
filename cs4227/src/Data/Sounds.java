/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Controller.PlayerDisplayInfo;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



/**
 *
 * @author Tadhg
 */
public class Sounds 
{
    public void playSound(String action) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException 
    {
     
        AudioInputStream ais;
        Clip clip;
        
        if(action == "attack")
        {
            //Attack button plays this sound
                PlayerDisplayInfo.soundMade = "*Sword Sounds*";
                ais = AudioSystem.getAudioInputStream(new File("./src/Data/sword_cutting_through_air.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
                Thread.sleep(2000);
                clip.stop();
        }
                  
        else if(action == "run")
        {
            //Run button plays this sound
               PlayerDisplayInfo.soundMade = "*Running Sound*";
                ais = AudioSystem.getAudioInputStream(new File("./src/Data/person_running_on_pavement.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
                Thread.sleep(2000);
                clip.stop();
        }
        
    }
    
}