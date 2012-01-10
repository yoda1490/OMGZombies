package v1;

import java.util.ArrayList;

import javax.xml.stream.events.Characters;

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
	private boolean HasShotGun;
	private boolean HasNitrogen;
	private boolean HasWoodenStake;
	
	private ShotGun shotgun;
	private Nitrogen nitrogen;
	private WoodenStake woodenstake;
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
		this.hasBeenBitten = false;
		this.HasNitrogen = false;
		this.HasShotGun = false;
		this.shotgun = null;
		this.nitrogen = null;
		this.woodenstake = null;
	}

	// Accessors and mutators
	public boolean getHasBeenBitten() {
		return hasBeenBitten;
	}

	public void setHasBeenBitten(boolean hasBeenBitten) {
		this.hasBeenBitten = hasBeenBitten;
	}
	
	

	public int getTurnsSinceLastMeal() {
        return turnsSinceLastMeal;
    }

    public void setTurnsSinceLastMeal(int turnsSinceLastMeal) {
        this.turnsSinceLastMeal = turnsSinceLastMeal;
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
		// ... add your code here (question 7b) .
	    
		Vampire vamp = new Vampire(this.getName(), this.getHealthPoints()+1,
				this.getField(), this.getLocation());
		vamp.setIsThirsty(true);
		Simulator.characters.add(vamp);
		Simulator.characters.remove(this);
		return vamp;
	}
	
	public Zombie turnIntoZombie(){
	    // On ajoute 1 aux points de vie de l'humain car il sera transormé en Zombie seulement si celui-ci le tue
	    // Donc à la création le néo-zombie aura 0 HP et sera remove de la liste on lui en donne donc un
	    Zombie zom = new Zombie (this.getName(), this.getHealthPoints()+1,
                    this.getField(), this.getLocation());
	    Simulator.characters.add(zom);
            Simulator.characters.remove(this);
	    return zom;
	}
	

	public void encounterCharacter(Character c) {
		System.out.println("Go away !");
	}

	public void run() {
		if (IsAlive()) {
			ArrayList<Location> locations = getField().adjacentLocations(getLocation());
				int move = 0;
				for (int i = 0; i < locations.size(); i++) {
				    if (getField().getObjectAt(locations.get(i)) instanceof Food){
				        Food f = (Food) getField().getObjectAt(locations.get(i));
				        setLocation((locations.get(i)));
				        setTurnsSinceLastMeal(0);
				        //f.use();
				    }
					if(getField().getObjectAt(locations.get(i)) instanceof Zombie){
						int oposateLocation = (i+2) % 4;
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
