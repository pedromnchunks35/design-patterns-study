package designPatterns.Creational;

public class Singleton {
    // ? Private and static instance , class level
    private static Singleton instance;

    // ? Private constructor
    private Singleton() {
    }

    public static Singleton getInstance() {
        // ? Checking before lock
        if (instance == null) {
            synchronized (Singleton.class) {
                //? Check after lock
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
