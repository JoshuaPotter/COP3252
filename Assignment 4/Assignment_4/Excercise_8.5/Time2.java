// Joshua Potter, jop13
// Ex. 8.5
// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2 {
   private int secondsSinceMidnight; // 0 - 23

   // Time2 no-argument constructor:
   // initializes each instance variable to zero
   public Time2() {
      this.secondsSinceMidnight = 0; // invoke constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.secondsSinceMidnight = (hour * 60) * 60; // invoke constructor with three arguments
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2(int hour, int minute) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      // convert hour and minutes to seconds and add
      this.secondsSinceMidnight = (hour * 60) * 60 + minute * 60; // invoke constructor with three arguments
   }

   // Time2 constructor: hour, minute and second supplied
   public Time2(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      // convert hour and minutes to seconds and add with seconds parameter
      this.secondsSinceMidnight = (hour * 60) * 60 + minute * 60 + second;
   }

   // Time2 constructor: another Time2 object supplied
   public Time2(Time2 time) {
      // invoke constructor with three arguments
      this.secondsSinceMidnight = time.secondsSinceMidnight;
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

      // convert hour and minutes to seconds and add with seconds parameter
      this.secondsSinceMidnight = (hour * 60) * 60 + minute * 60 + second;
   }

   // validate and set hour
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.secondsSinceMidnight = (hour * 60) * 60;
   }

   // validate and set minute
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      this.secondsSinceMidnight = minute * 60;
   }

   // validate and set second
   public void setSecond(int second) {
      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.secondsSinceMidnight = second;
   }

   // Get Methods
   // get hour value
   public int getHour() {
      return (this.secondsSinceMidnight % 86400) / 3600;
   }

   // get minute value
   public int getMinute() {
      return ((this.secondsSinceMidnight % 86400) % 3600) / 60;
   }

   // get second value
   public int getSecond() {
      return ((this.secondsSinceMidnight % 86400) % 3600) % 60;
   }

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString() {
      return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString() {
      return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(),
            getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
}