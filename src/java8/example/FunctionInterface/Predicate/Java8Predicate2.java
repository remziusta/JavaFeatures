package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //It's same List<Integer> collect = list.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());
        List<Integer> result = list.stream().filter(noGreaterThan5.and(noLessThan8)).collect(Collectors.toList());

        System.out.println(result);
    }
}
