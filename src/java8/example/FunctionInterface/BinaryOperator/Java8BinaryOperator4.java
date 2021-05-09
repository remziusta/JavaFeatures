package java8.example.FunctionInterface.BinaryOperator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Java8BinaryOperator4 {
    public static void main(String[] args) {
        List<Developer> list = setDeveloper();

        //Create a Comparator
        Comparator<Developer> comparing = Comparator.comparing(Developer::getSalary);

        //BinaryOperator with a custom Comparator
        BinaryOperator<Developer> bo = BinaryOperator.maxBy(comparing);

        Developer result = find(list,bo);

        System.out.println("Max Salary developer " + result);

        Developer developer = find(list,BinaryOperator.maxBy(Comparator.comparing(Developer::getSalary)));
        System.out.println("Max Salary developer " + developer);
        Developer developer2 = find(list,BinaryOperator.minBy(Comparator.comparing(Developer::getSalary)));
        System.out.println("Min Salary developer " + developer2);
    }

    public static Developer find(List<Developer> list, BinaryOperator<Developer> bo) {
        Developer result = null;
        for (Developer t : list){
            if (result == null) result = t;
            else result = bo.apply(result,t);
        }
        return result;
    }

    public static List<Developer> setDeveloper() {
        Developer dev1 = new Developer("Remzi", BigDecimal.valueOf(5250));
        Developer dev2 = new Developer("Ahmet", BigDecimal.valueOf(6000));
        Developer dev3 = new Developer("Burak", BigDecimal.valueOf(6250));
        Developer dev4 = new Developer("Hikmet", BigDecimal.valueOf(7000));
        Developer dev5 = new Developer("Erdinç", BigDecimal.valueOf(7250));

        return Arrays.asList(dev1, dev2, dev3, dev4, dev5);
    }
}

class Developer {
    String name;
    BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
