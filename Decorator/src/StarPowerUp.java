public class StarPowerUp extends Decorator {

    StarPowerUp(Character ch) {
        super(ch);
    }

    public String getAbilities(){
        return ch.getAbilities() + " with star power up";
    }
}