import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the increment in seconds:");
        int increment = sc.nextInt();
    }

    public static class Time {
        Scanner sc = new Scanner(System.in);
        private int hour;
        private int minute;
        private int second;
        public Time() {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        public Time(int hour, int minute, int second) {
            System.out.println("Enter the hour:");
            hour = sc.nextInt();
            System.out.println("Enter the minute:");
            minute = sc.nextInt();
            System.out.println("Enter the second:");
            second = sc.nextInt();

            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public static void print(boolean booleanInput) {
        if (booleanInput == true) {
            System.out.println("Make This Military Time");
        }
    }
}