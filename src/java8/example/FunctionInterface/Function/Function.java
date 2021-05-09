package java8.example.FunctionInterface.Function;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
