package java8.example.FunctionInterface.Consumer;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
