package Purchase_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;



public class ViewReqsnSummary extends RW{
	
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

			// Select "View Requisition Summary "
			WebElement CashAdvanceLimit = driver.findElement(By.xpath(".//*[@id='nav']/li[5]/ul/li[4]/ul/li[1]/a/span"));
			CashAdvanceLimit.click();
			Thread.sleep(5000);
}
		// -----------------------------------------------------------"Search functionality"-------------------------------//
		

			public void Search(WebDriver driver1) throws Exception {
				WebDriver driver = driver1;
		
		
		// Click on "Fleet" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLFleet']", "US FLEET 1");
		Thread.sleep(3000);

		// Click on "Vesel" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "OVERSEAS ANACORTES");
		Thread.sleep(3000);

		/*// Click on "Department"
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbDept']", "DECK STORES-APPLIANCES");
		Thread.sleep(3000);*/

		// Click on "Show all On Hold"
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlHoldUnhold']", "Un Hold");
		Thread.sleep(3000);

		// Click on "Urgency Of Req"
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbUrgency']", "Normal");
		Thread.sleep(3000);
		
		// click on "search button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(3000);
		
		//click on "Clear Filters"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		Thread.sleep(3000);
		
		//click on Export
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnExport']");
		Thread.sleep(3000);
		
		
		
		
}}