/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import java.util.Random;
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
public class RandomizerTest {
    
    public RandomizerTest() {
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
     * Test of getRandom method, of class Randomizer.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        Random expResult = null;
        Random result = Randomizer.getRandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Randomizer.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Randomizer.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
