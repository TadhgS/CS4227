/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author William
 */

import Avatar.Avatar;
import Avatar.CareTaker;
import java.util.ArrayList;

public class CreateRoom
{
        boolean door = false;
        ArrayList tiles = new ArrayList();
        ArrayList walls = new ArrayList();
        int[] wallsArr;
        int[] tilesArr;
        RoomPartBuilder builder = new RoomPartBuilder();
        
        public ArrayList CreateWalls(int size){
            door = false;
            
            wallsArr = new int[size*4];
            for(int i = 0; i < size*4; i++){
                wallsArr[i] = (int) ((Math.random() * 4)+1) ;
            }
            for(int j = 0; j < size*4; j++){
                if(wallsArr[j] == 1){
                    walls.add(builder.createSpikedWall());
                }
                else if(wallsArr[j] == 2){
                    walls.add(builder.createDestructableWall());
                }  
                else if(wallsArr[j] == 3){
                    walls.add(builder.createSolidWall());
                }  
                else if(wallsArr[j] == 4 && door == true){
                    wallsArr[j] = (int) ((Math.random() * 3)+1) ;
                    switch (wallsArr[j]) {
                        case 1:
                            walls.add(builder.createSpikedWall());
                            break;
                        case 2:
                            walls.add(builder.createDestructableWall());
                            break;
                        default:
                            walls.add(builder.createSolidWall());
                            break;  
                    }
                }
                else
                {
                    walls.add(builder.createDoorWall());
                    door = true;
                }
            }
            //For extensiblity tiles can copy walls to create new types of tiles (mob tiles, pitfalls, etc.)
            
            Avatar avatar = new Avatar();
            CareTaker careTaker = new CareTaker();
            
            avatar.setState();
            careTaker.add(avatar.saveState());
            
            
            avatar.setState();
            careTaker.add(avatar.saveState());
            return walls;
        }
            
        public ArrayList CreateTiles(int size){
            tilesArr = new int[size*size];
            for(int i = 0; i < size*size; i++){
                tilesArr[i] = (int) ((Math.random() * 4)+1) ;
            }
            
            for(int t = 0; t < size*size ; t++){
                
                switch (tilesArr[t]) {
                    case 1:
                         tiles.add(builder.createPlainTile());
                         break;
                    case 2:
                        tiles.add(builder.createMobTile());
                        break;
                    case 3:
                        tiles.add(builder.createHealTile());
                        break;
                    default:
                        tiles.add(builder.createCoinTile());
                        break;
                }          
            }
        return tiles;
        }
}
