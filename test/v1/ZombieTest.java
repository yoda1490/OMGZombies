/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amauryboller
 */
public class ZombieTest {
    Zombie zombie;
    
    public ZombieTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Field field = new Field(20, 20);
        Location location = new Location(10, 10);
        zombie = new Zombie("zombie", 100, field, location);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isStun method, of class Zombie.
     */
    @Test
    public void testIsStun() {
        System.out.println("isStun");
        
        boolean expResult = false;
        boolean result = zombie.isStun();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStun method, of class Zombie.
     */
    @Test
    public void testSetStun() {
        System.out.println("setStun");
        boolean isStun = false;
        zombie.setStun(isStun);
        
    }

    /**
     * Test of getStunTurn method, of class Zombie.
     */
    @Test
    public void testGetStunTurn() {
        System.out.println("getStunTurn");
        int expResult = 0;
        int result = zombie.getStunTurn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStunTurn method, of class Zombie.
     */
    @Test
    public void testSetStunTurn() {
        System.out.println("setStunTurn");
        int stunTurn = 0;
        zombie.setStunTurn(stunTurn);
        
    }

    /**
     * Test of say method, of class Zombie.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String str = "";
        zombie.say(str);
        
    }

    /**
     * Test of decrementeStun method, of class Zombie.
     */
    @Test
    public void testDecrementeStun() {
        System.out.println("decrementeStun");
        zombie.decrementeStun();
        
    }

    /**
     * Test of endOfTurn method, of class Zombie.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        zombie.endOfTurn();
        
    }

    /**
     * Test of encounterCharacter method, of class Zombie.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = new Human("human", 50, zombie.getField(), zombie.getLocation());
        zombie.encounterCharacter(c);
        
    }

    /**
     * Test of run method, of class Zombie.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        zombie.run();
        
    }
}
