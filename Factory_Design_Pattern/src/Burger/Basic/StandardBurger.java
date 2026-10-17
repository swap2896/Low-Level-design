package Burger.Basic;

import Burger.Factory.Burger;

public class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing standard burger with ketchup and cheese");
    }
}
