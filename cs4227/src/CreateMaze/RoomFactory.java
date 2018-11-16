/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author David Sims
 */
public class RoomFactory extends AbstractFactory
{

    @Override
    public Room getRoom(String roomsize) 
    {
        if(null != roomsize)
        switch (roomsize) {
            case "Small":
                return new SmallRoom();
            case "Medium":
                return new MediumRoom();
        //return new LargeRoom();
            case "Large":
                return new LargeRoom();
            default:
                break;
        }
        return null;
    }
}
