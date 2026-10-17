public class GunPowerUp extends Decorator{
    GunPowerUp(Character ch) {
        super(ch);
    }

    public String getAbilities(){
        return ch.getAbilities() + " gun power up";
    }
}
