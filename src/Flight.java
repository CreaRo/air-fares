import org.json.JSONObject;

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

	public JSONObject toJsonObject() {
		JSONObject object = new JSONObject();
		try {
			object.put("website", this.website);
			object.put("price", this.price);
			object.put("airline", this.airline);
			object.put("dateOfFlight", this.dateOfFlight);
			return object;
		} catch (Exception e) {
			return null;
		}
	}
}