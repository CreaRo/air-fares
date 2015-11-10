import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	/*
	 * Convert Date to Millis which is much easier to manipulate 		
	 */
	public static long convertDateToMillis(String day, String month, String year) {
		try {
			String someDate = day + "." + month + "." + year;
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Date date = sdf.parse(someDate);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
