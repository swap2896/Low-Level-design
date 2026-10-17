package Burger.Factory;

import Burger.Basic.BasicBurger;
import Burger.Basic.PremiumBurger;
import Burger.Basic.StandardBurger;
import Burger.Wheat.BasicWheat;
import Burger.Wheat.PremiumWheat;
import Burger.Wheat.StandardWheat;

public class KingBurger implements BurgerFactory{
    Burger burger;
    @Override
    public void prepare(String type) {
        switch (type) {
            case "basic":
                burger = new BasicWheat();
                burger.prepare();
                break;
            case "standard":
                burger = new StandardWheat();
                burger.prepare();
                break;
            case "premium":
                burger = new PremiumWheat();
                burger.prepare();
                break;
            default:
                System.out.println("Invalid order");
                break;
        }

    }
}
