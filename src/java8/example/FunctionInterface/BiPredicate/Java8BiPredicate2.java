package java8.example.FunctionInterface.BiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Java8BiPredicate2 {
    public static void main(String[] args) {
        List<Domain> domains = initDomain();

        BiPredicate<String, Integer> bi = (domain, score) -> {
            return (domain.equalsIgnoreCase("google.com") || score == 0);
        };

        List<Domain> result = filterBadDomain(domains, bi);
        System.out.println("Result-1 :" + result);

        List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
        System.out.println("Result-2 :" + result2);

        List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
        System.out.println("Result-3 :" + result3);

        List<Domain> result4 = filterBadDomain(domains, bi.or(
                (domain, x) -> domain.equalsIgnoreCase("microsoft.com"))
        );
        System.out.println("Result-4 :" + result4);
    }

    public static List<Domain> initDomain() {
        return Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("remziusta.com", 0),
                new Domain("microsoft.com", 2));
    }

    public static <T extends Domain> List<Domain> filterBadDomain(List<Domain> list, BiPredicate<String, Integer> biPredicate) {
        return list.stream().filter(x -> biPredicate.test(x.getName(), x.getScore()))
                .collect(Collectors.toList());
    }
}

class Domain {
    String name;
    Integer score;

    public Domain(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }


    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}