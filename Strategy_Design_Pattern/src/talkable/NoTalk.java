package talkable;

public class NoTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Robot cannot talk");
    }
}
