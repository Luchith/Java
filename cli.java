public class cli {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println("First argument:" + args[0]);
            System.out.println("Second argument:" + args[1]);

        } else{
            System.out.println("please provide at least two command Line arguments");
        }
          System.out.println("Number of command line arguments:" + args.length);
    }
}
