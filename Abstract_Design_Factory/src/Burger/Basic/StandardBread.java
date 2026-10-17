package Burger.Basic;

import Burger.Factory.Bread;

public class StandardBread implements Bread {
    @Override
    public void prepare() {
        System.out.println("Preparing standard garlic bread with cheese and ketchup");
    }
}
