package Burger.Wheat;

import Burger.Factory.Bread;

public class PremiumWheatBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing premium wheat garlic bread with cheese and ketchup");
    }
}
