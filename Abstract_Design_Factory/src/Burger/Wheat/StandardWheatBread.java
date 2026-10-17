package Burger.Wheat;

import Burger.Factory.Bread;

public class StandardWheatBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing standard wheat garlic bread with cheese and ketchup");
    }
}
