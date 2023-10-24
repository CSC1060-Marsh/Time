import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This creates a new Time object called t1 at midnight.
        Time t1 = new Time();
        //This creates a new Time object called t2 at the user's input.
        Time t2 = new Time(17, 30, 0);
        //This uses the fromString program in the Time class to get a Time object called t3 from the string.
        Time t3 = Time.fromString("14:15:56");
        //This adds an increment of x seconds to t1. X is the user's input.
        t1.increment(3600);
        //This prints out the new time 1 from the Time class if it is military time.
        t1.print(true);
        //This prints out the new time 1 from the Time class if it is not military time.
        t1.print(false);
        //This adds an increment of x seconds to t2. X is the user's input.
        t2.increment(5430);
        //This prints out the new time 2 from the Time class if it is military time.
        t2.print(true);
        //This prints out the new time 2 from the Time class if it is not military time.
        t2.print(false);
        //This adds an increment of x seconds to t3. X is the user's input.
        t3.increment(5);
        //This prints out the new time 3 from the Time class if it is military time.
        t3.print(true);
        //This prints out the new time 3 from the Time class if it is not military time.
        t3.print(false);
    }
}