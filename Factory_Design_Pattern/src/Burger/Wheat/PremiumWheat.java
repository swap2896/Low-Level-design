package Burger.Wheat;

import Burger.Factory.Burger;

public class PremiumWheat implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing premium wheat burger with ketchup and cheese");
    }
}
