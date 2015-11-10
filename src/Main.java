import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws JSONException {

		String day = "12";
		String month = "12";
		String year = "2015";
		String source = "PNQ";
		String destination = "AMD";

		Scraper scraper = new Scraper();
		Flight minFlightYatra = scraper.scrapeYatra(source, destination, day, month, year);

		/*
		 * Add all flights with MinPrices to results array
		 */
		JSONArray results = new JSONArray();
		results.put(minFlightYatra.toJsonObject());
//		results.put(minFlightClearTrip.toJsonObject());

		JSONObject resultsString = new JSONObject().put("results", results).put("date", day + "-" + month + "-" + year);

		System.out.println(resultsString);
	}
}