import java.text.*;
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
