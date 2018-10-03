// Joshua Potter, jop13
// Ex. 8.8
// Fig. 8.8: DateTest.java

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(12,1,1990); // month, day, year 

        for(int i = 0; i < 365; i++) {
            d1.nextDay();
            System.out.printf("+%d day(s): %s%n", i+1, d1.toString());
        }
    }
}