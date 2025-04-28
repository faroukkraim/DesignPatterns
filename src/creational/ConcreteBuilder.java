package creational;

public class ConcreteBuilder implements Builder {
    private BuilderProduct product = new BuilderProduct();

    @Override
    public void buildPartA() {
        product.setPartA("Part A built");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B built");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Part C built");
    }

    @Override
    public BuilderProduct getResult() {
        return product;
    }
}
