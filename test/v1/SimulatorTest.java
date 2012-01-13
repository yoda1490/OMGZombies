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
public class SimulatorTest {
    
    public SimulatorTest() {
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
     * Test of init method, of class Simulator.
     */
    @Test
    public void testInit_0args() {
        System.out.println("init");
        Simulator instance = new Simulator();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Simulator.
     */
    @Test
    public void testInit_int_int() {
        System.out.println("init");
        int depth = 0;
        int width = 0;
        Simulator instance = new Simulator();
        instance.init(depth, width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextTurn method, of class Simulator.
     */
    @Test
    public void testNextTurn() {
        System.out.println("nextTurn");
        Simulator instance = new Simulator();
        instance.nextTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Simulator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Simulator instance = new Simulator();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbHumansAlive method, of class Simulator.
     */
    @Test
    public void testNbHumansAlive() {
        System.out.println("nbHumansAlive");
        Simulator instance = new Simulator();
        int expResult = 0;
        int result = instance.nbHumansAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbMonsterAlive method, of class Simulator.
     */
    @Test
    public void testNbMonsterAlive() {
        System.out.println("nbMonsterAlive");
        Simulator instance = new Simulator();
        int expResult = 0;
        int result = instance.nbMonsterAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHUMAN_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetHUMAN_CREATION_PROBABILITY() {
        System.out.println("getHUMAN_CREATION_PROBABILITY");
        Simulator instance = new Simulator();
        double expResult = 0.0;
        double result = instance.getHUMAN_CREATION_PROBABILITY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHUMAN_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetHUMAN_CREATION_PROBABILITY() {
        System.out.println("setHUMAN_CREATION_PROBABILITY");
        double hUMAN_CREATION_PROBABILITY = 0.0;
        Simulator instance = new Simulator();
        instance.setHUMAN_CREATION_PROBABILITY(hUMAN_CREATION_PROBABILITY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVAMPIRE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetVAMPIRE_CREATION_PROBABILITY() {
        System.out.println("getVAMPIRE_CREATION_PROBABILITY");
        Simulator instance = new Simulator();
        double expResult = 0.0;
        double result = instance.getVAMPIRE_CREATION_PROBABILITY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVAMPIRE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetVAMPIRE_CREATION_PROBABILITY() {
        System.out.println("setVAMPIRE_CREATION_PROBABILITY");
        double vAMPIRE_CREATION_PROBABILITY = 0.0;
        Simulator instance = new Simulator();
        instance.setVAMPIRE_CREATION_PROBABILITY(vAMPIRE_CREATION_PROBABILITY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetZOMBIE_CREATION_PROBABILITY() {
        System.out.println("getZOMBIE_CREATION_PROBABILITY");
        Simulator instance = new Simulator();
        double expResult = 0.0;
        double result = instance.getZOMBIE_CREATION_PROBABILITY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetZOMBIE_CREATION_PROBABILITY() {
        System.out.println("setZOMBIE_CREATION_PROBABILITY");
        double zOMBIE_CREATION_PROBABILITY = 0.0;
        Simulator instance = new Simulator();
        instance.setZOMBIE_CREATION_PROBABILITY(zOMBIE_CREATION_PROBABILITY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMADZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetMADZOMBIE_CREATION_PROBABILITY() {
        System.out.println("getMADZOMBIE_CREATION_PROBABILITY");
        Simulator instance = new Simulator();
        double expResult = 0.0;
        double result = instance.getMADZOMBIE_CREATION_PROBABILITY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMADZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetMADZOMBIE_CREATION_PROBABILITY() {
        System.out.println("setMADZOMBIE_CREATION_PROBABILITY");
        double mADZOMBIE_CREATION_PROBABILITY = 0.0;
        Simulator instance = new Simulator();
        instance.setMADZOMBIE_CREATION_PROBABILITY(mADZOMBIE_CREATION_PROBABILITY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerateRandomBoolean method, of class Simulator.
     */
    @Test
    public void testGenerateRandomBoolean() {
        System.out.println("GenerateRandomBoolean");
        boolean expResult = false;
        boolean result = Simulator.GenerateRandomBoolean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
