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
public class NitrogenTest {
    
    Nitrogen ng;
    
    public NitrogenTest() {
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
        ng = new Nitrogen(location, field);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isCanUse method, of class Nitrogen.
     */
    @Test
    public void testIsCanUse() {
        System.out.println("isCanUse");
        boolean expResult = true;
        boolean result = ng.isCanUse();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCanUse method, of class Nitrogen.
     */
    @Test
    public void testSetCanUse() {
        System.out.println("setCanUse");
        boolean canUse = false;
        ng.setCanUse(canUse);
        
    }

    /**
     * Test of use method, of class Nitrogen.
     */
    @Test
    public void testUse() {
        System.out.println("use");
        ng.use();
        
    }
}
