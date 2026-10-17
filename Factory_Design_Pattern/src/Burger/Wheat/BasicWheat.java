package Burger.Wheat;

import Burger.Factory.Burger;

public class BasicWheat implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing basic wheat burger with ketchup and cheese");
    }
}
