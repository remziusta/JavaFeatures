package java8.example.FunctionInterface.BinaryOperator;

import java.util.Arrays;
import java.util.List;

public class Java8BinaryOperator2 {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        Integer result = math(Arrays.asList(numbers),0,(a, b) -> a + b);

        System.out.println("Lambda operator result : " + result);

        Integer result2 = math(Arrays.asList(numbers),0,Integer::sum);

        System.out.println("Method referance result : " + result2 );

    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator){
        T result = init;
        for (T t : list){
            result = accumulator.apply(result,t);
        }

        return result;
    }
}
