package v1;

public class Food extends Item {

    public Food(Location location, Field field){
        super(location,field);
    }
    
    public void use(){
        this.getField().clear(this.getLocation());
        this.setLocation(null);
        this.setField(null);
    }
}
