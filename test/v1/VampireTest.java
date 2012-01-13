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
public class VampireTest {
    
    public VampireTest() {
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
     * Test of getIsThirsty method, of class Vampire.
     */
    @Test
    public void testGetIsThirsty() {
        System.out.println("getIsThirsty");
        Vampire instance = null;
        boolean expResult = false;
        boolean result = instance.getIsThirsty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsThirsty method, of class Vampire.
     */
    @Test
    public void testSetIsThirsty() {
        System.out.println("setIsThirsty");
        boolean isThirsty = false;
        Vampire instance = null;
        instance.setIsThirsty(isThirsty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfTurn method, of class Vampire.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        Vampire instance = null;
        instance.endOfTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bite method, of class Vampire.
     */
    @Test
    public void testBite() {
        System.out.println("bite");
        Human h = null;
        Vampire instance = null;
        instance.bite(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encounterCharacter method, of class Vampire.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = null;
        Vampire instance = null;
        instance.encounterCharacter(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Vampire.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Vampire instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
