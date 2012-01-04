package v1;

/**
 * Parent Character class
 * 
 * @author pylaffon
 * 
 */

public abstract class  Character {
    protected String name;
    // name of the character
    protected int healthPoints; // represents the health
    // (once down to 0, this character will be destroyed)
    protected static int type;
    
    /**
     * Constructor of Character class.
     * 
     * @param name
     *            name of the character
     * @param healthPoints
     *            initial HP
     */
    public Character(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        type = 0;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Decrease the number of HP by a certain amount. HP cannot go below 0.
     * 
     * @param reduction
     *            number of HP to reduce
     */
    public void reduceHealthPoints(int reduction) {
        healthPoints = healthPoints - reduction;
        if (healthPoints < 0) {
            healthPoints = 0;
        }
    }

    /**
     * Output a character's saying to the screen
     * 
     * @param str
     *            what the character says
     */
    public void say(String str) {
        System.out.println(name + " says: " + str);
    }

    /**
     * Method triggered when the character described by the current object meets
     * another character, and does something to him (for example, attack).
     * 
     * @param c
     *            the other character that this character meets
     */
    public abstract void encounterCharacter(Character c);
    
    public abstract void endOfTurn();
    
}
