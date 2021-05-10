package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println("No Predicate Result: " + result );

        Predicate<Integer> noGreaterThan5 = x -> x > 5;

        List<Integer> result2 = list.stream().filter(noGreaterThan5).collect(Collectors.toList());

        System.out.println("Predicate Result :" + result2);
    }
}
