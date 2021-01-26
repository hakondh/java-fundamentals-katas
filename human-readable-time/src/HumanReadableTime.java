import java.util.concurrent.TimeUnit;

public class HumanReadableTime {
    public static String convert(int time) {
        if(time > 359999 || time < 0) return null;
        int seconds = time % 60;
        int minutes = (time % 3600) / 60;
        int hours = time / 3600;

        String secondsString = String.format("%02d", seconds);
        String minutesString = String.format("%02d", minutes);
        String hoursString = String.format("%02d", hours);

        return hoursString + ":" + minutesString + ":" + secondsString;
    }
}
