package v1;

import java.util.ArrayList;

/**
 * Zombie class, derives from Character.
 * 
 * @author pylaffon
 * 
 */
public class Zombie extends Character {

    /**
     * Constructor of Zombie class.
     * 
     * @param name
     *            name of the character
     * @param healthPoints
     *            initial HP
     */
    public Zombie(String name, int healthPoints, Field field, Location location) {
        super(name, healthPoints, field, location);
        this.type = 3;
    }

    /**
     * Output a character's saying to the screen
     * 
     * @param str
     *            what the character saysfreeAdjacentLocation
     */
    public void say(String str) {
        System.out.println(name + " says: BRAIIIIIINS!");
    }

    /**
     * Method triggered on each character at the end of each turn.
     */
    public void endOfTurn() {
        // Do nothing. Zombies are useless anyway...
    }

    public void encounterCharacter(Character c) {
        switch (c.type) {
        case 1:
            c.reduceHealthPoints(5);
            System.out.println(c.getName() + ", I'm gonna kill you");
        case 2:
            if (Simulator.GenerateRandomBoolean() == true) {
                c.reduceHealthPoints(5);
                System.out.println(c.getName() + ", I'm gonna kill you");
            }
        default:
            ;
        }
    }

    public void run() {
        int x = 0;
        if (IsAlive()) {
            ArrayList<Location> adjacentLocation = getField()
                    .adjacentLocations(getLocation());
            for (int i = 0; i < adjacentLocation.size(); i++) {
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Human) {
                    this.encounterCharacter((Human) getField().getObjectAt(
                            adjacentLocation.get(i)));
                    x = 1;
                    break;
                }
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Vampire) {
                    this.encounterCharacter((Vampire) getField().getObjectAt(
                            adjacentLocation.get(i)));
                    x = 1;
                    break;
                }

            }
            if (x == 0) {
                Location newLocation = getField().freeAdjacentLocation(
                        getLocation());
                if (newLocation != null) {
                    setLocation(newLocation);
                }
            }
        } else
            setDead();
    }

}
