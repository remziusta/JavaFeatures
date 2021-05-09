package java8.example.FunctionInterface.Function;

public class Java8Function2 {
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func2.apply(func.apply("remzi"));
        System.out.println(result);
    }
}
