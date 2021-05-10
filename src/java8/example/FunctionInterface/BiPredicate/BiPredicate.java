package java8.example.FunctionInterface.BiPredicate;

@FunctionalInterface
public interface BiPredicate<T,U> {
    boolean test(T t, U u);
}
