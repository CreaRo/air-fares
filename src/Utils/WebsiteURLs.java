package Utils;
public class WebsiteURLs {

	public static String YATRA = "YATRA";
	public static String MAKEMYTRIP = "MAKEMYTRIP";
	public static String GOIBIBO = "GOIBIBO";

	public static String getYatraURL(String origin, String destination, String day, String month, String year) {
		String url = "http://www.yatra.com/air-lowest-fares/dom2/getFares?origin=" + origin + "&destination=" + destination
				+ "&startDate=" + year + "-" + month + "-" + day + "&endDate=&duration=2";
		return url;
	}

	public static String getMakeMyTripURL(String origin, String destination, String year, String month, String day) {
		String url = "";
		return url;
	}
}
