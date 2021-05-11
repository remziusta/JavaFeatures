package java8.example.FunctionInterface.Consumer;

import java.util.*;
import java.util.function.Consumer;

public class Java8Consumer3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","ab","abc");
        forEach(list,(String x) -> System.out.println(x.length()));
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
