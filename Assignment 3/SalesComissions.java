// Joshua Potter, jop13
// Ex. 7.10: SalesComissions.java, Deitel

public class SalesComissions {
    public static void main(String[] args) {
        int basePay = 200;                                  // in USD $
        double comissionRate = 0.09;                        // percentage
        int[] payCounter = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };   // salary bar chart counter
        int[] salesArray = { 5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000 };    // dummy data
        
        // for each sale, calculate salary and place it corresponding position in payCounter
        for(int sale : salesArray) {
            int calculatedPay = calculatePay(sale, basePay, comissionRate);
            int index = returnIndex(calculatedPay);
            if(index != -1) {
                payCounter[index] = payCounter[index] + 1;
            }
        }

        // print salary brackets and corresponding bar chart with stars
        for(int i = 2; i < (payCounter.length + 2); i++) {
            if(i == 10) {
                System.out.printf("$%d or more: ", 1000);
            } else {
                System.out.printf("$%3d-%3d: ", i * 100, i * 100+99);
            }

            for(int stars = 0; stars < payCounter[i-2]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static int calculatePay(int sale, int basePay, double comissionRate) {
        // calculates pay based on sales and returns rounded integer
        double pay = basePay + (sale * comissionRate);
        return (int)Math.floor(pay + 0.5);
    }

    public static int returnIndex(int pay) {
        // returns array index position for corresponding salary
        int index;
        if(pay >= 200 && pay <= 299) {
            index = 0;
        } else if (pay >= 300 && pay <= 399) {
            index = 1;
        } else if (pay >= 400 && pay <= 499) {
            index = 2;
        } else if (pay >= 500 && pay <= 599) {
            index = 3;
        } else if (pay >= 600 && pay <= 699) {
            index = 4;
        } else if (pay >= 700 && pay <= 799) {
            index = 5;
        } else if (pay >= 800 && pay <= 899) {
            index = 6;
        } else if (pay >= 900 && pay <= 999) {
            index = 7;
        } else if (pay >= 1000) {
            index = 8;
        } else {
            index = -1;
        }

        return index;
    }
}