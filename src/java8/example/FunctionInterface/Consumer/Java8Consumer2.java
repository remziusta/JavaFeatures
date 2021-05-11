package java8.example.FunctionInterface.Consumer;

import java.util.*;

public class Java8Consumer2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);

        forEach(list,consumer);
    }

    static  <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
