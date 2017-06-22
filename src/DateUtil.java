import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {

    public static Date StringToDate(String data) throws Exception {

        if (data.isEmpty() || data == null)
            throw new NullPointerException();
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date StringToDateTime(String data) throws Exception {
        if (data.isEmpty() || data == null)
            throw new NullPointerException();
        try {
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return format.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}


