package v1;

/**
 * Parent Character class
 * 
 * @author pylaffon
 * 
 */

public abstract class Character {
	protected String name;
	// name of the character
	protected int healthPoints; // represents the health
	// (once down to 0, this character will be destroyed)
	protected int type;

	private Location location;
	// The field occupied.
	private Field field;

	private boolean alive;

	/**
	 * Constructor of Character class.
	 * 
	 * @param name
	 *            name of the character
	 * @param healthPoints
	 *            initial HP
	 */
	public Character(String name, int healthPoints, Field field,
			Location location) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.field = field;
		this.location = location;
		setLocation(location);
		alive = true;
		type = 0;
	}

	// Accessors
	public String getName() {
		return name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public Field getField() {
		return this.field;
	}

	public Location getLocation() {
		return this.location;
	}
	
	public int getType() {
            return this.type;
        }

	public Boolean IsAlive() {
		return alive;
	}

	public void setAlive(Boolean bool) {
		this.alive = bool;
	}

	public void setDead() {
		alive = false;
		if (location != null) {
			field.clear(location);
			location = null;
			field = null;
		}
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
			alive = false;
		}
	}

	public void setLocation(Location newLocation) {
		if (location != null) {
			field.clear(location);
		}
		location = newLocation;
		field.place(this, newLocation);
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

	public abstract void run();

}
