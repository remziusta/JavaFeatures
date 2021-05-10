package java8.example.FunctionInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate6 {
    public static void main(String[] args) {
        List<Hosting> list = initHosting();

        List<Hosting> result = HostingRepository.filterHosting(list, x -> x.getName().startsWith("g"));
        System.out.println("Result : " + result);

        List<Hosting> result2 = HostingRepository.filterHosting(list,isDeveloperFriendly());
        System.out.println( "Result 2 : "+ result2);

    }

    public static List<Hosting> initHosting(){
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        return Arrays.asList(new Hosting[]{h1,h2,h3,h4});
    }

    public static Predicate<Hosting> isDeveloperFriendly(){
        return n -> n.getName().equals("linode");
    }
}

class Hosting{
    private int id;
    private String name;
    private String url;

    public Hosting(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Hosting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

class HostingRepository{
    public static List<Hosting> filterHosting(List<Hosting> hostings, Predicate<Hosting> predicate){
        return hostings.stream().filter(predicate).collect(Collectors.toList());
    }
}
