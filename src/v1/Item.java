package v1;

public abstract class  Item {
    
    private Location location;
    // The field occupied.
    private Field field;
    
    //item stay only x number of round
    private int persistance = 10;
    
    //number of round of this item
    private int age = 0;
    
    public Item(Location location, Field field) {
        this.location = location;
        this.field = field;
        setLocation(location);
    }
    
    //renvoi si soit true si doit rester, false si doit etre supprimŽ
    public Boolean checkPersistance(){
    	if(age > persistance){
    		field.clear(location);
    		return false;
    		
    	}else{
    	age++;
    	return true;
    	}
    }
    
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
        field.place(this, location);
    }
    public Field getField() {
        return field;
    }
    public void setField(Field field) {
        this.field = field;
    }
    public int getPersistance() {
        return this.persistance;
    }
    public void setPersistance(int persistance) {
        this.persistance = persistance;
    }
    
}
