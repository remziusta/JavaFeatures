package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate4 {
    public static void main(String[] args) {
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A","AA","AB","ABC","BB", "BBA","BAB","BAA","ABB");

        List<String> result = list.stream().filter(startWithA.negate()).collect(Collectors.toList());

        System.out.println(result);
    }
}
