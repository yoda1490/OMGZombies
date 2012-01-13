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
    
    Vampire vampire;
    
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
        Field field = new Field(20, 20);
        Location location = new Location(10, 10);
        vampire = new Vampire("vampire", 100, field, location);
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
        boolean expResult = false;
        boolean result = vampire.getIsThirsty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsThirsty method, of class Vampire.
     */
    @Test
    public void testSetIsThirsty() {
        System.out.println("setIsThirsty");
        boolean isThirsty = false;
        vampire.setIsThirsty(isThirsty);
        
    }

    /**
     * Test of endOfTurn method, of class Vampire.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        vampire.endOfTurn();
        
    }

    /**
     * Test of bite method, of class Vampire.
     */
    @Test
    public void testBite() {
        System.out.println("bite");
        Human h = null;
        vampire.bite(h);
        
    }

    /**
     * Test of encounterCharacter method, of class Vampire.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = null;
        vampire.encounterCharacter(c);
        
    }

    /**
     * Test of run method, of class Vampire.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        vampire.run();
        
    }
}
