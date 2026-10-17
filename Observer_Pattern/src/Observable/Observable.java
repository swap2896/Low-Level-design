package Observable;

import Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable{

    String name;
    String newVideo;
    public Observable(String name){
        this.name = name;
    }
    List<IObserver> observerList = new ArrayList<>();
    @Override
    public void add(IObserver o) {
        System.out.println("Observer to be added");
        observerList.add(o);
    }

    @Override
    public void remove(IObserver o) {
        System.out.println("Observer removed");
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o: observerList){
            o.update();
        }
    }

    public void uploadVideo(String title){
        this.newVideo= title;
        System.out.println("video uploaded");
        this.notifyObservers();
    }

    public String getNewVideo(){
        return newVideo;
    }
}
