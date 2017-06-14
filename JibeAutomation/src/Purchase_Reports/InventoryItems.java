package Purchase_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class InventoryItems extends RW{
	
	
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
			WebElement ViewReqsnOnholdHistory = driver.findElement(By.xpath(".//*[@id='nav']/li[5]/ul/li[4]/ul/li[4]/a/span"));		
			ViewReqsnOnholdHistory.click();
			Thread.sleep(5000);
		}
		
		// -----------------------------------------------------------"mouse hover on Inventory Items "-------------------------------//
		
			public void InventoryItems (WebDriver driver1) throws Exception {
				WebDriver driver = driver1;	
		
		// Click on "Fleet" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLFleet']", "US FLEET 1");
		Thread.sleep(3000);

		// Click on "Vesel" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "OVERSEAS ANACORTES");
		Thread.sleep(3000);

		// Click on "Department" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbDept']", "DECK STORES-CONSUMABLES");
		Thread.sleep(3000);
		
		
	/*	// Click on "Catalogue" dropdown
		dropdown(driver, "id", "ctl00_MainContent_ddlCatalogue", "US FLEET 1");
		Thread.sleep(3000);*/

		// Click on "Sub Catalogue" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlSubCatalogue']", "ALL");
		Thread.sleep(3000);

		// Click on "Search" Button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSearch']");
		Thread.sleep(4000);
		
		//Click on "View record log"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_gvInventoryItems_ctl02_ImgUpdatedBy']");
		Thread.sleep(4000);
		
		//Select "Store Radio Button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_optList_1']");
		Thread.sleep(4000);
		
		// Click on "Department" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbDept']", "DECK STORES-APPLIANCES");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}}
