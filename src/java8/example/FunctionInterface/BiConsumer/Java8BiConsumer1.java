package java8.example.FunctionInterface.BiConsumer;

public class Java8BiConsumer1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);

        addTwo.accept(4,5);
    }
}
