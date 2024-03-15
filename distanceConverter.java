public class distanceConverter {
    public static void main(String[] args) {
        
    int miles =26;
    int yards = 385;
    double kilo_m;

    kilo_m = miles * 1.609  + yards / 1760.0 * 1.609;
    System.out.println("Distance in killometers:" + kilo_m);

    }
}
