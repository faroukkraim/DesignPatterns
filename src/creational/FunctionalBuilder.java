package creational;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Generic Builder pattern example using functional interfaces.
 */
public class FunctionalBuilder<T> {

    private final Supplier<T> instantiator;

    private List<Consumer<T>> instanceModifiers = new ArrayList<>();

    public FunctionalBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public static <T> FunctionalBuilder<T> of(Supplier<T> instantiator) {
        return new FunctionalBuilder<T>(instantiator);
    }

    public <U> FunctionalBuilder<T> with(BiConsumer<T, U> consumer, U value) {
        Consumer<T> c = instance -> consumer.accept(instance, value);
        instanceModifiers.add(c);
        return this;
    }

    public T build() {
        T value = instantiator.get();
        instanceModifiers.forEach(modifier -> modifier.accept(value));
        instanceModifiers.clear();
        return value;
    }
}
