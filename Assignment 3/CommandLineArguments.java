// Joshua Potter, jop13
//  Ex. 7.15 CommandLineArguments.java, Deitel

public class CommandLineArguments {
    public static void main (String[] args) {
        // define array size if command line variable is valid
        int size = 10;
        if(args.length == 1) {
            try {
                if(Integer.parseInt(args[0]) > 0) {
                    size = Integer.parseInt(args[0]); // command line array size
                } else {
                    System.out.println("Error: invalid command line variable");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: cannot parse integer from command line variable");
            }
        }
        
        // declare variable array and initiailize it with array object
        int[] array = new int[size];

        // column heading
        System.out.printf("%s%8s%n", "Index", "Value");

        // output each array element's value
        for(int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}