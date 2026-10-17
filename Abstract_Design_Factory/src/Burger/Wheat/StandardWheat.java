package Burger.Wheat;

import Burger.Factory.Burger;

public class StandardWheat implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing standart wheat burger with ketchup and cheese");
    }
}
