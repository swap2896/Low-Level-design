import Burger.Factory.Burger;
import Burger.Factory.BurgerFactory;
import Burger.Factory.KingBurger;
import Burger.Factory.SinghBurger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        BurgerFactory burgerFactory = new KingBurger() ;

        burgerFactory.prepare("premium");
    }
}