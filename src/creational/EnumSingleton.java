package creational;

/**
 * Enum Singleton Design Pattern example.
 * This implementation is thread-safe and protects against reflection attacks.
 */
public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Enum Singleton instance says hello!");
    }
}
