/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package v1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author amauryboller
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({v1.SimulatorTest.class, v1.WoodenStakeTest.class, v1.NitrogenTest.class, v1.MadZombieTest.class, v1.HumanTest.class, v1.SettingsThreadTest.class, v1.SettingsWindowTest.class, v1.ShotGunTest.class, v1.VampireTest.class, v1.SimulatorThreadTest.class, v1.ZombieTest.class})
public class V1Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
