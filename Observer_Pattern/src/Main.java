import Observable.Observable;
import Observer.Observer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Observable ob = new Observable("Code Set");

        Observer observer = new Observer(ob);
        Observer observer1 = new Observer(ob);

        ob.add(observer);
        ob.add(observer1);

        ob.uploadVideo("F1");
        ob.uploadVideo("F4");
    }
}