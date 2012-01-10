package v1;

public class WoodenStake extends Weapon{

    private boolean canUse;

    public WoodenStake(Location location, Field field){
        super(location,field);
        this.ammo = 1;
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
