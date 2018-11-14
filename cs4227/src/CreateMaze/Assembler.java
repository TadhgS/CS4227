/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14138409
 */
public class Assembler 
{
    private List<Part> parts = new ArrayList<Part>();
        
    public void addPart(Part part)
    {
        parts.add(part);
    }
    
    public List<Part> getParts()
    {
        return parts;
    }
}
