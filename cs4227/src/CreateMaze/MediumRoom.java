/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

import java.util.ArrayList;

/**
 *
 * @author Dsims
 */
public class MediumRoom implements Room{

    CreateRoom createRoom = new CreateRoom();
    
    @Override
    public ArrayList createWalls() {
        ArrayList CreateWalls = createRoom.CreateWalls(3);
        return CreateWalls;
    }

    @Override
    public ArrayList createTiles() {
        ArrayList CreateTiles = createRoom.CreateTiles(3);
        return CreateTiles;
    }
    
}
