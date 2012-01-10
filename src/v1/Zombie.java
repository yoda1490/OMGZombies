package v1;

import java.util.ArrayList;

/**
 * Zombie class, derives from Character.
 * 
 * @author pylaffon
 * 
 */
public class Zombie extends Character {

    private boolean isStun;
    private int stunTurn;
    private int age;
    private static final int MAX_AGE = 100;

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
        isStun = false;
        stunTurn = 0;
        age = 0;
    }

    public boolean isStun() {
        return isStun;
    }

    public void setStun(boolean isStun) {
        this.isStun = isStun;
    }

    public int getStunTurn() {
        return stunTurn;
    }

    public void setStunTurn(int stunTurn) {
        this.stunTurn = stunTurn;
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
    
    public void decrementeStun(){
        if (stunTurn == 0){
            setStun(false);
        }
        else stunTurn--;
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
        age++;
        if (IsAlive() && age < MAX_AGE) {
            if (isStun == false) {
                ArrayList<Location> adjacentLocation = getField()
                        .adjacentLocations(getLocation());
                for (int i = 0; i < adjacentLocation.size(); i++) {
                    if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Human) {
                        this.encounterCharacter((Human) getField().getObjectAt(
                                adjacentLocation.get(i)));
                        Human h = (Human) getField().getObjectAt(
                                adjacentLocation.get(i));
                        if (h.getHealthPoints() == 0)
                            h.turnIntoZombie();
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
            }
            else decrementeStun();
        } else
            setDead();

    }

}
