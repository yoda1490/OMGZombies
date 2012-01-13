/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import java.util.ArrayList;
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
public class FieldTest {
    
    public FieldTest() {
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
     * Test of clear method, of class Field.
     */
    @Test
    public void testClear_0args() {
        System.out.println("clear");
        Field instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Field.
     */
    @Test
    public void testClear_Location() {
        System.out.println("clear");
        Location location = null;
        Field instance = null;
        instance.clear(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of place method, of class Field.
     */
    @Test
    public void testPlace_3args() {
        System.out.println("place");
        Object character = null;
        int row = 0;
        int col = 0;
        Field instance = null;
        instance.place(character, row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of place method, of class Field.
     */
    @Test
    public void testPlace_Object_Location() {
        System.out.println("place");
        Object character = null;
        Location location = null;
        Field instance = null;
        instance.place(character, location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Field.
     */
    @Test
    public void testGetObjectAt_Location() {
        System.out.println("getObjectAt");
        Location location = null;
        Field instance = null;
        Object expResult = null;
        Object result = instance.getObjectAt(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Field.
     */
    @Test
    public void testGetObjectAt_int_int() {
        System.out.println("getObjectAt");
        int row = 0;
        int col = 0;
        Field instance = null;
        Object expResult = null;
        Object result = instance.getObjectAt(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomAdjacentLocation method, of class Field.
     */
    @Test
    public void testRandomAdjacentLocation() {
        System.out.println("randomAdjacentLocation");
        Location location = null;
        Field instance = null;
        Location expResult = null;
        Location result = instance.randomAdjacentLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFreeAdjacentLocations method, of class Field.
     */
    @Test
    public void testGetFreeAdjacentLocations() {
        System.out.println("getFreeAdjacentLocations");
        Location location = null;
        Field instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getFreeAdjacentLocations(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of freeAdjacentLocation method, of class Field.
     */
    @Test
    public void testFreeAdjacentLocation() {
        System.out.println("freeAdjacentLocation");
        Location location = null;
        Field instance = null;
        Location expResult = null;
        Location result = instance.freeAdjacentLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adjacentLocations method, of class Field.
     */
    @Test
    public void testAdjacentLocations() {
        System.out.println("adjacentLocations");
        Location location = null;
        Field instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.adjacentLocations(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepth method, of class Field.
     */
    @Test
    public void testGetDepth() {
        System.out.println("getDepth");
        Field instance = null;
        int expResult = 0;
        int result = instance.getDepth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Field.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Field instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
