package Gui;

import Interceptor.ConcreteInterceptor;
import Interceptor.Dispatcher;
import Interceptor.ContextObject;
import Interceptor.Interceptor;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class login extends JFrame implements ActionListener
{
    
    private static boolean security;
    private final JButton loginButton;
    private final JButton updateUser;
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
        
        updateUser = new JButton("Update User");
        updateUser.setBounds(20, 80, 110, 25);
        updateUser.addActionListener(this);
        add(updateUser);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //Checks what buuton was clicked
        switch (e.getActionCommand())
        {
            case "Login":
            userName = userText.getText();
            //Takes userName and sends to Authentication.authenticate()
            security = Authentication.authenticate(userName);
            if(security == false)
            {
                JOptionPane.showMessageDialog(null, "Invalid username", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //Creates instances for the interceptor
                ContextObject cO = new ContextObject(userName);
                Dispatcher dispatcher = new Dispatcher();
                Interceptor IC = new ConcreteInterceptor(cO);
                dispatcher.register(IC);
                dispatcher.dispatch();
                //Hides login window and calls to create game window
                setVisible(false);
                Maze.Main.showMazeGui();
            }
            break;
            
            case "Update User":
                //Hides login window and calls below to create update user window
                setVisible(false);
                Avatar.UpdateUser u = new Avatar.UpdateUser();
                u.setVisible(true);
                 
        }
    } 
}