import java.util.Arrays;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void increment(int increment) {
        if (increment >= 3600) {
            hour = hour + ((increment - (increment % 3600)) / 3600);
            minute = minute + (((increment % 3600) - (increment % 60)) / 60);
            second = second + (increment % 60);
        } else if (increment >= 60) {
            minute = minute + ((increment - (increment % 60)) / 60);
            second = second + (increment % 60);
        } else if (increment < 60) {
            second = second + increment;
        }
        while (second >= 60) {
            minute = minute + 1;
            second = second - 60;
        }
        while (minute >= 60) {
            hour = hour + 1;
            minute = minute - 60;
        }
        while (hour >= 24) {
            hour = hour - 24;
        }

    }

    public void print(boolean military) {
        String morningOrNight;
        String newHour;
        String newMinute;
        String newSecond;
        if (second < 10) {
            newSecond = "0" + second;
        } else {
            newSecond = "" + second;
        }
        if (minute < 10) {
            newMinute = "0" + minute;
        } else {
            newMinute = "" + minute;
        }
        if (!military) {
            if (hour < 12) {
                morningOrNight = " A.M.";
            } else {
                morningOrNight = " P.M.";
            }
        } else {
            morningOrNight = "";
        }

        if (!military) {
            if (hour == 0) {
                newHour = "12";
            } else if (hour <= 12) {
                newHour = "" + hour;
            } else {
                newHour = "" + (hour - 12);
            }
        } else {
            newHour = "" + hour;
        }
        System.out.println(newHour + ":" + newMinute + ":" + newSecond + morningOrNight);
    }

    public static Time fromString(String time) {
        String[] timeArray = time.split(":");
        int hour = Integer.parseInt(timeArray[0]);
        int minute = Integer.parseInt(timeArray[1]);
        int second = Integer.parseInt(timeArray[2]);
        return new Time(hour, minute, second);
    }
}


