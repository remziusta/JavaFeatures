package java8.example.FunctionInterface.BiFunction;

import java8.example.FunctionInterface.Function.Function;

public class Java8BiFunction2c {
    public static void main(String[] args) {

        String result = convert(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Pow : " + String.valueOf(r));

        System.out.println("Result : " + result);


        String result1 = convert(2, 4,
                (a1, a2) -> a1 * a2,
                (r) -> "Multiply : " + String.valueOf(r));

        System.out.println("Result 1 : " + result1);

        String result2 = convert("a", "b",
                (a1, a2) -> a1 + a2,
                (r) -> r + "tr");
        System.out.println("Result 2 : " + result2);

        Integer result3 = convert("100", "200",
                (a1, a2) -> a1 + a2,
                (r) -> Integer.valueOf(r));

        System.out.println("Result 3 : " + result3);
    }

    public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
                                              BiFunction<A1, A2, R1> func,
                                              Function<R1, R2> func2) {
        return func2.apply(func.apply(a1, a2));
    }
}
