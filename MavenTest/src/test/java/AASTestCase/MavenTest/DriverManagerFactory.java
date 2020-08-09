package AASTestCase.MavenTest;

public class DriverManagerFactory {
	
	public static DriverManager getDriverManager (DriverType type) {
		
		DriverManager driverManager;
		
		switch(type) {
		case CHROME:
			driverManager = new ChromeDriverManager();	
			
		default:
			driverManager = new ChromeDriverManager();	
			break;
		}
		
		return driverManager;
	}

}
