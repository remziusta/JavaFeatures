package java8.example.FunctionInterface.BinaryOperator;

import java.util.function.IntBinaryOperator;

public class Java8BinaryOperator3 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int result = math(numbers,0,(a,b) -> a + b);

        System.out.println(result);

        int result2 = math(numbers,0,Integer::sum);
        System.out.println(result2);

    }

    public static int math(int[] list, int init, IntBinaryOperator accumulator){
        int result = init;
        for (int t : list) result = accumulator.applyAsInt(result,t);

        return result;
    }
}
