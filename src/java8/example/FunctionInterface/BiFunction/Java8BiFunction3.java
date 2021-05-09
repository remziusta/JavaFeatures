package java8.example.FunctionInterface.BiFunction;

public class Java8BiFunction3 {
    public static void main(String[] args) {

        GPS gps = factory("40.99137","28.98650",GPS::new);
        System.out.println("Your Take Location : " + gps);
    }

    public static <R extends  GPS> R factory(String Latidute, String Longitude,
                                             BiFunction<String,String, R> func){
        return func.apply(Latidute,Longitude);
    }
}

class GPS {
    String Latidute;
    String Longitude;

    public GPS(String latidute, String longitude) {
        Latidute = latidute;
        Longitude = longitude;
    }

    public String getLatidute() {
        return Latidute;
    }

    public void setLatidute(String latidute) {
        Latidute = latidute;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "Latidute='" + Latidute + '\'' +
                ", Longitude='" + Longitude + '\'' +
                '}';
    }
}
