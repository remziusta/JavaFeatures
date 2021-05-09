package java8.example.FunctionInterface.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8UnaryOperator2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result = math(list, x -> x *2);

        System.out.println("Result list : " + result);

    }

    public static <T> List<T> math(List<T> list, UnaryOperator<T> uo){
        List<T> result = new ArrayList<>();
        for (T t : list)
            result.add(uo.apply(t));

        return  result;
    }
}
