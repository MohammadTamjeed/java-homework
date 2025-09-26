import java.util.TimeZone;
import java.util.Date;
        import java.text.SimpleDateFormat;


public class op {
    public static void main(String[] Args) {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:SS");
    Date now = new Date();

        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Korea"));

        System.out.println("Korea : "+sdf.format(now));
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Saudi"));
        System.out.println("Saudi : "+ sdf.format(now));
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kabul"));
        System.out.println("Kabul : "+ sdf.format(now));
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Iran"));
        System.out.println("Iran : "+ sdf.format(now));
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/India"));
        System.out.println("India : "+ sdf.format(now));
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Pakistan"));
        System.out.println("Pakistan : "+ sdf.format(now));

    }
}