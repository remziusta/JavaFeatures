package java8.example.FunctionInterface.BiFunction;

@FunctionalInterface
public interface BiFunction<T, U, R>{
    R apply(T t, U u);
}
