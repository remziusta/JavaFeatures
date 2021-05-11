package java8.example.FunctionInterface.BiConsumer;


import java.util.LinkedHashMap;
import java.util.Map;

public class JavaMapBiConsumer {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"JavaScript");
        map.put(3,"Python");
        map.put(4,"C++");
        map.put(5,"Go");

        map.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}

