package Gui;

import javax.swing.*;
import java.awt.event.*;
import Controller.Command;
import Controller.Button;
import Interceptor.ConcreteInterceptor;
import Interceptor.ContextObject;

/**
 *
 * @author Daniel
 */
public class CreateGui extends JFrame implements ActionListener 
{
    public static JButton upButton, downButton, leftButton, rightButton, attackButton, runButton, startButton, logoutButton;
    public static JTextField userText, scoreText, healthText, timerText, gameScreenText;
    
    public CreateGui()
    {
        setTitle("The Maze");
        setLayout(null);
        setSize(800,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField userText = new JTextField();
        userText.setBounds(1, 1, 150, 25);
        userText.setEditable(false);
        userText.setText("Username: " + login.userName);
        add(userText);
        
        JTextField scoreText = new JTextField();
        scoreText.setBounds(210, 1, 100, 25);
        scoreText.setText("Score: ");
        scoreText.setEditable(false);
        add(scoreText);
        
        JTextField healthText = new JTextField();
        healthText.setBounds(320, 1, 100, 25);
        healthText.setText("Health: " /*+ Avatar.Avatar.getHP()*/);
        healthText.setEditable(false);
        add(healthText);
        
        JTextField timerText = new JTextField();
        timerText.setBounds(430, 1, 100, 25);
        timerText.setText("Timer: ");
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
        
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(600, 300, 80, 25);
        logoutButton.addActionListener(this);
        add(logoutButton);
        
    }

    Command command;
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if("Logout".equals(e.getActionCommand()))
        {
            setVisible(false);
            ContextObject cO = new ContextObject();
            ConcreteInterceptor IC = new ConcreteInterceptor(cO);
            Gui.login l = new Gui.login();
            l.setVisible(true);
        }
        else
        {
            Button.buttonRemote(e.getActionCommand());
        }
    }
}
