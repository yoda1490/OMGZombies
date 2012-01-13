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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of checkPersistance method, of class Item.
     */
    @Test
    public void testCheckPersistance() {
        System.out.println("checkPersistance");
        Item instance = null;
        Boolean expResult = null;
        Boolean result = instance.checkPersistance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Item.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Item instance = null;
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Item.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location = null;
        Item instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getField method, of class Item.
     */
    @Test
    public void testGetField() {
        System.out.println("getField");
        Item instance = null;
        Field expResult = null;
        Field result = instance.getField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setField method, of class Item.
     */
    @Test
    public void testSetField() {
        System.out.println("setField");
        Field field = null;
        Item instance = null;
        instance.setField(field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersistance method, of class Item.
     */
    @Test
    public void testGetPersistance() {
        System.out.println("getPersistance");
        Item instance = null;
        int expResult = 0;
        int result = instance.getPersistance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersistance method, of class Item.
     */
    @Test
    public void testSetPersistance() {
        System.out.println("setPersistance");
        int persistance = 0;
        Item instance = null;
        instance.setPersistance(persistance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ItemImpl extends Item {

        public ItemImpl() {
            super(null, null);
        }
    }
}
