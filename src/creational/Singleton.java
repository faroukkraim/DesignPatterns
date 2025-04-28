package creational;

/**
 * Singleton Design Pattern example.
 * Ensures a class has only one instance and provides a global point of access to it.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance says hello!");
    }
}
