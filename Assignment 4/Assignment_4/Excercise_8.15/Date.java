// Joshua Potter, jop13
// Ex. 8.15
// Date.java

public class Date {
    private int month;
    private int day;
    private int year;

    private static final String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    private static final int[] daysPerMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // default constructor
    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 1;
        
        System.out.printf("Date object constructor for date %d/%d/%d%n", this.month, this.day, this.year);
    }

    // MM/DD/YYYY
    public Date(int month, int day, int year) {
        // If we haven't assigned month between 1-12, it's invalid input
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") is out of range.");
        }

        // If day is not valid for that month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.printf("Date object constructor for date %d/%d/%d%n", this.month, this.day, this.year);
    }
    
    // June 14, 1992
    public Date(String month, int day, int year) {
        // Convert string into month number
        for(int i = 0; i < 12; i++) {
            if(month == months[i]) {
                this.month = i+1;
            }
        }

        // If we haven't assigned between 1-12, it's invalid input
        if(this.month < 1 || this.month > 12) {
            throw new IllegalArgumentException("(" + month + ") is not a month.");
        }

        // If day is not valid for that month
        if (day <= 0 || (day > daysPerMonth[this.month] && !(this.month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.day = day;
        this.year = year;
        
        System.out.printf("Date object constructor for date %d/%d/%d%n", this.month, this.day, this.year);
    }

    // DDD YYYY
    // Number day of the year out of 365
    public Date(int days, int year) {
        // Check if days provided is valid
        if(days < 1 || days > 365) {
            throw new IllegalArgumentException("day (" + days + ") is out of range");
        }

        // For each month, subtract number of days and iterate month
        //   Store remaining days
        this.month = 1;
        for(int dayPerMonth : daysPerMonth) {
            if(days > dayPerMonth) {
                days = days - dayPerMonth;
                this.month++;
            } else {
                this.day = days;
            }
        }
        this.year = year;
        
        System.out.printf("Date object constructor for date %d/%d/%d%n", this.month, this.day, this.year);
    }
}