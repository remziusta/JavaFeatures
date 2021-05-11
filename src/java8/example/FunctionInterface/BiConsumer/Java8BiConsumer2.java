package java8.example.FunctionInterface.BiConsumer;

public class Java8BiConsumer2 {
    public static void main(String[] args) {
        addTwo(1,2, (x,y) -> System.out.println(x+y));
        addTwo("Node", "Java", (x,y) -> System.out.println(x+y));
    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T,T> c){
        c.accept(a1,a2);
    }
}
