public class Main {

	public static void main(String[] args) {

		String day = "12";
		String month = "12";
		String year = "2015";
		String source = "PNQ";
		String destination = "AMD";

		Scraper scraper = new Scraper();
		Flight minFlightYatra = scraper.scrapeYatra(source, destination, day, month, year);

		System.out.println(minFlightYatra.website + " | " + minFlightYatra.price);

	}
}
