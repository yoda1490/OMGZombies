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
    
    Simulator sim;
    
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
        sim = new Simulator();
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
        sim.init();
        
    }

    /**
     * Test of init method, of class Simulator.
     */
    @Test
    public void testInit_int_int() {
        System.out.println("init");
        int depth = 0;
        int width = 0;
        sim.init(depth, width);
        
    }

    /**
     * Test of nextTurn method, of class Simulator.
     */
    @Test
    public void testNextTurn() {
        System.out.println("nextTurn");
        sim.init();
        sim.nextTurn();
        
    }

    /**
     * Test of reset method, of class Simulator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        sim.init();
        sim.reset();
        
    }

    /**
     * Test of nbHumansAlive method, of class Simulator.
     */
    @Test
    public void testNbHumansAlive() {
        System.out.println("nbHumansAlive");
        int expResult = 0;
        int result = sim.nbHumansAlive();
        //assertEquals(expResult, result); can test random methode
        
    }

    /**
     * Test of nbMonsterAlive method, of class Simulator.
     */
    @Test
    public void testNbMonsterAlive() {
        System.out.println("nbMonsterAlive");
        int expResult = 0;
        int result = sim.nbMonsterAlive();
        //assertEquals(expResult, result); can't test random methode
        
    }

    /**
     * Test of getHUMAN_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetHUMAN_CREATION_PROBABILITY() {
        System.out.println("getHUMAN_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setHUMAN_CREATION_PROBABILITY(proba);
        double result = sim.getHUMAN_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
        
    }

    /**
     * Test of setHUMAN_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetHUMAN_CREATION_PROBABILITY() {
        System.out.println("setHUMAN_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setHUMAN_CREATION_PROBABILITY(proba);
        double result = sim.getHUMAN_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of getVAMPIRE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetVAMPIRE_CREATION_PROBABILITY() {
        System.out.println("getVAMPIRE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setVAMPIRE_CREATION_PROBABILITY(proba);
        double result = sim.getVAMPIRE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of setVAMPIRE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetVAMPIRE_CREATION_PROBABILITY() {
        System.out.println("setVAMPIRE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setVAMPIRE_CREATION_PROBABILITY(proba);
        double result = sim.getVAMPIRE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of getZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetZOMBIE_CREATION_PROBABILITY() {
        System.out.println("getZOMBIE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setZOMBIE_CREATION_PROBABILITY(proba);
        double result = sim.getZOMBIE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of setZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetZOMBIE_CREATION_PROBABILITY() {
        System.out.println("setZOMBIE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setZOMBIE_CREATION_PROBABILITY(proba);
        double result = sim.getZOMBIE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of getMADZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testGetMADZOMBIE_CREATION_PROBABILITY() {
        System.out.println("getMADZOMBIE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setMADZOMBIE_CREATION_PROBABILITY(proba);
        double result = sim.getMADZOMBIE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of setMADZOMBIE_CREATION_PROBABILITY method, of class Simulator.
     */
    @Test
    public void testSetMADZOMBIE_CREATION_PROBABILITY() {
        System.out.println("setMADZOMBIE_CREATION_PROBABILITY");
        double proba = 0.0;
        sim.setMADZOMBIE_CREATION_PROBABILITY(proba);
        double result = sim.getMADZOMBIE_CREATION_PROBABILITY();
        assertEquals(proba, result, 0.00);
    }

    /**
     * Test of GenerateRandomBoolean method, of class Simulator.
     */
    @Test
    public void testGenerateRandomBoolean() {
        //how to test a random methode ?
    }
}
