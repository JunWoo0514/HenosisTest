package AASTestCase.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageTest {

	WebDriver driver;
	
	public LoginPageTest(WebDriver driver){
		this.driver = driver;
	}
	
	private By userNameTextBox = By.id("username"); 
	private By passwordTextBox = By.id("password"); 
	private By errorMessage = By.xpath("/html/body/div[1]/div[2]/form/div[1]/div[2]/span");		
	private By loginButton = By.xpath("/html/body/div/div[2]/form/div[4]/div/button");
	private By languageSelect = By.xpath("//div[contains(@class,'custom-dropdown')]/select");
	
	public void login(String userName, String password) {
		
		this.selectLangauge();
		this.setUserName(userName);
		this.setPassword(password);
		this.clickLogin();

	}
	
	public void setUserName(String userName) {
		driver.findElement(userNameTextBox).clear();
		driver.findElement(userNameTextBox).sendKeys(userName);
	}
	
	public void setPassword(String password) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void selectLangauge() {
		Select language = new Select(driver.findElement(languageSelect));				
		language.selectByVisibleText("English");	
	}
	
	public String getErrorMessage() {
		
		String errorMessageText = driver.findElement(errorMessage).getText();
		
		System.out.println("ErrorMsg: "+ errorMessageText + "\n");
		
		return errorMessageText;
	}
	
	public String getLoginMessage(){
		By loginMessage = By.xpath("/html/body/header/ul/li[1]/span");
		
		String loginMessageText = driver.findElement(loginMessage).getText();
		
		if(driver.findElements(loginMessage).size() != 0){
			return "true";
			}else{
			return "false";
			}
	}
}

