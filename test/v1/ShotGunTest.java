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
public class ShotGunTest {
    
    public ShotGunTest() {
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
     * Test of isCanUse method, of class ShotGun.
     */
    @Test
    public void testIsCanUse() {
        System.out.println("isCanUse");
        ShotGun instance = null;
        boolean expResult = false;
        boolean result = instance.isCanUse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCanUse method, of class ShotGun.
     */
    @Test
    public void testSetCanUse() {
        System.out.println("setCanUse");
        boolean canUse = false;
        ShotGun instance = null;
        instance.setCanUse(canUse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of use method, of class ShotGun.
     */
    @Test
    public void testUse() {
        System.out.println("use");
        ShotGun instance = null;
        instance.use();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
