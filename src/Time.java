import java.util.Arrays;

public class Time {
    //This defines the hour integer in the Time class.
    private int hour;
    //This defines the minute integer in the Time class.
    private int minute;
    //This defines the second integer in the Time class.
    private int second;

    //This creates the default Time constructor to set it to midnight.
    public Time() {
        //This sets the default hour to 0.
        this.hour = 0;
        //This sets the default minute to 0.
        this.minute = 0;
        //This sets the default second to 0.
        this.second = 0;
    }

    //This creates the new Time constructor using the input from t2 in the Main class.
    public Time(int hour, int minute, int second) {
        //This sets the hour to the hour in t2.
        this.hour = hour;
        //This sets the minute to the minute in t2.
        this.minute = minute;
        //This sets the second to the second in t2.
        this.second = second;
    }

    //This adds the increment method to the Time class to increment all the times.
    public void increment(int increment) {
        //This does the following if the increment is at least an hour.
        if (increment >= 3600) {
            //This adds the correct number of hours (rounded down) to the hour integer.
            hour = hour + ((increment - (increment % 3600)) / 3600);
            //This adds the correct number of minutes (rounded down) to the minute integer.
            minute = minute + (((increment % 3600) - (increment % 60)) / 60);
            //This adds the correct number of seconds to the second integer.
            second = second + (increment % 60);
            //This does the following if the increment is at least a minute but not an hour or more.
        } else if (increment >= 60) {
            //This adds the correct number of minutes (rounded down) to the minute integer.
            minute = minute + ((increment - (increment % 60)) / 60);
            //This adds the correct number of seconds to the second integer.
            second = second + (increment % 60);
            //This does the following if the increment is less than a minute.
        } else if (increment < 60) {
            //This adds the correct number of seconds to the second integer.
            second = second + increment;
        }
        //This executes the following while the second integer is at least 60.
        while (second >= 60) {
            //This adds 1 to the minute integer.
            minute = minute + 1;
            //This subtracts 60 from the second integer.
            second = second - 60;
        }
        //This executes the following while the minute integer is at least 60.
        while (minute >= 60) {
            //This adds 1 to the hour integer.
            hour = hour + 1;
            //This subtracts 60 from the minute integer.
            minute = minute - 60;
        }
        //This executes the following while the hour integer is at least 24.
        while (hour >= 24) {
            //This subtracts 24 from the hour integer, setting it to the next day.
            hour = hour - 24;
        }
    }

    //This adds the print method to the Time class to print out all the times.
    public void print(boolean military) {
        //This defines the string morningOrNight.
        String morningOrNight;
        //This defines the string newHour.
        String newHour;
        //This defines the string newMinute.
        String newMinute;
        //This defines the string newSecond.
        String newSecond;
        //This does the following if there are fewer than 10 seconds in the time.
        if (second < 10) {
            //This adds a leading 0 to the second and defines the string as newSecond.
            newSecond = "0" + second;
            //This does the following if there are not fewer than 10 seconds in the time.
        } else {
            //This defines the string newSecond as the integer second.
            newSecond = "" + second;
        }
        //This does the following if there are fewer than 10 minutes in the time.
        if (minute < 10) {
            //This adds a leading 0 to the minute and defines the string as newMinute.
            newMinute = "0" + minute;
            //This does the following if there are not fewer than 10 minutes in the time.
        } else {
            //This defines the string newMinute as the integer minute.
            newMinute = "" + minute;
        }
        //This does the following if the military boolean is false.
        if (!military) {
            //This does the following if there are fewer than 12 hours in the time.
            if (hour < 12) {
                //This defines the string morningOrNight as A.M.
                morningOrNight = " A.M.";
                //This does the following if there are not fewer than 12 hours in the time.
            } else {
                //This defines the string morningOrNight as P.M.
                morningOrNight = " P.M.";
            }
            //This does the following if the military boolean is true.
        } else {
            //This defines the string morningOrNight as nothing.
            morningOrNight = "";
        }
        //This does the following if the military boolean is false.
        if (!military) {
            //This does the following if the hour is midnight.
            if (hour == 0) {
                //This defines the variable newHour as "12", or midnight.
                newHour = "12";
                //This does the following if the hour is in the interval (0, 12].
            } else if (hour <= 12) {
                //This defines the newHour variable as the original hour.
                newHour = "" + hour;
                //This does the following if the hour is larger than 12.
            } else {
                //This redefines the newHour variable as the original hour minus twelve.
                newHour = "" + (hour - 12);
            }
            //This does the following if the military boolean is true.
        } else {
            //This defines the variable newHour as the original hour.
            newHour = "" + hour;
        }
        //This prints out the variables newHour, newMinute, newSecond, and morningOrNight in a legible fashion.
        System.out.println(newHour + ":" + newMinute + ":" + newSecond + morningOrNight);
    }

    //This adds the fromString method to the Time class to execute the t3 command.
    public static Time fromString(String time) {
        //This adds the hour, minute, and time to a time array splitting at the character ":".
        String[] timeArray = time.split(":");
        //This defines the hour integer as the integer in the first place of the time array.
        int hour = Integer.parseInt(timeArray[0]);
        //This defines the minute integer as the integer in the second place of the time array.
        int minute = Integer.parseInt(timeArray[1]);
        //This defines the second integer as the integer in the third place of the time array.
        int second = Integer.parseInt(timeArray[2]);
        //This returns a Time object consisting of the hour, minute, and second.
        return new Time(hour, minute, second);
    }
}


