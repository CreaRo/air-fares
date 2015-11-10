
public class Scraper {

	public void scrapeYatra(){
		
		String jsonString = JSONUtils.downloadFromURL(Constants.getYatraURL("PNQ", "AMD", "2015", "12", "03")); 
		
		
	}
	
}
