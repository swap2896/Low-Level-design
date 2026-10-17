package Burger.Wheat;

import Burger.Factory.Bread;

public class BasicWheatBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing basic wheat garlic bread with cheese and ketchup");
    }
}
