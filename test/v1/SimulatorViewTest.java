/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import java.awt.Color;
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
public class SimulatorViewTest {
    
    public SimulatorViewTest() {
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
     * Test of setColor method, of class SimulatorView.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Class characterClass = null;
        Color color = null;
        SimulatorView instance = null;
        instance.setColor(characterClass, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showStatus method, of class SimulatorView.
     */
    @Test
    public void testShowStatus() {
        System.out.println("showStatus");
        int step = 0;
        Field field = null;
        SimulatorView instance = null;
        instance.showStatus(step, field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isViable method, of class SimulatorView.
     */
    @Test
    public void testIsViable() {
        System.out.println("isViable");
        Field field = null;
        SimulatorView instance = null;
        boolean expResult = false;
        boolean result = instance.isViable(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
