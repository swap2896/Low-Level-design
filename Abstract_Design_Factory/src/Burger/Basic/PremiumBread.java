package Burger.Basic;

import Burger.Factory.Bread;

public class PremiumBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing premium garlic bread with cheese and ketchup");
    }
}
