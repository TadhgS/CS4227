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
public class RoomFactory extends AbstractFactory{

    @Override
    public Room getRoom(String roomsize) {
        if(null != roomsize)
        switch (roomsize) {
            case "small":
                return new SmallRoom();
        //return new MediumRoom();
            case "medium":
                break;
        //return new LargeRoom();
            case "large":
                break;
            default:
                break;
        }
        return null;
    }
}
