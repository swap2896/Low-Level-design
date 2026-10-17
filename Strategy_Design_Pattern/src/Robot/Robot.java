package Robot;

import flyable.Flyable;
import talkable.Talkable;
import walkable.Walkable;

public abstract class Robot {
    Talkable t;
    Walkable w;
    Flyable f;


    public Robot(Talkable t, Walkable w, Flyable f){
        this.t = t;
        this.w = w;
        this.f = f;
    }

    public void walk(){
        this.w.walk();
    }

    public void fly(){
        this.f.fly();
    }

    public void talk(){
        this.t.talk();
    }
    public abstract void Projection();
}
