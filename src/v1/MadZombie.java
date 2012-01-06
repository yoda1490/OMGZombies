package v1;

public class MadZombie extends Zombie {

    public MadZombie(String name, int healthPoints, Field field, Location location) {
        super(name, healthPoints, field, location);
       this.type = 4;
    }
    
    public void encounterCharacter(Character c){
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

   
}
