package AASTestCase.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutTest {
	
	WebDriver driver;
	
	public LogoutTest(WebDriver driver){
		this.driver = driver;
	}
	
	private By avatarButton = By.xpath("/html/body/header/ul/li[2]/a");
	private By logoutButton = By.xpath("/html/body/header/ul/li[2]/div/a[2]");
	
	
	public void logout() {
		
		this.clickAvatar();
		this.clickLogout();

	}
	
	public void clickAvatar() {
		driver.findElement(avatarButton).click();
	}
	
	public void clickLogout() {
		driver.findElement(logoutButton).click();
	}

}
