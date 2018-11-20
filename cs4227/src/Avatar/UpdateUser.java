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
        //Checks which button has been pressed
        switch (ae.getActionCommand())
        {
            case "New User":
                //Sends userName to Gui.Authentication.authenticate
                userName = userText.getText();
                security = Gui.Authentication.authenticate(userName);
                if(security == false)
                {
                    try
                    {
                        //opens ./src/Data/loginDetail.txt
                        String filename = "./src/Data/loginDetail.txt";
                        
                        //the true will append the new data
                        FileWriter fw = new FileWriter(filename,true);
                        
                        //appends the string to the file
                        fw.write(userName+"\n");
                        fw.close();
                        
                        JOptionPane.showMessageDialog(null, "Username has been added.", "Added", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Hides update user window and goes back to login window
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
                //Sends userName to Gui.Authentication.authenticate
                userName = userText.getText();
                security = Gui.Authentication.authenticate(userName);
                if(security == true)
                {
                    try
                    {
                        //opens ./src/Data/loginDetail.txt
                        File inputFile = new File("./src/Data/loginDetail.txt");
                        
                        //Creates a temp file with same path as original file
                        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
                        
                        //Reades ./src/Data/loginDetail.txt
                        BufferedReader br = new BufferedReader( new FileReader("./src/Data/loginDetail.txt"));
                        
                        //Prints to the tempFile
                        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
                        String line = null;
                        
                        while((line = br.readLine()) != null)
                        {
                            if(!line.trim().equals(userName))
                            {
                                //While line doesn't equal username print to tempFile
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
                        
                        //Sets update user window to invisible and shows login window
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
