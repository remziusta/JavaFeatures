package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        System.out.println(StringProcessor.filter(list,
                x -> x.startsWith("A")));

        System.out.println(StringProcessor.filter(list,
                x -> x.startsWith("A") && x.length() == 3));
    }
}

class StringProcessor{
    static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
}