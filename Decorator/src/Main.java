public class Main {
    public static void main(String[] args) {

        Character character = new Character();
        System.out.println(character.getAbilities());
        character = new HeightUp(character);
        System.out.println(character.getAbilities());
        character = new GunPowerUp(character);
        System.out.println(character.getAbilities());
        character = new StarPowerUp(character);
        System.out.println(character.getAbilities());
        System.out.println("Hello world!");
    }
}