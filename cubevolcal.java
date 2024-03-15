public class cubevolcal {
    public static void main(String[] args) {
        if (args.length==3){
            double length = Double.parseDouble(args[0]);
            double width  = Double.parseDouble(args[1]);
            double height = Double.parseDouble(args[3]);

                double volume = length * width * height ;

                System.out.println("Volume of cube:" + volume);
        } else {
            System.out.println("Java CubeVolumeCalculator <height> <width> <length>");
          }

    }
}
