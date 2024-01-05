import java.text.*;
/*
* Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
          - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
*/
public class TimeConversion {
    public static String timeConversion(String s) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
            SimpleDateFormat ouputFormat = new SimpleDateFormat("HH:mm:ss");

            return ouputFormat.format(inputFormat.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();

            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
