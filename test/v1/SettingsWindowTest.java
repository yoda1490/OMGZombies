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
public class SettingsWindowTest {
    
    SettingsWindow sw;
    
    public SettingsWindowTest() {
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
        sw = new SettingsWindow(sim);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of openWindow method, of class SettingsWindow.
     */
    @Test
    public void testOpenWindow() {
        System.out.println("openWindow");
        sw.openWindow();
        
    }
}
