package v1;

public class ShotGun extends Weapon{
    
    private boolean canUse;

    public ShotGun(Location location, Field field){
        super(location,field);
        this.ammo = 3;
        this.canUse = true;
    }
    
    
    
    public boolean isCanUse() {
        return canUse;
    }



    public void setCanUse(boolean canUse) {
        this.canUse = canUse;
    }



    public void use(){
        if(this.getAmmo() == 0) setCanUse(false);
        else setAmmo(getAmmo()-1);
    }
    
    
}
