package java8.example.FunctionInterface.Predicate;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
