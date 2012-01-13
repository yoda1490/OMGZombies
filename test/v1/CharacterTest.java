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
public class CharacterTest {
    
    public CharacterTest() {
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
     * Test of getName method, of class Character.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Character instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHealthPoints method, of class Character.
     */
    @Test
    public void testGetHealthPoints() {
        System.out.println("getHealthPoints");
        Character instance = null;
        int expResult = 0;
        int result = instance.getHealthPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getField method, of class Character.
     */
    @Test
    public void testGetField() {
        System.out.println("getField");
        Character instance = null;
        Field expResult = null;
        Field result = instance.getField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Character.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Character instance = null;
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Character.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Character instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsAlive method, of class Character.
     */
    @Test
    public void testIsAlive() {
        System.out.println("IsAlive");
        Character instance = null;
        Boolean expResult = null;
        Boolean result = instance.IsAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlive method, of class Character.
     */
    @Test
    public void testSetAlive() {
        System.out.println("setAlive");
        Boolean bool = null;
        Character instance = null;
        instance.setAlive(bool);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDead method, of class Character.
     */
    @Test
    public void testSetDead() {
        System.out.println("setDead");
        Character instance = null;
        instance.setDead();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reduceHealthPoints method, of class Character.
     */
    @Test
    public void testReduceHealthPoints() {
        System.out.println("reduceHealthPoints");
        int reduction = 0;
        Character instance = null;
        instance.reduceHealthPoints(reduction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Character.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location newLocation = null;
        Character instance = null;
        instance.setLocation(newLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class Character.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String str = "";
        Character instance = null;
        instance.say(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encounterCharacter method, of class Character.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = null;
        Character instance = null;
        instance.encounterCharacter(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfTurn method, of class Character.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        Character instance = null;
        instance.endOfTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Character.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Character instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CharacterImpl extends Character {

        public CharacterImpl() {
            super("", 0, null, null);
        }

        public void encounterCharacter(Character c) {
        }

        public void endOfTurn() {
        }

        public void run() {
        }
    }
}
