// Joshua Potter, jop13
// Ex. 8.12
// DateTime.java

public class DateTime {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


    // DateTime no-argument constructor:
    // initializes each instance variable to zero
    public DateTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.month = 1;
        this.day = 1;
        this.year = 1;
    }

    // DateTime constructor: hour supplied, minute and second defaulted to 0
    public DateTime(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
        this.minute = 0;
        this.second = 0;
        this.month = 1;
        this.day = 1;
        this.year = 1;
    }

    // DateTime constructor: hour and minute supplied, second defaulted to 0
    public DateTime(int hour, int minute) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
        this.month = 1;
        this.day = 1;
        this.year = 1;
    }

    // DateTime constructor: hour, minute and second supplied
    public DateTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = 1;
        this.day = 1;
        this.year = 1;
    }

    // DateTime constructor: hour, minute, second, and month supplied
    public DateTime(int hour, int minute, int second, int month) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.day = 1;
        this.year = 1;
    }

    // DateTime constructor: hour, minute, second, month, and day supplied
    public DateTime(int hour, int minute, int second, int month, int day) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.day = day;
        this.year = 1;
    }

    // DateTime constructor: hour, minute, second, month, day and year supplied
    public DateTime(int hour, int minute, int second, int month, int day, int year) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // DateTime constructor: another DateTime object supplied
    public DateTime(DateTime dt) {
        // invoke constructor with three arguments
        this(dt.hour, dt.minute, dt.second, dt.month, dt.day, dt.year);
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // increment seconds
    public void tick() {
        // ensure seconds and minutes dont exceed 59
        // and increment other values correctly if
        // there is overflow
        if (this.second == 59) {
            this.second = 0;
            incrementMinute();
        } else {
            this.second++;
        }
    }

    // increment minutes
    public void incrementMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            incrementHour();
        } else {
            this.minute++;
        }
    }

    // increment minutes
    public void incrementHour() {
        if (this.hour == 23) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
            nextDay();
        } else {
            this.hour++;
        }
    }

    // increment member variables to next day
    public void nextDay() {
        // check if incremented day is still in month, 
        //  and increment month or year if necessary
        if(this.day == daysPerMonth[this.month]) {
            this.day = 1;
            
            if(this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

    // convert to String in universal-time format (HH:MM:SS M/D/Y)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d, %d/%d/%d", getHour(), getMinute(), getSecond(), month, day, year);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM M/D/Y)
    public String toString() {
        return String.format("%d:%02d:%02d %s, %d/%d/%d", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), month, day, year);
    }
}