public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JsonClass jsonClass = new Adapter(new XMLClass());
        jsonClass.getData();
    }
}