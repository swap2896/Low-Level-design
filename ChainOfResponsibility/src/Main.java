//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Handler thousandHandler = new ThousandHandler(3);
        Handler fiveHundredHandler = new FiveHundredHandler(6);
        Handler twoHundredHandler = new TwoHundredHandler(10);

        thousandHandler.setHandler(fiveHundredHandler);
        fiveHundredHandler.setHandler(twoHundredHandler);

        thousandHandler.dispense(700);
    }
}