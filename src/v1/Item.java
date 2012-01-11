package v1;

public abstract class  Item {
    
    private Location location;
    // The field occupied.
    private Field field;
    
    
    
    
    public Item(Location location, Field field) {
        this.location = location;
        this.field = field;
        setLocation(location);
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
    
}
