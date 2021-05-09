package java8.example.FunctionInterface.BiFunction;

import java8.example.FunctionInterface.Function.Function;

public class Java8BiFunction2b {
    public static void main(String[] args) {

        String result = powToString(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Result : " + String.valueOf(r));

        System.out.println(result);
    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double, R> func2) {

        return func2.apply(func.apply(a1, a2));
    }
}
