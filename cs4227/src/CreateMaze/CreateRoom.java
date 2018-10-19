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

public class CreateRoom{
    
        boolean door = false;
        ArrayList tiles = new ArrayList();
        ArrayList walls = new ArrayList();
        int[] wallsArr;
        int[] tilesArr;
        
        public ArrayList CreateWalls(int size){
            for(int i = 0; i < size*4; i++){
                wallsArr[i] = (int) (Math.random() * 4) ;
            }
            for(int j = 0; j < size*4; j++){
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
                    switch (wallsArr[j]) {
                        case 1:
                            walls.add(createSpikedWall());
                            break;
                        case 2:
                            walls.add(createDestructableWall());
                            break;
                        default:
                            walls.add(createSolidWall());
                            break;  
                    }
                }
                else
                    walls.add(createDoorWall());
            }
            return walls;
        }
            
        public ArrayList CreateTiles(int size){
            for(int i = 0; i < size*size; i++){
                tilesArr[i] = (int) (Math.random() * 4) ;
            }
            
            for(int t = 0; t < size*size ; t++){
                
                switch (tilesArr[t]) {
                    case 1:
                         tiles.add(createPlainTile());
                         break;
                    case 2:
                        tiles.add(createMobTile());
                        break;
                    case 3:
                        tiles.add(createHealTile());
                        break;
                    default:
                        tiles.add(createCoinTile());
                        break;
                }          
            }
        return tiles;
        }

    private Object createSpikedWall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createDestructableWall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createSolidWall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createDoorWall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createPlainTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createMobTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createHealTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object createCoinTile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}