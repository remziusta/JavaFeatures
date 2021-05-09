package java8.example.FunctionInterface.BiFunction;

import java8.example.FunctionInterface.Function.Function;

public class Java8BiFunction2a {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> func = (a1,a2) -> Math.pow(a1,a2);

        Function<Double,String> func2 = input -> "Function result : " + String.valueOf(input);

        System.out.println("Output Text --> " + func2.apply(func.apply(2,5)));
    }

}
