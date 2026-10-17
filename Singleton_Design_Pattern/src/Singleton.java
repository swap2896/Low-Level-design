public class Singleton {

    public static volatile Singleton singleton = null;
    private Singleton () {
        System.out.println("Singleton Pattern called");
    }

    /**
     * Key Points:
     * volatile ensures visibility of changes across threads.

     * synchronized block is only entered the first time (when singleton is null).

     * Safe and efficient in a multithreaded environment.
     */

    
    public static synchronized Singleton getSingleton() {
        if(singleton==null) {
            synchronized(Singleton.class) {
                if(singleton ==  null ) {  // double check is required if 2 threads come at the same time
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
