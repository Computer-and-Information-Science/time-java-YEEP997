public class Time {
    public static void main(String[] args) {

        int hour = 14;   
        int minute = 30;
        int second = 45;

       
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

       
        int secondsInDay = 24 * 3600;
        int secondsRemaining = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

        
        double percentPassed = (secondsSinceMidnight / 86400.0) * 100;
        System.out.println("Percentage of the day passed: " + percentPassed + "%");

       
        int startHour = 14;
        int startMinute = 15;
        int startSecond = 20;

        int startSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int elapsedSeconds = secondsSinceMidnight - startSeconds;

        System.out.println("Elapsed time since starting: " + elapsedSeconds + " seconds");
    }
}

    