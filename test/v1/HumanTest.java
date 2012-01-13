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
public class HumanTest {
    
    Human human;
    
    public HumanTest() {
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
        human = new Human("human", 100, field, location);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHasBeenBitten method, of class Human.
     */
    @Test
    public void testGetHasBeenBitten() {
        System.out.println("getHasBeenBitten");
        boolean expResult = false;
        boolean result = human.getHasBeenBitten();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHasBeenBitten method, of class Human.
     */
    @Test
    public void testSetHasBeenBitten() {
        System.out.println("setHasBeenBitten");
        boolean hasBeenBitten = false;
        human.setHasBeenBitten(hasBeenBitten);
        
    }

    /**
     * Test of getTurnsSinceLastMeal method, of class Human.
     */
    @Test
    public void testGetTurnsSinceLastMeal() {
        System.out.println("getTurnsSinceLastMeal");
        int expResult = 0;
        int result = human.getTurnsSinceLastMeal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTurnsSinceLastMeal method, of class Human.
     */
    @Test
    public void testSetTurnsSinceLastMeal() {
        System.out.println("setTurnsSinceLastMeal");
        int turnsSinceLastMeal = 0;
        human.setTurnsSinceLastMeal(turnsSinceLastMeal);
        
    }

    /**
     * Test of isHasShotGun method, of class Human.
     */
    @Test
    public void testIsHasShotGun() {
        System.out.println("isHasShotGun");
        boolean expResult = false;
        boolean result = human.isHasShotGun();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHasShotGun method, of class Human.
     */
    @Test
    public void testSetHasShotGun() {
        System.out.println("setHasShotGun");
        boolean hasShotGun = false;
        human.setHasShotGun(hasShotGun);
        
    }

    /**
     * Test of isHasNitrogen method, of class Human.
     */
    @Test
    public void testIsHasNitrogen() {
        System.out.println("isHasNitrogen");
        boolean expResult = false;
        boolean result = human.isHasNitrogen();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHasNitrogen method, of class Human.
     */
    @Test
    public void testSetHasNitrogen() {
        System.out.println("setHasNitrogen");
        boolean hasNitrogen = false;
        human.setHasNitrogen(hasNitrogen);
        
    }

    /**
     * Test of isHasWoodenStake method, of class Human.
     */
    @Test
    public void testIsHasWoodenStake() {
        System.out.println("isHasWoodenStake");
        boolean expResult = false;
        boolean result = human.isHasWoodenStake();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHasWoodenStake method, of class Human.
     */
    @Test
    public void testSetHasWoodenStake() {
        System.out.println("setHasWoodenStake");
        boolean hasWoodenStake = false;
        human.setHasWoodenStake(hasWoodenStake);
        
    }

    /**
     * Test of getShotgun method, of class Human.
     */
    @Test
    public void testGetShotgun() {
        System.out.println("getShotgun");
        ShotGun shotgun = new ShotGun(human.getLocation(), human.getField());
        human.setShotgun(shotgun);
        ShotGun result = human.getShotgun();
        assertEquals(shotgun, result);
        
    }

    /**
     * Test of setShotgun method, of class Human.
     */
    @Test
    public void testSetShotgun() {
        System.out.println("setShotgun");
        ShotGun shotgun = new ShotGun(human.getLocation(), human.getField());
        human.setShotgun(shotgun);
        ShotGun result = human.getShotgun();
        assertEquals(shotgun, result);
    }

    /**
     * Test of getNitrogen method, of class Human.
     */
    @Test
    public void testGetNitrogen() {
        System.out.println("getNitrogen");
        Nitrogen nitrogen = new Nitrogen(human.getLocation(), human.getField());
        human.setNitrogen(nitrogen);
        Nitrogen result = human.getNitrogen();
        assertEquals(nitrogen, result);
    }

    /**
     * Test of setNitrogen method, of class Human.
     */
    @Test
    public void testSetNitrogen() {
        System.out.println("setNitrogen");
        Nitrogen nitrogen = new Nitrogen(human.getLocation(), human.getField());
        human.setNitrogen(nitrogen);
        Nitrogen result = human.getNitrogen();
        assertEquals(nitrogen, result);
    }

    /**
     * Test of getWoodenstake method, of class Human.
     */
    @Test
    public void testGetWoodenstake() {
        System.out.println("getWoodenstake");
        WoodenStake woodenStake = new WoodenStake(human.getLocation(), human.getField());
        human.setWoodenstake(woodenStake);
        WoodenStake result = human.getWoodenstake();
        assertEquals(woodenStake, result);
    }

    /**
     * Test of setWoodenstake method, of class Human.
     */
    @Test
    public void testSetWoodenstake() {
        System.out.println("setWoodenstake");
        WoodenStake woodenStake = new WoodenStake(human.getLocation(), human.getField());
        human.setWoodenstake(woodenStake);
        WoodenStake result = human.getWoodenstake();
        assertEquals(woodenStake, result);
    }

    /**
     * Test of endOfTurn method, of class Human.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        human.endOfTurn();
        
    }

    /**
     * Test of turnIntoVampire method, of class Human.
     */
    @Test
    public void testTurnIntoVampire() {
        System.out.println("turnIntoVampire");
        //Vampire vampire = human.turnIntoVampire();
        
        
    }

    /**
     * Test of turnIntoZombie method, of class Human.
     */
    @Test
    public void testTurnIntoZombie() {
        System.out.println("turnIntoZombie");
        //Zombie zombie = human.turnIntoZombie();
        
    }

    /**
     * Test of encounterCharacter method, of class Human.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Human human2 = new Human("human 2", 100, human.getField(), human.getLocation());
        human.encounterCharacter(human2);
        
    }

    /**
     * Test of run method, of class Human.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        human.run();
        
    }
}
