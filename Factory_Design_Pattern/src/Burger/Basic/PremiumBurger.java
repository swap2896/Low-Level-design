package Burger.Basic;

import Burger.Factory.Burger;

public class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing premium burger with ketchup and cheese");
    }
}
