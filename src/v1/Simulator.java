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
	public Boolean stopSimulation = false;
	public int speed = 100;

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
	private double HUMAN_CREATION_PROBABILITY = 0.05;
	private double VAMPIRE_CREATION_PROBABILITY = 0.0005;
	private double ZOMBIE_CREATION_PROBABILITY = 0.003;
	private double MADZOMBIE_CREATION_PROBABILITY = 0.0001;

	// for items
	private static final double FOOD_CREATION_PROBABILITY = 0.004;
	private static final double SHOTGUN_CREATION_PROBABILITY = 0.00002;
	private static final double NITROGEN_CREATION_PROBABILITY = 0.00001;
	private static final double WOODENSTAKE_CREATION_PROBABILITY = 0.00001;

	// private ArrayList<Character> characters;
	public static ArrayList<Character> characters;

	// The current state of the field.
	private Field field;
	// The current step of the simulation.
	private int step;
	int step2 = 14;
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
		view.setColor(Human.class, Color.blue);
		view.setColor(Vampire.class, Color.red);
		view.setColor(Zombie.class, Color.green);
		view.setColor(MadZombie.class, new Color(0, 103, 0)); // vert foncé
		view.setColor(Food.class, Color.yellow);
		view.setColor(ShotGun.class, Color.black);
		view.setColor(Nitrogen.class, new Color(102, 255, 255));
		view.setColor(WoodenStake.class, new Color(102, 51, 0));

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

		step2++;

		for (int i = 0; i < characters.size(); i++) {
			Character character = characters.get(i);
			character.run();
			character.endOfTurn();
			if (!character.IsAlive()) {
				characters.remove(i);
			}
		}

		distribution();
		

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

	

	public double getHUMAN_CREATION_PROBABILITY() {
		return HUMAN_CREATION_PROBABILITY;
	}

	public void setHUMAN_CREATION_PROBABILITY(double hUMAN_CREATION_PROBABILITY) {
		HUMAN_CREATION_PROBABILITY = hUMAN_CREATION_PROBABILITY;
	}

	public double getVAMPIRE_CREATION_PROBABILITY() {
		return VAMPIRE_CREATION_PROBABILITY;
	}

	public void setVAMPIRE_CREATION_PROBABILITY(double vAMPIRE_CREATION_PROBABILITY) {
		VAMPIRE_CREATION_PROBABILITY = vAMPIRE_CREATION_PROBABILITY;
	}

	public double getZOMBIE_CREATION_PROBABILITY() {
		return ZOMBIE_CREATION_PROBABILITY;
	}

	public void setZOMBIE_CREATION_PROBABILITY(double zOMBIE_CREATION_PROBABILITY) {
		ZOMBIE_CREATION_PROBABILITY = zOMBIE_CREATION_PROBABILITY;
	}

	public double getMADZOMBIE_CREATION_PROBABILITY() {
		return MADZOMBIE_CREATION_PROBABILITY;
	}

	public void setMADZOMBIE_CREATION_PROBABILITY(
			double mADZOMBIE_CREATION_PROBABILITY) {
		MADZOMBIE_CREATION_PROBABILITY = mADZOMBIE_CREATION_PROBABILITY;
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

	private void distribution() {
		Random rand = Randomizer.getRandom();
		for (int row = 0; row < field.getDepth(); row++) {
			for (int col = 0; col < field.getWidth(); col++) {

				if (rand.nextDouble() <= FOOD_CREATION_PROBABILITY) {
					System.out.println("giving food");
					Location location = new Location(row, col);
					Food food = new Food(location, field);
				} else if (rand.nextDouble() <= SHOTGUN_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					ShotGun shotgun = new ShotGun(location, field);
				} else if (rand.nextDouble() <= NITROGEN_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					Nitrogen nitrogen = new Nitrogen(location, field);
				} else if (rand.nextDouble() <= WOODENSTAKE_CREATION_PROBABILITY) {
					Location location = new Location(row, col);
					WoodenStake woodenstake = new WoodenStake(location, field);
				}
			}
		}
	}

	private void clearItems() {
		for (int row = 0; row < field.getDepth(); row++) {
			for (int col = 0; col < field.getWidth(); col++) {
				Location location = new Location(row, col);
				if (field.getObjectAt(location) instanceof Item)
					field.clear(location);
			}
		}
	}

}
