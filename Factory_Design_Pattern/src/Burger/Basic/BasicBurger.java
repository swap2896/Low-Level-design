package Burger.Basic;

import Burger.Factory.Burger;

public class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing basic burger with ketchup and cheese");
    }
}
