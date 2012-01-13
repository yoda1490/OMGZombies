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
public class FieldStatsTest {
    
    public FieldStatsTest() {
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
     * Test of getPopulationDetails method, of class FieldStats.
     */
    @Test
    public void testGetPopulationDetails() {
        System.out.println("getPopulationDetails");
        Field field = null;
        FieldStats instance = new FieldStats();
        String expResult = "";
        String result = instance.getPopulationDetails(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class FieldStats.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        FieldStats instance = new FieldStats();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementCount method, of class FieldStats.
     */
    @Test
    public void testIncrementCount() {
        System.out.println("incrementCount");
        Class animalClass = null;
        FieldStats instance = new FieldStats();
        instance.incrementCount(animalClass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countFinished method, of class FieldStats.
     */
    @Test
    public void testCountFinished() {
        System.out.println("countFinished");
        FieldStats instance = new FieldStats();
        instance.countFinished();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isViable method, of class FieldStats.
     */
    @Test
    public void testIsViable() {
        System.out.println("isViable");
        Field field = null;
        FieldStats instance = new FieldStats();
        boolean expResult = false;
        boolean result = instance.isViable(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
