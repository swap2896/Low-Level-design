public abstract class Car {
    Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    public abstract void drive();
}
