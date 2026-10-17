package Observer;

import Observable.Observable;

public class Observer implements IObserver{
    Observable ob;
    public Observer(Observable ob) {
        this.ob = ob;
    }
    @Override
    public void update() {
        System.out.println("Watching new video");
        System.out.println(this.ob.getNewVideo());
    }
}
