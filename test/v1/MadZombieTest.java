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
public class MadZombieTest {
    
    MadZombie madZombie;
    
    public MadZombieTest() {
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
        madZombie = new MadZombie("mad Zombie", 100, field, location);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encounterCharacter method, of class MadZombie.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Human human = new Human("human", 100, madZombie.getField(), madZombie.getLocation());
        madZombie.encounterCharacter(human);
        
    }

    /**
     * Test of run method, of class MadZombie.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        madZombie.run();
        
    }
}
