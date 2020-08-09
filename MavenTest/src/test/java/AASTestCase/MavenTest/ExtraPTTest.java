package AASTestCase.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ExtraPTTest {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ExtraPTTest(WebDriver driver){
		this.driver = driver;
	}

	private By filterName = By.id("ag_code"); 
	private By filterBtn = By.xpath("//div[contains(@class,'form-group ml-2')]/button");
	private By editBtn = By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[3]/i");
	private By saveBtn = By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[3]/i[1]");
	private By cancelBtn = By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[3]/i[2]");
	private By EvoPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[4]");
	private By EvoPTSelect = By.id("evo_pt");
	private By BGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[5]");
	private By BGPTSelect = By.id("bg_pt");
	private By MGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[6]");
	private By MGPTSelect = By.id("mg_t_pt");
	private By ASGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[7]");
	private By ASGPTSelect = By.id("asg_pt");
	private By DGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[8]");
	private By DGPTSelect = By.id("dg_pt");
	private By AVPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[9]");
	private By AVPTSelect = By.id("av_pt");
	private By PPPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[10]");
	private By PPPTSelect = By.id("pp_pt");
	private By SXGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[11]");
	private By SXGPTSelect = By.id("sxg_pt");
	private By PPSPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[12]");
	private By PPSPTSelect = By.id("pps_pt");
	private By HBSPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[13]");
	private By HBPTSelect = By.id("haba_pt");
	private By MVSPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[14]");
	private By MVPTSelect = By.id("mv_pt");
	private By NTSPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[15]");
	private By NTPTSelect = By.id("nt_pt");
	private By QSPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[16]");
	private By QSPTSelect = By.id("qs_pt");
	private By SGPT =  By.xpath("//div[contains(@class,'table-responsive')]/table/tbody/tr/td[17]");
	private By SGPTSelect = By.id("sg_pt");
	
	
	public void ExtraPT01(String agCode, String prdID, String PTValue) throws InterruptedException {
		
		this.setAgCode(agCode);
		Thread.sleep(1000);	
		this.clickFilter();
		Thread.sleep(2000);	
		this.clickEdit();
		this.selectPT(prdID, PTValue);
		this.clickSave();
		Thread.sleep(1000);	
		driver.switchTo().alert().accept();
	}
	
	public void setAgCode(String agCode) {
		driver.findElement(filterName).clear();
		driver.findElement(filterName).sendKeys(agCode);
	}
	
	public void clickFilter() {
		driver.findElement(filterBtn).click();
	}
	
	public void clickEdit() {
		driver.findElement(editBtn).click();
	}
	
	public void clickSave() {
		driver.findElement(saveBtn).click();
		
	}
	
	public void clickCancel() {
		driver.findElement(cancelBtn).click();
	}
	
	public void selectPT(String prdID, String PTValue) {
		Select evoPT = new Select(driver.findElement(EvoPTSelect));	
		Select bgPT = new Select(driver.findElement(BGPTSelect));	
		Select mgPT = new Select(driver.findElement(MGPTSelect));	
		Select asgPT = new Select(driver.findElement(ASGPTSelect));	
		Select dgPT = new Select(driver.findElement(DGPTSelect));	
		Select avPT = new Select(driver.findElement(AVPTSelect));	
		Select ppPT = new Select(driver.findElement(PPPTSelect));	
		Select sxgPT = new Select(driver.findElement(SXGPTSelect));	
		Select ppsPT = new Select(driver.findElement(PPSPTSelect));
		Select hbPT = new Select(driver.findElement(HBPTSelect));	
		Select mvPT = new Select(driver.findElement(MVPTSelect));
		Select ntPT = new Select(driver.findElement(NTPTSelect));	
		Select qsPT = new Select(driver.findElement(QSPTSelect));
		Select sgPT = new Select(driver.findElement(SGPTSelect));
		
		if(prdID == "1") {					
			evoPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "2") {					
			bgPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "3") {					
			mgPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "4") {					
			asgPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "5") {					
			dgPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "6") {					
			avPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "7") {					
			ppPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "8") {					
			sxgPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "9") {					
			ppsPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "10") {					
			hbPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "11") {					
			mvPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "12") {					
			ntPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "13") {					
			qsPT.selectByVisibleText(PTValue);	
		}
		if(prdID == "14") {					
			sgPT.selectByVisibleText(PTValue);	
		}
		
	}
	
	
	public String getPTResult(String PrdID, String PTVal){
		
		String newPT = "";
		if(PrdID.equals("1")) {
			newPT = driver.findElement(EvoPT).getText();
		}else if (PrdID.equals("2")) {
			newPT = driver.findElement(BGPT).getText();
		}else if (PrdID.equals("3")) {
			newPT = driver.findElement(MGPT).getText();
		}else if (PrdID.equals("4")) {
			newPT = driver.findElement(ASGPT).getText();
		}else if (PrdID.equals("5")) {
			newPT = driver.findElement(DGPT).getText();
		}else if (PrdID.equals("6")) {
			newPT = driver.findElement(AVPT).getText();
		}else if (PrdID.equals("7")) {
			newPT = driver.findElement(PPPT).getText();
		}else if (PrdID.equals("8")) {
			newPT = driver.findElement(SXGPT).getText();
		}else if (PrdID.equals("9")) {
			newPT = driver.findElement(PPSPT).getText();
		}else if (PrdID.equals("10")) {
			newPT = driver.findElement(HBSPT).getText();
		}else if (PrdID.equals("11")) {
			newPT = driver.findElement(MVSPT).getText();
		}else if (PrdID.equals("12")) {
			newPT = driver.findElement(NTSPT).getText();
		}else if (PrdID.equals("13")) {
			newPT = driver.findElement(QSPT).getText();
		}else if (PrdID.equals("14")) {
			newPT = driver.findElement(SGPT).getText();
		}		
		
		//System.out.println("New PT: "+ newPT + "\n");
		//System.out.println("Res PT: "+ PTVal + "\n");
		
		if(newPT.equals(PTVal)){
			return "true";
			}else{
			return "false";
			}
	}
}
