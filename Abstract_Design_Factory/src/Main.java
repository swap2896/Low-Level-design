import Burger.Factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BurgerFactory burgerFactory = new KingBurger();
        Burger burger = burgerFactory.prepareBurger("standard");
        burger.prepare();
        Bread bread = burgerFactory.prepareBread("premium");
        bread.prepare();
    }
}