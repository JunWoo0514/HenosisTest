/*
 * Author : Eric
 * Date : 2020 Aug
 */

package AASTestCase.MavenTest;

import java.text.DecimalFormat;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductModuleTest {
	DriverManager driverManager;
	WebDriver driver;
	LoginPageTest loginPageTest;
	ModuleAccess moduleAccess;
	ExtraPTTest extraPTTest;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	static String testPT = "15.5";
	
	
	@DataProvider(name="ExtraPTCase")
	public static Object[][] dataProviderExtraPTCase() {
			return new Object[][]{
			{"PIKACHU","1",testPT},
			{"PIKACHU","2",testPT},
			{"PIKACHU","3",testPT},
			{"PIKACHU","4",testPT},
			{"PIKACHU","5",testPT},
			{"PIKACHU","6",testPT},
			{"PIKACHU","7",testPT},
			{"PIKACHU","8",testPT},
			{"PIKACHU","9",testPT},
			{"PIKACHU","10",testPT},
			{"PIKACHU","11",testPT},
			{"PIKACHU","12",testPT},
			{"PIKACHU","13",testPT},
			{"PIKACHU","14",testPT}
		};
	}
	
	@BeforeTest
	public void setUP() {
		driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
		
		driver = driverManager.getWebDriver();
		driver.get("http://uat.admin.kplayone.com/");
	}
	
	@BeforeClass
	public void loginTest() {
		loginPageTest = new LoginPageTest(driver);
		loginPageTest.login("zino", "aaaa8888");
		Assert.assertEquals("true", loginPageTest.getLoginMessage());
		moduleAccess = new ModuleAccess(driver);
		moduleAccess.ModuleNav("2", "4");
	}
	
	@Test(dataProvider = "ExtraPTCase")
	public void ExtraPTTest01(String ag_code, String prdID, String ptValue) throws InterruptedException {
		extraPTTest = new ExtraPTTest(driver);
		extraPTTest.ExtraPT01(ag_code,prdID,ptValue);
		double resultPT = new Double(ptValue);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Thread.sleep(2000);
		Assert.assertEquals("true", extraPTTest.getPTResult(prdID, formatter.format(resultPT)));
	}

}
