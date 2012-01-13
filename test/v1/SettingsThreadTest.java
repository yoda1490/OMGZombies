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
public class SettingsThreadTest {
    
    SettingsThread st;
    
    public SettingsThreadTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Simulator sim = new Simulator();
        st = new SettingsThread("settings", sim);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class SettingsThread.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        st.run(); 
        
        //fail("This game is bugged.");
    }
}
