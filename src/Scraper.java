import org.json.JSONArray;

public class Scraper {

	/*
	 * returns the flight with minimum price on that day
	 */
	public Flight scrapeYatra(String origin, String destination, String day, String month, String year) {

		String jsonString = JSONUtils.downloadFromURL(Constants.getYatraURL(origin, destination, day, month, year));

		try {
			JSONArray jsonArray = new JSONArray(jsonString);
			// the json contains the list in asc order of fares. Easier for us.
			String minFare = jsonArray.getJSONObject(0).getJSONArray("mnArr").getJSONObject(0).getJSONArray("cf")
					.getJSONObject(0).getString("tf");
			String airLine= jsonArray.getJSONObject(0).getJSONArray("mnArr").getJSONObject(0).getJSONArray("cf")
					.getJSONObject(0).getString("yan");

			Flight flight = new Flight(Constants.YATRA, airLine, Integer.parseInt(minFare), Utils.convertDateToMillis(day, month,
					year));
			return flight;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void scrapeClearTrip(String origin, String destination, String day, String month, String year) {
		
	}
}