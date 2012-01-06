package v1;

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
     *            what the character says
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
}

