package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate3 {
    public static void main(String[] args) {
        Predicate<String> lengthIs3 = x -> x.length() != 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A","AA","AB","ABC","BB", "BBA","BAB","BAA","ABB");

        List<String> result = list.stream().filter(lengthIs3.or(startWithA)).collect(Collectors.toList());

        System.out.println(result);
    }
}
