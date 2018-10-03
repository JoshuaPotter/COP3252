// Joshua Potter, jop13
// Ex. 8.15
// DateTest.java

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(2,25,1995);
        Date d2 = new Date("February",25,1995);
        Date d3 = new Date(56, 1995);
        Date d4 = new Date("March",30,1995);

        // Throw exceptions on invalid input...
        // Date d4 = new Date(13,25,1995);
        // Date d5 = new Date("Hello World",25,1995);
        // Date d6 = new Date(500, 1995);
    }
}