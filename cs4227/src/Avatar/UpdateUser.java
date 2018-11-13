package Avatar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class UpdateUser extends JFrame implements ActionListener
{

    private static boolean security;
    private final JButton newUser;
    private final JButton deleteUser;
    private final JTextField userText;
    public static String userName = "";
    
    public UpdateUser()
    {
        setTitle("Update User");
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
        
        newUser = new JButton("New User");
        newUser.setBounds(20, 80, 110, 25);
        newUser.addActionListener(this);
        add(newUser);
        
        deleteUser = new JButton("Delete User");
        deleteUser.setBounds(160, 80, 110, 25);
        deleteUser.addActionListener(this);
        add(deleteUser);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        switch (ae.getActionCommand())
        {
            case "New User":
                userName = userText.getText();
                security = Gui.Authentication.authenticate(userName);
                if(security == false)
                {
                    try
                    {
                        String filename = "./src/Data/loginDetail.txt";
                        FileWriter fw = new FileWriter(filename,true); //the true will append the new data
                        fw.write(userName+"\n");//appends the string to the file
                        fw.close();
                        
                        JOptionPane.showMessageDialog(null, "Username has been added.", "Added", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        Gui.login l = new Gui.login();
                        l.setVisible(true);
                    }
                    catch(IOException ioe)
                    {
                        System.err.println("IOException: " + ioe.getMessage());
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            break;
            
            case "Delete User":
                userName = userText.getText();
                security = Gui.Authentication.authenticate(userName);
                if(security == true)
                {
                    try
                    {
                        File inputFile = new File("./src/Data/loginDetail.txt");
                        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
                        BufferedReader br = new BufferedReader( new FileReader("./src/Data/loginDetail.txt"));
                        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
                        String line = null;
                        
                        while((line = br.readLine()) != null)
                        {
                            if(!line.trim().equals(userName))
                            {
                                pw.println(line);
                                pw.flush();
                            }
                        }
                        pw.close();
                        br.close();
                        
                        if(!inputFile.delete())
                        {
                            System.out.println("File could not be deleted");
                        }
                        
                        if (!tempFile.renameTo(inputFile))
                        {
                            System.out.println("Could not rename file");
                        }
                        
                        JOptionPane.showMessageDialog(null, "Username has been deleted.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        Gui.login l = new Gui.login();
                        l.setVisible(true);
                    }
                    catch(FileNotFoundException ex)
                    {
                    }
                    catch (IOException ex) 
                    {
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username does not exist.", "Alert", JOptionPane.ERROR_MESSAGE);    
                }
        }
    }
}
