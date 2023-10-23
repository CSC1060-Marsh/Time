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
        while (hour > 24) {
            hour = hour - 24;
        }

    }

    public void print(boolean military) {
        String printingString;
        String newHour;
        String newMinute;
        String newSecond;
        if (hour < 10) {
            newHour = "0" + hour;
        } else {
            newHour = String.valueOf(hour);
        }

        if (military == true) {
            printingString = hour + ":" + minute + ":" + second;
        } else {
            
                }
            }
        }

        System.out.println(printingString);
    }
}
// public static Time fromString(String time) {
//    int[] timeArray = new int[]{Integer.parseInt(Arrays.toString(time.split(":")))};

//   int hour = timeArray[0];
//  int minute = timeArray[1];
//  int second = timeArray[2];
//  }

