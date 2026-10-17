package Burger.Factory;

import Burger.Basic.BasicBurger;
import Burger.Basic.PremiumBurger;
import Burger.Basic.StandardBurger;
import Burger.Wheat.*;

public class KingBurger implements BurgerFactory{
    Burger burger;
    Bread bread;
    @Override
    public Burger prepareBurger(String type) {
        switch (type) {
            case "basic":
                burger = new BasicWheat();
                break;
            case "standard":
                burger = new StandardWheat();
                break;
            case "premium":
                burger = new PremiumWheat();
                break;
            default:
                System.out.println("Invalid order");
                break;
        }
        return burger;
    }

    @Override
    public Bread prepareBread(String type) {
        switch (type) {
            case "basic":
                bread = new BasicWheatBread();
                break;
            case "standard":
                bread = new StandardWheatBread();
                break;
            case "premium":
                bread = new PremiumWheatBread();
                break;
            default:
                System.out.println("Invalid order");
                break;
        }
        return bread;
    }
}
