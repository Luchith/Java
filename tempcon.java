public class tempcon {
    public static void main(String[] args) {
        if (args.length == 1) {
            int celsius = Integer.parseInt(args[0]);

            double fahrenheight = 1.8 * celsius + 32;

            System.out.println("Temprature in Fahrenheight:" + fahrenheight);
        } else {
            System.out.println("Java CelsiusToFahrenheit <temperature_in_celsius>");
        }
    }
}
