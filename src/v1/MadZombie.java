package v1;

import java.util.ArrayList;

public class MadZombie extends Zombie {

    public MadZombie(String name, int healthPoints, Field field,
            Location location) {
        super(name, healthPoints, field, location);
        this.type = 4;
    }

    public void encounterCharacter(Character c) {
        switch (c.type) {
        case 1:
            c.reduceHealthPoints(25);
            System.out.println(c.getName() + ", I'm gonna kill you");
        case 2:
            if (Simulator.GenerateRandomBoolean() == true) {
                c.reduceHealthPoints(25);
                System.out.println(c.getName() + ", I'm gonna kill you");
            }
        default:
            ;
        }
    }

    public void run() {
        int x = 0;
        if (IsAlive()) {
            ArrayList<Location> adjacentLocation = getField()
                    .adjacentLocations(getLocation());
            for (int i = 0; i < adjacentLocation.size(); i++) {
                // (Character)
                // getField().getObjectAt(adjacentLocation.get(i))adjacentLocation.getType()
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Human) {
                    this.encounterCharacter((Human) getField().getObjectAt(
                            adjacentLocation.get(i)));
                    x = 1;
                    break;
                }
                if (this.getField().getObjectAt(adjacentLocation.get(i)) instanceof Vampire) {
                    this.encounterCharacter((Vampire) getField().getObjectAt(
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
            }
        } else
            setDead();
    }

}
