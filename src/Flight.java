public class Flight {

	long dateOfFlight;
	String website;
	int price;
	String airline;

	public Flight(String website, String airline, int price, long date) {
		this.website = website;
		this.airline = airline;
		this.dateOfFlight = date;
		this.price = price;
	}
}