public class SingletonEagerInitialization {

    private SingletonEagerInitialization(){
        System.out.println("SingletonEagerInitialization called");
    }

    public static SingletonEagerInitialization getSingletonEagerInitialization() {
        return singletonEagerInitialization;
    }

    // Eager Initialization
    private static SingletonEagerInitialization singletonEagerInitialization =
            new SingletonEagerInitialization();
}
