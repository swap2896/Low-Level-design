package walkable;

public class NoWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Robot cannot walk");
    }
}
