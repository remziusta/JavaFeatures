package java8.example.FunctionInterface.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Function3 {
    public static void main(String[] args) {
        Java8Function3 obj = new Java8Function3();

        List<String> list = Arrays.asList("JavaScript","Java", "NodeJs");


        //Lambda
        Map<String,Integer> map = obj.convertListToMap(list,x->x.length());
        System.out.println("Map Length : " + map);

        //Method Reference
        Map<String,Integer> map2 = obj.convertListToMap(list,obj::getLength);
        System.out.println("Map2 Length : " + map2);
    }

    public <T,R> Map<T,R> convertListToMap(List<T> list, Function<T,R> func){
        Map<T,R> result = new HashMap<>();
        for (T t: list){
            result.put(t, func.apply(t));
        }
        return result;
    }

    public Integer getLength(String wrd){
        return wrd.length();
    }
}
