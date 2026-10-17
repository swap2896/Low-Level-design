package Burger.Basic;

import Burger.Factory.Bread;

public class BasicBread implements Bread {
    @Override
    public void prepare() {

        System.out.println("Preparing basic garlic bread with cheese and ketchup");
    }
}
