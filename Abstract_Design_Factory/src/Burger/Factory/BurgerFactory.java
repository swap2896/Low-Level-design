package Burger.Factory;

public interface BurgerFactory {
    public Burger prepareBurger(String type);
    public Bread prepareBread(String type);
}
