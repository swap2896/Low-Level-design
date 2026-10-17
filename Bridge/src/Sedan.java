public class Sedan extends Car{
    Sedan(Engine e){
        super(e);
    }
    @Override
    public void drive() {
        System.out.print("Sedan car with ");
        engine.start();
    }
}
