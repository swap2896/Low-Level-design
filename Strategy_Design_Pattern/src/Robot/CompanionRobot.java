package Robot;

import flyable.Flyable;
import talkable.Talkable;
import walkable.Walkable;

public class CompanionRobot extends Robot{

    public CompanionRobot(Talkable t, Walkable w, Flyable f){
        super(t,w,f);
    }
    @Override
    public void Projection() {
        System.out.println("Companion Robot Projection called");
    }
}
