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
public class WeaponTest {
    
    public WeaponTest() {
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
     * Test of getAmmo method, of class Weapon.
     */
    @Test
    public void testGetAmmo() {
        System.out.println("getAmmo");
        Weapon instance = null;
        int expResult = 0;
        int result = instance.getAmmo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmmo method, of class Weapon.
     */
    @Test
    public void testSetAmmo() {
        System.out.println("setAmmo");
        int ammo = 0;
        Weapon instance = null;
        instance.setAmmo(ammo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Weapon.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Weapon instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of use method, of class Weapon.
     */
    @Test
    public void testUse() {
        System.out.println("use");
        Weapon instance = null;
        instance.use();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class WeaponImpl extends Weapon {

        public WeaponImpl() {
            super(null, null);
        }

        public void use() {
        }
    }
}
