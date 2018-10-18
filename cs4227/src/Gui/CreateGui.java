package Gui;

import javax.swing.*;
import java.awt.event.*;
import Controller.Button;

/**
 *
 * @author Daniel
 */
public class CreateGui extends JFrame implements ActionListener 
{
    public static JButton upButton, downButton, leftButton, rightButton, attackButton, runButton, startButton;
    public static JTextField userText, scoreText, healthText, timerText, gameScreenText;
    
    public CreateGui()
    {
        setTitle("The Maze");
        setLayout(null);
        setSize(800,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField userText = new JTextField();
        userText.setBounds(1, 1, 100, 25);
        userText.setEditable(false);
        add(userText);
        
        JTextField scoreText = new JTextField();
        scoreText.setBounds(110, 1, 100, 25);
        scoreText.setEditable(false);
        add(scoreText);
        
        JTextField healthText = new JTextField();
        healthText.setBounds(220, 1, 100, 25);
        healthText.setEditable(false);
        add(healthText);
        
        JTextField timerText = new JTextField();
        timerText.setBounds(330, 1, 100, 25);
        timerText.setEditable(false);
        add(timerText);
        
        JTextField gameScreenText = new JTextField();
        gameScreenText.setBounds(1, 30, 500, 300);
        gameScreenText.setText("");
        gameScreenText.setEditable(false);
        add(gameScreenText);
        
        JButton upButton = new JButton("Up");
        upButton.setBounds(600, 180, 80, 25);
        upButton.addActionListener(this);
        add(upButton);
        
        JButton downButton = new JButton("Down");
        downButton.setBounds(600, 205, 80, 25);
        downButton.addActionListener(this);
        add(downButton);
        
        JButton leftButton = new JButton("Left");
        leftButton.setBounds(520, 190, 80, 25);
        leftButton.addActionListener(this);
        add(leftButton);
        
        JButton rightButton = new JButton("Right");
        rightButton.setBounds(680, 190, 80, 25);
        rightButton.addActionListener(this);
        add(rightButton);
        
        JButton attackButton = new JButton("Attack");
        attackButton.setBounds(520, 215, 80, 25);
        attackButton.addActionListener(this);
        add(attackButton);
        
        JButton runButton = new JButton("Run");
        runButton.setBounds(680, 215, 80, 25);
        runButton.addActionListener(this);
        add(runButton);
        
        JButton startButton = new JButton("Start");
        startButton.setBounds(600, 230, 80, 25);
        startButton.addActionListener(this);
        add(startButton);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String pressed;
        switch(e.getActionCommand())
        {
            case "Up":
                pressed = "up";
                Button up = new Button(pressed);
                break;

            case "Down":
                pressed = "down";
                Button down = new Button(pressed);
                break;
                
            case "Left":
                pressed = "left";
                Button left = new Button(pressed);
                break;
            
            case "Right":
                pressed = "right";
                Button right = new Button(pressed);
                break;
                
            case "Attack":
                pressed = "attack";
                Button attack = new Button(pressed);
                break;
                
            case "Run":
                pressed = "run";
                Button run = new Button(pressed);
                break;
                
            case "Start":
                pressed = "start";
                Button start = new Button(pressed);
                break;
        }
    }
    
}
