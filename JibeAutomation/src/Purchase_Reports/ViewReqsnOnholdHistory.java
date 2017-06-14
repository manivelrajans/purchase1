package Purchase_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class ViewReqsnOnholdHistory extends RW{
	
	private static ExtentReports report;

	// ------------------------------------------------------Report----------------------------------------------------------------------------------//
	public synchronized static ExtentReports getReporter(String filePath) {
		if (report == null) {
			report = new ExtentReports("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html", false);

			report.addSystemInfo("Host Name", "Reshma")
			.addSystemInfo("Environment", "QA");
		}

		return report;
	}
	// -----------------------------------------------------------"mouse hover on Reports"-------------------------------//
	
	public void purchase(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// Select "Purchase" module
		WebElement adminm = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(adminm).build().perform();
		action.moveToElement(adminm).perform();
		Thread.sleep(2000);

		// Select "Report"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/ul/li[4]/a/span")));
		admin.click();
		action.moveToElement(admin).build().perform();

		// Select "View Reqsn Onhold History"
		WebElement ViewReqsnOnholdHistory = driver.findElement(By.xpath(".//*[@id='nav']/li[5]/ul/li[4]/ul/li[3]/a/span"));		
		ViewReqsnOnholdHistory.click();
		Thread.sleep(5000);
	}

	//************************************ Search Functionality ********************************************************************//
	
	public void search(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// Click on "Fleet" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlFleet']", "US FLEET 1");
		Thread.sleep(3000);

		// Click on "Vessel" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "Demo OSG Test 1");
		Thread.sleep(3000);
	
		// Click on "reqsn. code"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtReqCode']", "TST1-3-170004-O");
		Thread.sleep(3000);
			
		// Click on "onHold" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "OnHold");
		Thread.sleep(3000);
		
	   //click on "Search"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFilter']");
		Thread.sleep(4000);
		
	   //Click on "Clear Filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		Thread.sleep(4000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}