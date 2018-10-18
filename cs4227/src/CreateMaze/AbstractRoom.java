/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

/**
 *
 * @author Sean
 */
public abstract class AbstractRoom {
    //for extensibility this abstract factory can be used to create different types of room such as large room, room and mob room
        abstract Room CreateRoom();
}
