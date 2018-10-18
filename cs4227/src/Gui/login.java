package Gui;

import java.awt.event.*;
import javax.swing.*;
import Maze.Main;

/**
 *
 * @author Daniel
 */
public class login extends JFrame implements ActionListener
{
    
    private static boolean security;
    private JButton loginButton, newUser;
    private final JTextField userText;
    public static String userName = "";
    
    public login()
    {
        setTitle("Login");
        setLayout(null);
        setSize(300, 155);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        add(userText);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(160, 80, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);
        
        newUser = new JButton("New User");
        newUser.setBounds(50, 80, 100, 25);
        newUser.addActionListener(this);
        add(newUser);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch (e.getActionCommand())
        {
            case "Login":
            userName = userText.getText();
            security = Authentication.authenticate(userName);
            if(security == false)
            {
                JOptionPane.showMessageDialog(null, "Invalid username", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                setVisible(false);
                Maze.Main.showMazeGui();
            }
            break;
            
            //case "New User":
                
        }
    } 
}