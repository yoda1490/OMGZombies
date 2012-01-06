package v1;

import java.util.ArrayList;

/**
 * Vampire class, derives from Character.
 * 
 * @author pylaffon
 * 
 */
public class Vampire extends Character {
    private boolean isThirsty;

    // ... add your constructor code here (question 2) ...
    public Vampire(String name, int healthPoints, Field field, Location location) {
        super(name, healthPoints, field, location);
        isThirsty = false;
        this.type = 2;
    }

    // Accessors and mutators
    public boolean getIsThirsty() {
        return isThirsty;
    }

    public void setIsThirsty(boolean isThirsty) {
        this.isThirsty = isThirsty;
    }

    /**
     * Method triggered on each character at the end of each turn.
     */
    public void endOfTurn() {
        // The vampire has 50% chance of becoming thirsty, if he is not already
        if (isThirsty || Simulator.GenerateRandomBoolean()) {
            isThirsty = true;
            say("I am thirsty now!!");
        }
    }

    /**
     * Method called when a vampire decides to bite a human
     * 
     * @param h
     *            Human who gets bitten by this vampire
     */
    public void bite(Human h) {
        // The human has no way to escape. He gets bitten.
        h.setHasBeenBitten(true);
        say("I have bitten you, " + h.getName() + "!");
        // Vampire is not thirsty anymore
        isThirsty = false;
    }

    public void encounterCharacter(Character c) {
        c.reduceHealthPoints(10);
        System.out.println(c.getName() + ", I'm gonna kill you.You still have "
                + c.getHealthPoints() + "health");
    }

    public void run() {
        int x = 0;
        if (IsAlive()) {
            ArrayList<Location> adjacentLocation =  getField()
                    .adjacentLocations(getLocation());
            for (int i = 0; i < adjacentLocation.size(); i++) {
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Human) {
                    this.encounterCharacter((Human) getField().getObjectAt(
                            adjacentLocation.get(i)));
                    x = 1;
                    break;
                }
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Zombie) {
                    this.encounterCharacter((Zombie) getField().getObjectAt(
                            adjacentLocation.get(i)));
                    x = 1;
                    break;
                }
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof MadZombie) {
                    this.encounterCharacter((MadZombie) getField().getObjectAt(
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
                newLocation = getField().freeAdjacentLocation(
                        getLocation());
                if (newLocation != null) {
                    setLocation(newLocation);
                }

            }

        } else
            setDead();
    }
}
