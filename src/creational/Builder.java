package creational;

/**
 * Builder interface for Builder pattern.
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    BuilderProduct getResult();
}
