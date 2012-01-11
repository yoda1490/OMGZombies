package v1;

public abstract class Weapon extends Item {
    
    public int ammo;

    public Weapon (Location location, Field field){
        super(location,field);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
    
    public void clear(){
        this.getField().clear(this.getLocation());
        this.setLocation(null);
        this.setField(null);
    }
    
    public abstract void use();
}
