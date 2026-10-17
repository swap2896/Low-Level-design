import Robot.Robot;
import flyable.NormalFly;
import talkable.NoTalk;
import talkable.NormalTalk;
import walkable.NoWalk;
import Robot.CompanionRobot;
import walkable.NormalWalk;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");


        Robot r = new CompanionRobot(new NormalTalk(), new NoWalk(),new NormalFly());
        r.fly();
        r.talk();
        r.walk();
        r.Projection();

        Robot r1 = new CompanionRobot(new NoTalk(), new NormalWalk(),new NormalFly());
        r1.fly();
        r1.talk();
        r1.walk();
        r1.Projection();


    }
}