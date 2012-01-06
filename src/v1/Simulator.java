package v1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



/**
 * Simulator for Midterm Zombiegame.
 * 
 * @author pylaffon
 * 
 */
public class Simulator {
	// Default health pointsfor our creatures
	private static final int HP_HUMANS = 100;
	private static final int HP_VAMPIRES = 150;
	private static final int HP_ZOMBIES = 30;
	// List of characters currently in the game

	// Constants representing configuration information for the simulation.
	// The default width for the grid.
	private static final int DEFAULT_WIDTH = 120;
	// The default depth of the grid.
	private static final int DEFAULT_DEPTH = 60;
	// The probability that a character will be created in any given grid
	// position.
	private static final double HUMAN_CREATION_PROBABILITY = 0.1;
	private static final double VAMPIRE_CREATION_PROBABILITY = 0.001;
	private static final double ZOMBIE_CREATION_PROBABILITY = 0.1;
	private static final double MADZOMBIE_CREATION_PROBABILITY = 0.02;

	// private ArrayList<Character> characters;
	private ArrayList<Character> characters;

	// The current state of the field.
	private Field field;
	// The current step of the simulation.
	private int step;
	// A graphical view of the simulation.
	private SimulatorView view;

	/**
	 * Initialize game.
	 */
	public void init() {
		init(DEFAULT_DEPTH, DEFAULT_WIDTH);
	}

	public void init(int depth, int width) {

		// for field
		if (width <= 0 || depth <= 0) {
			System.out.println("The dimensions must be greater than zero.");
			System.out.println("Using default values.");
			depth = DEFAULT_DEPTH;
			width = DEFAULT_WIDTH;
		}

		field = new Field(depth, width);

		view = new SimulatorView(depth, width);
		view.setColor(Human.class, Color.green);
		view.setColor(Vampire.class, Color.yellow);
		view.setColor(Zombie.class, Color.orange);
		view.setColor(MadZombie.class, Color.red);

		characters = new ArrayList<Character>();
		// Setup a valid starting point.
		reset();

		view.showStatus(step, field);

	}

	/**
	 * Perform all game logic for next turn.
	 */
	public void nextTurn() {
		step++;
		
		for (Iterator<Character> it = characters.iterator(); it.hasNext();) {
	            Character character = it.next();
	            character.run();
	            if (!character.IsAlive()) {
	                it.remove();
	            }
	            
	        }
		
		// All characters encounter the next character in the list (question 5)
		/*for (int i = 0; i < characters.size(); ++i) {

			Character c = characters.get(i);
			Character encountered = characters.get((i + 1)
					% (characters.size()));
			c.encounterCharacter(encountered);
			// on supprime tout les morts
		
			c.setLocation(c.getField().getFreeAdjacentLocations(c.getLocation()).get(0));
			System.out.println(c.getLocation());
		}
		removeDead();
		
		// Each vampire (if he is thirsty) bites the first Human in the list
		// who has not been bitten yet
		
		for (int p = 0; p < characters.size(); p++) {
			if (characters.get(p).type == 2) {
				Vampire vamp = (Vampire) characters.get(p);
				if (vamp.getIsThirsty()) {
					for (int t = 0; t < characters.size(); t++) {
						if (characters.get(t).type == 1) {
							Human bob = (Human) characters.get(t);
							if (bob.getHasBeenBitten() == false) {
								vamp.bite(bob);
								break;
							}
						}
					}
				}
			}
		}

		// Humans that have been bitten become vampires
		// ... add your code here (question 7b) ...

		for (int l = 0; l < characters.size(); l++) {
			if (characters.get(l).type == 1) {
				Human ted = (Human) characters.get(l);
				if (ted.getHasBeenBitten() == true) {
					characters.remove(ted);
				}
			}
		}

		// Perform end-of-turn actions  for all characters (question 4)
		for (int i = 0; i < characters.size(); ++i) {

			characters.get(i).endOfTurn();
		}
		*/
		view.showStatus(step, field);
		
		
	}

	// reset field and charactere
	public void reset() {
		step = 0;
		characters.clear();
		populate();

		// Show the starting state in the view.
		view.showStatus(step, field);
	}

	

	/**
	 * @return the number of human characters currently in the game
	 */
	public int nbHumansAlive() {
		// Need to iterate through the list of characters
		// and count the number of humans
		int nbHumans = 0;
		for (Character character : characters) {
			if (character instanceof Human) {
				nbHumans++;
			}
		}
		return nbHumans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Game initialization
		Simulator sim = new Simulator();
		sim.init();
		System.out.println("Game starts with " + sim.nbHumansAlive()
				+ " humans!");
		// Iterate until no alive human remains
		while (sim.nbHumansAlive() > 0) {
			sim.nextTurn();
			try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}
		System.out.println("All humans have been eaten!");
	}

	/**
	 * Generate a pseudo-random boolean.
	 * 
	 * @return pseudo-random boolean
	 */
	public static boolean GenerateRandomBoolean() {
		Random random = new Random();
		return random.nextBoolean();
	}

	/**
	 * Randomly populate the field with characters.
	 */
	private void populate() {
		Random rand = Randomizer.getRandom();
		field.clear();
		for (int row = 0; row < field.getDepth(); row++) {
			for (int col = 0; col < field.getWidth(); col++) {
				if (rand.nextDouble() <= HUMAN_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					Human human = new Human("Human 1", HP_HUMANS, field,
							location);
					characters.add(human);
				} else if (rand.nextDouble() <= VAMPIRE_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					Vampire vampire = new Vampire("Vampire 1", HP_VAMPIRES,
							field, location);
					characters.add(vampire);
				} else if (rand.nextDouble() <= ZOMBIE_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					Zombie zombie = new Zombie("Zombie 1", HP_ZOMBIES, field,
							location);
					characters.add(zombie);
				} else if (rand.nextDouble() <= MADZOMBIE_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					MadZombie madZombie = new MadZombie("MadZombie 1",
							HP_ZOMBIES, field, location);
					characters.add(madZombie);
				}
				// else leave the location empty.
			}
		}
	}

}
