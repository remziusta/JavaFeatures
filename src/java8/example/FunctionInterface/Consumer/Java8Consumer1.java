package java8.example.FunctionInterface.Consumer;

public class Java8Consumer1 {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);

        print.accept("Selam Java");
    }
}
