package Burger.Factory;

import Burger.Basic.*;

public class SinghBurger implements BurgerFactory{
    Burger burger;
    Bread bread;
    @Override
    public Burger prepareBurger(String type) {
        switch (type) {
            case "basic":
                burger = new BasicBurger();
                break;
            case "standard":
                burger = new StandardBurger();
                break;
            case "premium":
                burger = new PremiumBurger();
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
                bread = new BasicBread();
                break;
            case "standard":
                bread = new StandardBread();
                break;
            case "premium":
                bread = new PremiumBread();
                break;
            default:
                System.out.println("Invalid order");
                break;
        }
        return bread;
    }
}
