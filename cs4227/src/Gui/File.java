package Gui;

/**
 *
 * @author Daniel
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class File 
{
    public ArrayList<String> getFile()
    {
        ArrayList<String> myList = new ArrayList<>();
        String fileToParse = "./src/Data/loginDetail.txt";
        
        BufferedReader fileReader = null;
         
        try
        {
            String line;
            
            fileReader = new BufferedReader(new FileReader(fileToParse));
             
            
            while ((line = fileReader.readLine()) != null)
            {
                
                String[] tokens = line.split(",");
                myList.addAll(Arrays.asList(tokens));
            }
        }
        catch (IOException e) 
        {
        }
        finally
        {
            try 
            {
                fileReader.close();
            } 
            catch (IOException e)
            {
            }
        }
        return myList;
    }
}
