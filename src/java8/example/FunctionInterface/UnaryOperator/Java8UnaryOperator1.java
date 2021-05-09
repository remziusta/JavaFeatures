package java8.example.FunctionInterface.UnaryOperator;


import java8.example.FunctionInterface.Function.Function;

public class Java8UnaryOperator1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        Integer result = func.apply(2);
        System.out.println("Result : " + result);

        UnaryOperator<Integer> func2 = x -> x * 2;
        Integer result2  = func2.apply(2);
        System.out.println("Result 2 : " + result2);

    }
}
