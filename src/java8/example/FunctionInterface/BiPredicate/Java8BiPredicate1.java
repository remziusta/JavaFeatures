package java8.example.FunctionInterface.BiPredicate;

import java.util.function.BiPredicate;

public class Java8BiPredicate1 {
    public static void main(String[] args) {
        BiPredicate<String,Integer> filter = (x,y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("remzi",5);
        System.out.println("Result : " + result);

        boolean result2 = filter.test("Enes", 3);
        System.out.println("Result 2 : " + result2);
    }
}
