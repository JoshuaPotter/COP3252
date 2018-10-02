// Joshua Potter, jop13
//  Ex. 7.16 EnhancedForStatement.java, Deitel

public class EnhancedForStatement {
    public static void main(String[] args) {
        // if there are arguments, add together and print sum
        if(args.length > 0) {
            double total = 0;
            for(int i = 0; i < args.length; i++) {
                total += parseDouble(args[i]);
            }
            System.out.printf("Sum of arguments: %f%n", total);
        } else {
            System.out.println("Error: No command line variables given, cannot run.");
        }
    }

    public static double parseDouble(String arg) {
        // parse argument from string to double
        //    if failure, parse to 0
        double value;
        try {
            value = Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            value = 0;
        }
        return value;
    }
}