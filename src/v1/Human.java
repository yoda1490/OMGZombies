package v1;

import java.util.ArrayList;

/**
 * Human class, derives from Character
 * 
 * @author pylaffon
 * 
 */
public class Human extends Character {
	private boolean hasBeenBitten; // false, until a vampire bites this human
	private int turnsSinceLastMeal; // the human will lose health if he's too
									// hungry

	/**
	 * Constructor of Human class. At the beginning of the game, humans just had
	 * dinner, and have not been bitten yet.
	 * 
	 * @param name
	 *            name of the character
	 * @param healthPoints
	 *            initial HP
	 */
	public Human(String name, int healthPoints, Field field, Location location) {
		super(name, healthPoints, field, location);
		hasBeenBitten = false;
		turnsSinceLastMeal = 0;
		this.type = 1;
	}

	// Accessors and mutators
	public boolean getHasBeenBitten() {
		return hasBeenBitten;
	}

	public void setHasBeenBitten(boolean hasBeenBitten) {
		this.hasBeenBitten = hasBeenBitten;
	}

	/**
	 * Method triggered on each character at the end of each turn.
	 */
	public void endOfTurn() {
		// Increment the number of turns since the last time the human ate
		turnsSinceLastMeal++;
		// If the human is too hungry, he will lose health...
		if (turnsSinceLastMeal > 3) {
			healthPoints -= 2;
		}
	}

	/**
	 * Transform this human who has been bitten, into a blood-thirsty vampire.
	 * 
	 * @return a new object of class Vampire, with the same name and
	 *         healthpoints
	 * 
	 *         as this human; the new vampire is immediately thirsty
	 */
	public Vampire turnIntoVampire() {
		// ... add your code here (question 7b) ...
		Vampire vamp = new Vampire(this.getName(), this.getHealthPoints(),
				this.getField(), this.getLocation());
		vamp.setIsThirsty(true);
		return vamp;
	}

	public void encounterCharacter(Character c) {
		System.out.println("Go away !");
	}

	public void run() {
		if (IsAlive()) {
			ArrayList<Location> locations = getField().adjacentLocations(getLocation());
				int move = 0;
				for (int i = 0; i < locations.size(); i++) {
					if(getField().getObjectAt(locations.get(i)) instanceof Zombie){
						int oposateLocation = ((i+3) % locations.size());
						if(this.getField().getObjectAt(locations.get(oposateLocation)) == null){
							System.out.println("Human fear !!!");
							setLocation(locations.get(oposateLocation));
							move = 1;
							break;
						}
					}
				}
			}
		 else
			setDead();
	}
}
