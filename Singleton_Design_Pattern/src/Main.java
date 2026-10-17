public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        SingletonEagerInitialization s3 = SingletonEagerInitialization.getSingletonEagerInitialization();
        SingletonEagerInitialization s4 = SingletonEagerInitialization.getSingletonEagerInitialization();

        System.out.println(s3==s4);
    }
}