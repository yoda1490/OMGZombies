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
        Zombie instance = null;
        boolean expResult = false;
        boolean result = instance.isStun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStun method, of class Zombie.
     */
    @Test
    public void testSetStun() {
        System.out.println("setStun");
        boolean isStun = false;
        Zombie instance = null;
        instance.setStun(isStun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStunTurn method, of class Zombie.
     */
    @Test
    public void testGetStunTurn() {
        System.out.println("getStunTurn");
        Zombie instance = null;
        int expResult = 0;
        int result = instance.getStunTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStunTurn method, of class Zombie.
     */
    @Test
    public void testSetStunTurn() {
        System.out.println("setStunTurn");
        int stunTurn = 0;
        Zombie instance = null;
        instance.setStunTurn(stunTurn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class Zombie.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String str = "";
        Zombie instance = null;
        instance.say(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementeStun method, of class Zombie.
     */
    @Test
    public void testDecrementeStun() {
        System.out.println("decrementeStun");
        Zombie instance = null;
        instance.decrementeStun();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfTurn method, of class Zombie.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        Zombie instance = null;
        instance.endOfTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encounterCharacter method, of class Zombie.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = null;
        Zombie instance = null;
        instance.encounterCharacter(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Zombie.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Zombie instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
