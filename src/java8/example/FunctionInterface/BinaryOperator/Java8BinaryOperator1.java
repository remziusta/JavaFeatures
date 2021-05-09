package java8.example.FunctionInterface.BinaryOperator;

import java8.example.FunctionInterface.BiFunction.BiFunction;

public class Java8BinaryOperator1 {
    public static void main(String[] args) {

        //BiFunction
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1 + x2;

        Integer result = func.apply(2,3);

        System.out.println("BiFunction result : " + result);

        //BinaryOperator
        BinaryOperator<Integer> func2 = (x1,x2) -> x1 + x2;

        Integer result2 = func2.apply(2,3);

        System.out.println("Binary Operator result : " + result2);


    }
}
