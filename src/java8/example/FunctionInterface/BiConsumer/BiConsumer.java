package java8.example.FunctionInterface.BiConsumer;

@FunctionalInterface
public interface BiConsumer<T,U> {
    void accept(T t, U u);
}
