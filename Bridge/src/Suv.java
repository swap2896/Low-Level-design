public class Suv extends Car{
    Suv(Engine e){
        super(e);
    }
    @Override
    public void drive() {
        System.out.print("Suv car with ");
        engine.start();
    }
}
