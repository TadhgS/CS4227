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

import java.util.ArrayList;

public class CreateRoom extends AbstractRoom{
    
        boolean door = false;
        ArrayList tiles = new ArrayList();
        ArrayList walls = new ArrayList();
        int[] wallsArr;
        int[] tilesArr;
        
        @Override
        public Room CreateRoom(){
            for(int i = 0; i < 8; i++){
                wallsArr[i] = (int) (Math.random() * 4) ;
            }
            for(int j = 0; j < 8; j++){
                if(wallsArr[j] == 1){
                    walls.add(createSpikedWall());
                }
                else if(wallsArr[j] == 2){
                    walls.add(createDestructableWall());
                }  
                else if(wallsArr[j] == 3){
                    walls.add(createSolidWall());
                }  
                else if(wallsArr[j] == 4 && door == true){
                    wallsArr[j] = (int) (Math.random() * 3) ;
                        if(wallsArr[j] == 1){
                            walls.add(createSpikedWall());
                        }
                        else if(wallsArr[j] == 2){
                            walls.add(createDestructableWall());
                        }  
                        else{
                            walls.add(createSolidWall());
                        }  
                }
                else
                    walls.add(createDoorWall());
            }
            //For extensiblity tiles can copy walls to create new types of tiles (mob tiles, pitfalls, etc.)
            
            for(int t = 0; t < 4; t++){
                tiles.add(createTile());
            }
            
            
            return null;
        }