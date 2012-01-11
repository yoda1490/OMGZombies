package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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

    private int age;

    // The age at which a human can start to breed.
    private static final int BREEDING_AGE = 20;
    // The age to which a human can live.
    private static final int MAX_AGE = 50;
    // The likelihood of a human breeding.
    private static final double BREEDING_PROBABILITY = 0.02;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 3;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();

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
        this.age = 0;
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

    public boolean isHasShotGun() {
        return HasShotGun;
    }

    public void setHasShotGun(boolean hasShotGun) {
        HasShotGun = hasShotGun;
    }

    public boolean isHasNitrogen() {
        return HasNitrogen;
    }

    public void setHasNitrogen(boolean hasNitrogen) {
        HasNitrogen = hasNitrogen;
    }

    public boolean isHasWoodenStake() {
        return HasWoodenStake;
    }

    public void setHasWoodenStake(boolean hasWoodenStake) {
        HasWoodenStake = hasWoodenStake;
    }

    public ShotGun getShotgun() {
        return shotgun;
    }

    public void setShotgun(ShotGun shotgun) {
        this.shotgun = shotgun;
    }

    public Nitrogen getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(Nitrogen nitrogen) {
        this.nitrogen = nitrogen;
    }

    public WoodenStake getWoodenstake() {
        return woodenstake;
    }

    public void setWoodenstake(WoodenStake woodenstake) {
        this.woodenstake = woodenstake;
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

        Vampire vamp = new Vampire(this.getName(), this.getHealthPoints() + 1,
                this.getField(), this.getLocation());
        vamp.setIsThirsty(true);
        Simulator.characters.add(vamp);
        Simulator.characters.remove(this);
        return vamp;
    }

    public Zombie turnIntoZombie() {
        // On ajoute 1 aux points de vie de l'humain car il sera transormé en
        // Zombie seulement si celui-ci le tue
        // Donc à la création le néo-zombie aura 0 HP et sera remove de la liste
        // on lui en donne donc un
        Zombie zom = new Zombie(this.getName(), this.getHealthPoints() + 1,
                this.getField(), this.getLocation());
        Simulator.characters.add(zom);
        Simulator.characters.remove(this);
        return zom;
    }

    public void encounterCharacter(Character c) {
        System.out.println("Go away !");
    }

    public void run() {
        incrementAge();
        if (IsAlive() && age < MAX_AGE) {
            ArrayList<Location> locations = getField().adjacentLocations(
                    getLocation());
            int move = 0;
            for (int i = 0; i < locations.size(); i++) {
                if (getField().getObjectAt(locations.get(i)) instanceof Food) {
                    Food f = (Food) getField().getObjectAt(locations.get(i));
                    setLocation((locations.get(i)));
                    setTurnsSinceLastMeal(0);
                    break;
                }
                if (getField().getObjectAt(locations.get(i)) instanceof Zombie
                        && HasNitrogen == true
                        && getNitrogen().isCanUse() == true) {
                    getNitrogen().use();
                    Zombie z = (Zombie) getField()
                            .getObjectAt(locations.get(i));
                    z.setDead();
                }
                if (getField().getObjectAt(locations.get(i)) instanceof Vampire
                        && HasWoodenStake == true
                        && getWoodenstake().isCanUse() == true) {
                    getWoodenstake().use();
                    Vampire z = (Vampire) getField().getObjectAt(
                            locations.get(i));
                    z.setDead();
                }
                if (getField().getObjectAt(locations.get(i)) instanceof Zombie
                        && HasShotGun == true
                        && getShotgun().isCanUse() == true) {
                    getShotgun().use();
                    Zombie z = (Zombie) getField()
                            .getObjectAt(locations.get(i));
                    z.setStun(true);
                    z.setStunTurn(5);
                }
                if (getField().getObjectAt(locations.get(i)) instanceof WoodenStake) {
                    WoodenStake w = (WoodenStake) getField().getObjectAt(
                            locations.get(i));
                    setLocation((locations.get(i)));
                    this.setHasWoodenStake(true);
                    setWoodenstake(w);
                    break;
                }
                if (getField().getObjectAt(locations.get(i)) instanceof Nitrogen) {
                    Nitrogen w = (Nitrogen) getField().getObjectAt(
                            locations.get(i));
                    setLocation((locations.get(i)));
                    this.setHasNitrogen(true);
                    setNitrogen(w);
                    break;
                }
                if (getField().getObjectAt(locations.get(i)) instanceof ShotGun) {
                    ShotGun w = (ShotGun) getField().getObjectAt(
                            locations.get(i));
                    setLocation((locations.get(i)));
                    this.setHasShotGun(true);
                    setShotgun(w);
                    break;
                }
               /* if (getField().getObjectAt(locations.get(i)) instanceof Zombie) {
                    int oposateLocation = (i + 2) % 4;
                    if (this.getField().getObjectAt(
                            locations.get(oposateLocation)) == null) {
                        System.out.println("Human fear !!!");
                        setLocation(locations.get(oposateLocation));
                        move = 1;
                        break;
                    }
                }
                if (getField().getObjectAt(locations.get(i)) instanceof Vampire) {
                    int oposateLocation = (i + 2) % 4;
                    if (this.getField().getObjectAt(
                            locations.get(oposateLocation)) == null) {
                        System.out.println("Human fear !!!");
                        setLocation(locations.get(oposateLocation));
                        move = 1;
                        break;
                    }
                }
*/
            }
            giveBirth();
            
            ArrayList<Location> freeAdjacentLocation = getField()
                    .getFreeAdjacentLocations(getLocation());
            if (freeAdjacentLocation.size() != 0) {
                setLocation(freeAdjacentLocation.get(0));
            }
        } else
            setDead();
    }

    /**
     * Check whether or not this rabbit is to give birth at this step. New
     * births will be made into free adjacent locations.
     * 
     * @param newRabbits
     *            A list to add newly born rabbits to.
     */
    private void giveBirth() {
        // New rabbits are born into adjacent locations.
        // Get a list of adjacent free locations.
        List<Location> free = getField()
                .getFreeAdjacentLocations(getLocation());
        int births = breed();
        for (int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            Human young = new Human("human", 100, getField(), loc);
            Simulator.characters.add(young);
        }
    }

    /**
     * Generate a number representing the number of births, if it can breed.
     * 
     * @return The number of births (may be zero).
     */
    private int breed() {
        int births = 0;
        if (canBreed() && rand.nextDouble() <= BREEDING_PROBABILITY) {
            births = rand.nextInt(MAX_LITTER_SIZE) + 1;
        }
        return births;
    }

    /**
     * A rabbit can breed if it has reached the breeding age.
     * 
     * @return true if the rabbit can breed, false otherwise.
     */
    private boolean canBreed() {
        return age >= BREEDING_AGE;
    }
    
    /**
     * Increase the age. This could result in the rabbit's death.
     */
    private void incrementAge() {
        age++;
        if (age > MAX_AGE) {
            setDead();
        }
    }

}
