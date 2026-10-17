public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Light light = new Light();
        Fan fan = new Fan();

        RemoteController r = new RemoteController();

        r.setCommands(0,new LightCommand(light));
        r.setCommands(1, new FanCommand(fan));

        System.out.println("Light button");
        r.pressButton(0);
        r.pressButton(0);

        System.out.println("Fan button");

        r.pressButton(1);
        r.pressButton(1);
    }
}