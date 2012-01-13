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
        Human instance = null;
        boolean expResult = false;
        boolean result = instance.getHasBeenBitten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasBeenBitten method, of class Human.
     */
    @Test
    public void testSetHasBeenBitten() {
        System.out.println("setHasBeenBitten");
        boolean hasBeenBitten = false;
        Human instance = null;
        instance.setHasBeenBitten(hasBeenBitten);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTurnsSinceLastMeal method, of class Human.
     */
    @Test
    public void testGetTurnsSinceLastMeal() {
        System.out.println("getTurnsSinceLastMeal");
        Human instance = null;
        int expResult = 0;
        int result = instance.getTurnsSinceLastMeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTurnsSinceLastMeal method, of class Human.
     */
    @Test
    public void testSetTurnsSinceLastMeal() {
        System.out.println("setTurnsSinceLastMeal");
        int turnsSinceLastMeal = 0;
        Human instance = null;
        instance.setTurnsSinceLastMeal(turnsSinceLastMeal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasShotGun method, of class Human.
     */
    @Test
    public void testIsHasShotGun() {
        System.out.println("isHasShotGun");
        Human instance = null;
        boolean expResult = false;
        boolean result = instance.isHasShotGun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasShotGun method, of class Human.
     */
    @Test
    public void testSetHasShotGun() {
        System.out.println("setHasShotGun");
        boolean hasShotGun = false;
        Human instance = null;
        instance.setHasShotGun(hasShotGun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasNitrogen method, of class Human.
     */
    @Test
    public void testIsHasNitrogen() {
        System.out.println("isHasNitrogen");
        Human instance = null;
        boolean expResult = false;
        boolean result = instance.isHasNitrogen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasNitrogen method, of class Human.
     */
    @Test
    public void testSetHasNitrogen() {
        System.out.println("setHasNitrogen");
        boolean hasNitrogen = false;
        Human instance = null;
        instance.setHasNitrogen(hasNitrogen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasWoodenStake method, of class Human.
     */
    @Test
    public void testIsHasWoodenStake() {
        System.out.println("isHasWoodenStake");
        Human instance = null;
        boolean expResult = false;
        boolean result = instance.isHasWoodenStake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasWoodenStake method, of class Human.
     */
    @Test
    public void testSetHasWoodenStake() {
        System.out.println("setHasWoodenStake");
        boolean hasWoodenStake = false;
        Human instance = null;
        instance.setHasWoodenStake(hasWoodenStake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShotgun method, of class Human.
     */
    @Test
    public void testGetShotgun() {
        System.out.println("getShotgun");
        Human instance = null;
        ShotGun expResult = null;
        ShotGun result = instance.getShotgun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShotgun method, of class Human.
     */
    @Test
    public void testSetShotgun() {
        System.out.println("setShotgun");
        ShotGun shotgun = null;
        Human instance = null;
        instance.setShotgun(shotgun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNitrogen method, of class Human.
     */
    @Test
    public void testGetNitrogen() {
        System.out.println("getNitrogen");
        Human instance = null;
        Nitrogen expResult = null;
        Nitrogen result = instance.getNitrogen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNitrogen method, of class Human.
     */
    @Test
    public void testSetNitrogen() {
        System.out.println("setNitrogen");
        Nitrogen nitrogen = null;
        Human instance = null;
        instance.setNitrogen(nitrogen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWoodenstake method, of class Human.
     */
    @Test
    public void testGetWoodenstake() {
        System.out.println("getWoodenstake");
        Human instance = null;
        WoodenStake expResult = null;
        WoodenStake result = instance.getWoodenstake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWoodenstake method, of class Human.
     */
    @Test
    public void testSetWoodenstake() {
        System.out.println("setWoodenstake");
        WoodenStake woodenstake = null;
        Human instance = null;
        instance.setWoodenstake(woodenstake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endOfTurn method, of class Human.
     */
    @Test
    public void testEndOfTurn() {
        System.out.println("endOfTurn");
        Human instance = null;
        instance.endOfTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnIntoVampire method, of class Human.
     */
    @Test
    public void testTurnIntoVampire() {
        System.out.println("turnIntoVampire");
        Human instance = null;
        Vampire expResult = null;
        Vampire result = instance.turnIntoVampire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnIntoZombie method, of class Human.
     */
    @Test
    public void testTurnIntoZombie() {
        System.out.println("turnIntoZombie");
        Human instance = null;
        Zombie expResult = null;
        Zombie result = instance.turnIntoZombie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encounterCharacter method, of class Human.
     */
    @Test
    public void testEncounterCharacter() {
        System.out.println("encounterCharacter");
        Character c = null;
        Human instance = null;
        instance.encounterCharacter(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Human.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Human instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
