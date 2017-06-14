package purchase_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ApprovalSetting extends RW{

	 

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Reshma") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void ApprovalSettings(WebDriver driver1) throws InterruptedException {  //(priority=26)

		WebDriver driver = driver1;
		
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement ApprovalSetting  = driver.findElement(By.linkText(data.getData(5,196,2))); // path for Approval Setting
		ApprovalSetting.click();    	
		Thread.sleep(3000);
		
	}

	public void AddNewGroup(WebDriver driver1) throws Exception {  //(priority=27)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,197,2))); //Click on Add New Group
		Thread.sleep(2000);	
		
		dropdown(driver, "id", (data.getData(5,198,2)),(data.getData(5,199,2)));// Dropdown -->PO Type  -->Contract
		Thread.sleep(1000);
		
		
		click_element(driver, "id",(data.getData(5,200,2))); //Click on Group Name
		Thread.sleep(2000);	
		
		sendkeys(driver,"id", (data.getData(5,201,2)), (data.getData(5,202,2))); //Sendkeys for Group Name
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,203,2))); //Click on Save
		Thread.sleep(2000);
		
		click_element(driver, "id",(data.getData(5,204,2))); //Click on close Popupbutton
		Thread.sleep(2000);
		
}
}