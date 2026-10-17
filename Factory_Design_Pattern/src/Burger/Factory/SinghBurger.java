package Burger.Factory;

import Burger.Basic.BasicBurger;
import Burger.Basic.PremiumBurger;
import Burger.Basic.StandardBurger;

public class SinghBurger implements BurgerFactory{
    Burger burger;
    @Override
    public void prepare(String type) {
        switch (type) {
            case "basic":
                burger = new BasicBurger();
                burger.prepare();
                break;
            case "standard":
                burger = new StandardBurger();
                burger.prepare();
                break;
            case "premium":
                burger = new PremiumBurger();
                burger.prepare();
                break;
            default:
                System.out.println("Invalid order");
                break;
        }

    }
}
