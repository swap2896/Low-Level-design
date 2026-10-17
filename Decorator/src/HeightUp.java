public class HeightUp extends Decorator{
    HeightUp(Character ch) {
        super(ch);
    }
    public String getAbilities(){
        return ch.getAbilities() + " with heightUp";
    }
}
