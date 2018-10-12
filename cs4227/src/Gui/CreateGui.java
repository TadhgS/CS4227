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
    private JButton upButton, downButton, leftButton, rightButton, attackButton, runButton, startButton;
    private JTextField userText, scoreText, healthText, timerText;
    
    public CreateGui()
    {
        setTitle("The Maze");
        setLayout(null);
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton upButton = new JButton("Up");
        upButton.setBounds(180, 80, 80, 25);
        upButton.addActionListener(this);
        add(upButton);
        
        JButton downButton = new JButton("Down");
        downButton.setBounds(180, 80, 80, 25);
        downButton.addActionListener(this);
        add(downButton);
        
        JButton leftButton = new JButton("Left");
        leftButton.setBounds(180, 80, 80, 25);
        leftButton.addActionListener(this);
        add(leftButton);
        
        JButton rightButton = new JButton("Right");
        rightButton.setBounds(180, 80, 80, 25);
        rightButton.addActionListener(this);
        add(rightButton);
        
        JButton attackButton = new JButton("Attack");
        attackButton.setBounds(180, 80, 80, 25);
        attackButton.addActionListener(this);
        add(attackButton);
        
        JButton runButton = new JButton("Run");
        runButton.setBounds(180, 80, 80, 25);
        runButton.addActionListener(this);
        add(runButton);
        
        JButton startButton = new JButton("Start");
        startButton.setBounds(180, 80, 80, 25);
        startButton.addActionListener(this);
        add(startButton);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      Button pressed = new Button(e);
        switch(e.getActionCommand())
        {
            case "Up":
                pressed == "up";
                
            case "Down":
                //Button pressed = new Button("down");
        }
    }
    
}
