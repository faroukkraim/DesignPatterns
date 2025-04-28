import creational.Singleton;
import creational.EnumSingleton;
import creational.Creator;
import creational.ConcreteCreatorA;
import creational.ConcreteCreatorB;
import structural.Target;
import structural.Adapter;
import structural.Adaptee;
import structural.Component;
import structural.ConcreteComponent;
import structural.ConcreteDecorator;
import behavioral.Subject;
import behavioral.Observer;
import behavioral.ConcreteObserver;
import behavioral.Context;
import behavioral.ConcreteStrategyA;
import behavioral.ConcreteStrategyB;

import creational.Builder;
import creational.ConcreteBuilder;
import creational.Director;
import creational.BuilderProduct;
import creational.FunctionalBuilder;
import creational.EnumFunctionalFactory;
import creational.Product;

import java.util.function.Supplier;

public class DesignPatternsDemo {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern ===");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println("=== Enum Singleton Pattern ===");
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.showMessage();

        System.out.println("\n=== Builder Pattern ===");
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        BuilderProduct product = director.getProduct();
        product.showParts();

        System.out.println("\n=== Functional Builder Pattern ===");
        BuilderProduct functionalProduct = FunctionalBuilder.of(BuilderProduct::new)
            .with(BuilderProduct::setPartA, "Functional Part A")
            .with(BuilderProduct::setPartB, "Functional Part B")
            .with(BuilderProduct::setPartC, "Functional Part C")
            .build();
        functionalProduct.showParts();

        System.out.println("\n=== Factory Method Pattern with Enum Functional Factory ===");
        Product productA = EnumFunctionalFactory.CONCRETE_PRODUCT_A.create();
        productA.use();
        Product productB = EnumFunctionalFactory.CONCRETE_PRODUCT_B.create();
        productB.use();

        System.out.println("\n=== Adapter Pattern ===");
        Target adapter = new Adapter(new Adaptee());
        adapter.request();

        System.out.println("\n=== Decorator Pattern ===");
        Component component = new ConcreteComponent();
        Component decorated = new ConcreteDecorator(component);
        decorated.operation();

        System.out.println("\n=== Observer Pattern ===");
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        subject.attach(observer1);
        subject.attach(observer2);
        subject.notifyObservers("Hello Observers!");

        System.out.println("\n=== Strategy Pattern ===");
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
