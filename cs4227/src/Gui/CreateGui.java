package Gui;

import Avatar.Avatar;
import javax.swing.*;
import java.awt.event.*;
import Controller.Command;
import Controller.Button;
import Interceptor.ConcreteInterceptor;
import Interceptor.ContextObject;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CreateGui extends JFrame implements ActionListener 
{
    Avatar a = new Avatar();
    public static JButton upButton, downButton, leftButton, rightButton, attackButton, runButton, startButton;
    public static JTextField userText, scoreText, healthText, timerText;
    public static JTextArea gameScreenText, gameText;
    public int characterPosition = 1;
    
    public CreateGui()
    {
        setTitle("The Maze");
        setLayout(null);
        setSize(800,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        userText = new JTextField();
        userText.setBounds(1, 1, 150, 25);
        userText.setEditable(false);
        userText.setText("Username: " + login.userName);
        add(userText);
        
        scoreText = new JTextField();
        scoreText.setBounds(210, 1, 100, 25);
        scoreText.setText("Coins: ");
        scoreText.setEditable(false);
        add(scoreText);
        
        healthText = new JTextField();
        healthText.setBounds(320, 1, 100, 25);
        healthText.setText("Health: " /*+ Avatar.Avatar.getHP()*/);
        healthText.setEditable(false);
        add(healthText);
        
        /*timerText = new JTextField();
        timerText.setBounds(430, 1, 100, 25);
        timerText.setText("Timer: ");
        timerText.setEditable(false);
        add(timerText);*/
        
        gameScreenText = new JTextArea();
        gameScreenText.setBounds(1, 30, 500, 300);
        gameScreenText.setText("");
        gameScreenText.setEditable(false);
        gameScreenText.setFont(gameScreenText.getFont().deriveFont(20f));
        add(gameScreenText);
        
        
        gameText = new JTextArea();
        gameText.setText("");
        gameText.setEditable(false);
        gameText.setFont(gameText.getFont().deriveFont(10f));
        
        JScrollPane scroll = new JScrollPane(gameText);
        scroll.setBounds(510, 10, 280, 200);
        scroll.setPreferredSize(new Dimension(290,200));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
        
        
        
        upButton = new JButton("Up");
        upButton.setBounds(600, 240, 80, 25);
        upButton.addActionListener(this);
        add(upButton);
        upButton.setVisible(false);
        
        downButton = new JButton("Down");
        downButton.setBounds(600, 265, 80, 25);
        downButton.addActionListener(this);
        add(downButton);
        downButton.setVisible(false);
        
        leftButton = new JButton("Left");
        leftButton.setBounds(520, 255, 80, 25);
        leftButton.addActionListener(this);
        add(leftButton);
        leftButton.setVisible(false);
        
        rightButton = new JButton("Right");
        rightButton.setBounds(680, 255, 80, 25);
        rightButton.addActionListener(this);
        add(rightButton);
        rightButton.setVisible(false);
        
        attackButton = new JButton("Attack");
        attackButton.setBounds(520, 300, 80, 25);
        attackButton.addActionListener(this);
        add(attackButton);
        attackButton.setVisible(false);
        
        runButton = new JButton("Run");
        runButton.setBounds(680, 300, 80, 25);
        runButton.addActionListener(this);
        add(runButton);
        runButton.setVisible(false);
        
        startButton = new JButton("Start");
        startButton.setBounds(600, 300, 80, 25);
        startButton.addActionListener(this);
        add(startButton);
        
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(600, 325, 80, 25);
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
        else if("Start".equals(e.getActionCommand()))
        {
            startGame();
        }
        else
        {
            Button.buttonRemote(e.getActionCommand());
        }
    }
    
    
    public void startGame()
    {
        upButton.setVisible(true);
        downButton.setVisible(true);
        leftButton.setVisible(true);
        rightButton.setVisible(true);
        runButton.setVisible(true);
        attackButton.setVisible(true);
        
        gameScreenText.setText(gameScreenText.getText() +"game start \n");
        
        CreateMaze.AbstractFactory roomFactory;
        roomFactory = CreateMaze.FactoryProducer.getFactory("room");
        CreateMaze.Room room = roomFactory.getRoom("small");
        ArrayList t = room.createTiles();
        ArrayList w = room.createWalls();
        CreateMaze.Assembler x = null;
        
        
        
        //Wall and Tile tests
        for(int i = 0; i< w.size(); i ++ )
        {
            x = (CreateMaze.Assembler)w.get(i);
            if(x.getParts().size() > 1)
                gameText.setText(gameText.getText() + x.getParts().get(0).name() + x.getParts().get(1).name() +  "\n");
            else
                gameText.setText(gameText.getText() + x.getParts().get(0).name() + "\n");
            
        }
        
        for(int i = 0; i< t.size(); i ++ )
        {
            x = (CreateMaze.Assembler)t.get(i);
            gameText.setText(gameText.getText() + x.getParts().get(0).name() + "\n");
        }
        
    } 
}
