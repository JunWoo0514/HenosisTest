package AASTestCase.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModuleAccess {
	
	WebDriver driver;
	
	public ModuleAccess(WebDriver driver){
		this.driver = driver;
	}
	
	//Sub Menu Section
	//2. Product
	private By Menu2 = By.xpath("//div[contains(@class,'sidebar')]/nav/ul/li[2]/a");
	
	//Sub Menu Item
	//2.4 ExtraPT
	private By extraPTMenu = By.xpath("//div[contains(@class,'sidebar')]/nav/ul/li[2]/ul/li[4]/a");
	
	public void ModuleNav(String Section, String Item) {
		this.clickMenu(Section);
		this.clickExtraPT(Item);
	}
	
	public void clickMenu(String section) {
		if(section.equals("2")) {
			driver.findElement(Menu2).click();
		}
	}
	
	public void clickExtraPT(String item) {
		if(item.equals("4")) {
			driver.findElement(extraPTMenu).click();
		}
	}

}
