//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Car sedan = new Sedan(new Electric());
        sedan.drive();
        Car suv = new Suv(new Petrol());
        suv.drive();
        Car suvElectric = new Suv(new Electric());
        suvElectric.drive();
    }
}