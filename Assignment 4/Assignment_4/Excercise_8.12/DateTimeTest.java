// Joshua Potter, jop13
// Ex. 8.8
// DateTimeTest.java

public class DateTimeTest {
    public static void main(String[] args) {
        DateTime dt1 = new DateTime(0, 0, 0, 12, 11, 1990); // hour, minute, second, month, day, year 
        DateTime dt2 = new DateTime(1, 1, 1, 12, 11); // hour, minute, second, month, day
        DateTime dt3 = new DateTime(2, 2, 59, 12); // hour minute, second, month
        DateTime dt4 = new DateTime(23, 58, 59); // hour minute, second
        DateTime dt5 = new DateTime(12, 15); // hour, minute
        DateTime dt6 = new DateTime(0); // hour
        
        System.out.println("Some DateTime objects...");
        System.out.printf("dt1: %s%n", dt1.toString());
        System.out.printf("dt1: %s%n%n", dt1.toUniversalString());

        System.out.printf("dt2: %s%n", dt2.toString());
        System.out.printf("dt2: %s%n%n", dt2.toUniversalString());

        System.out.printf("dt3: %s%n", dt3.toString());
        System.out.printf("dt3: %s%n%n", dt3.toUniversalString());

        System.out.printf("dt4: %s%n", dt4.toString());
        System.out.printf("dt4: %s%n%n", dt4.toUniversalString());

        System.out.printf("dt5: %s%n", dt5.toString());
        System.out.printf("dt5: %s%n%n", dt5.toUniversalString());

        System.out.printf("dt6: %s%n", dt6.toString());
        System.out.printf("dt6: %s%n%n", dt6.toUniversalString());

        System.out.printf("Some DateTime increment tests...%n");
        System.out.printf("dt4: %s%n", dt4.toString());
        dt4.tick();
        System.out.printf("dt4 +1 second: %s%n", dt4.toString());
        dt4.incrementMinute();
        System.out.printf("dt4 +1 minute: %s%n", dt4.toString());
        dt4.incrementHour();
        System.out.printf("dt4 +1 hour: %s%n", dt4.toString());
        dt4.nextDay();
        System.out.printf("dt4 +1 day: %s%n", dt4.toString());
    }
}