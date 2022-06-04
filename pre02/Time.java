public class Time {
    public static void main(String[] args){
    int hour = 9;
    int minute = 19;
    int second = 5;
    int totalSecondsInADay = 24*3600;
    int secondsSinceMidnight = second + minute*60 + hour*3600;
    int secondsRemainingInTheDay = totalSecondsInADay - (5 + minute*60 + hour*3600);
    System.out.println("Seconds since midnight " + secondsSinceMidnight + ".");
    System.out.println("Seconds remaining in the day " + secondsRemainingInTheDay + ".");
    double percentageDayHasPassed = (1.0 - ((24.0*3600 - (second + minute*60 + hour * 3600))/(24.0*3600)))*(100.0) ;
    System.out.println("Percentage of the day that has passed " + percentageDayHasPassed + ".");
    hour = 9;
    minute = 48;
    second = 10;
    int timeSinceExerciseStarted = (second + minute*60 + hour*3600)-(secondsSinceMidnight);
    System.out.println("Seconds since exercise has started " + timeSinceExerciseStarted);
    }
}