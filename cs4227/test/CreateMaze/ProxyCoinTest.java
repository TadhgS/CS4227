/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateMaze;

import Avatar.Avatar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ProxyCoinTest {
    
    public ProxyCoinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateScore method, of class ProxyCoin.
     */
    @Test
    public void testUpdateScore1() {
        System.out.println("updateScore");
        Avatar a = new Avatar();
        ProxyCoin instance = new ProxyCoin();
        
        int num = 3;
        a.setScore(num);
        for(int i = 0; i < a.getScore(); i++){
            instance.updateScore(a);    
        }
        assertEquals(30, a.getPoints());
    }
    
    @Test
    public void testUpdateScore2() {
        System.out.println("updateScore");
        Avatar a = new Avatar();
        ProxyCoin instance = new ProxyCoin();
        
        int num = 10;
        a.setScore(num);
        for(int i = 0; i < a.getScore(); i++){
            instance.updateScore(a);    
        }
        assertEquals(100, a.getPoints());
    }
        
    @Test
    public void testUpdateScore3() {
        System.out.println("updateScore");
        Avatar a = new Avatar();
        ProxyCoin instance = new ProxyCoin();
        
        int num = 67;
        a.setScore(num);
        for(int i = 0; i < a.getScore(); i++){
            instance.updateScore(a);    
        }
        assertEquals(670, a.getPoints());
    }
        
    @Test
    public void testUpdateScore4() {
        System.out.println("updateScore");
        Avatar a = new Avatar();
        ProxyCoin instance = new ProxyCoin();
        
        int num = -42;
        a.setScore(num);
        for(int i = 0; i < a.getScore(); i++){
            instance.updateScore(a);    
        }
        assertEquals(0, a.getPoints());
    }
}
