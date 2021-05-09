package java8.example.FunctionInterface.Function;

public class Java8Function1 {
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("remzi");

        System.out.println("Text length : " + apply);
    }
}
