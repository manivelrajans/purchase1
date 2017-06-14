package Purchase_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;


public class AttachedFileInformation extends RW{
	
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

	// ----------------------------"mouse hover on Attached File Information"-------------------------------//
	
	public void purchase(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// Select "Purchase" module
		WebElement Purchase = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(Purchase).build().perform();
		action.moveToElement(Purchase).perform();
		Thread.sleep(2000);

		// Select "Report"
		WebElement Report = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/ul/li[4]/a/span")));
		Report.click();
		action.moveToElement(Report).build().perform();

		// Select "Attached File Information"
		WebElement AttachedFileInformation = driver
				.findElement(By.xpath(".//*[@id='nav']/li[5]/ul/li[4]/ul/li[2]/a/span"));
		AttachedFileInformation.click();
		Thread.sleep(5000);

		// validation for expected page is open or not
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Thread.sleep(2000);

		// Click on "Fleet" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLFleet']", "US FLEET 1");
		Thread.sleep(3000);

		// Click on "Vesel" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "OVERSEAS ANACORTES");
		Thread.sleep(3000);

		// Click on "Category" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLCategory']", "US FLEET 1");
		Thread.sleep(3000);

		// Click on "Supplier" Dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLSupplier']", "10 KNOT TRANSPORTATION LLC");
		Thread.sleep(3000);
		
		// click on "search button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(3000);
		
		//Click on "Assigned to Supplier"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdFileInfo_ctl02_imgbtnAssignedToSupp']");
		Thread.sleep(3000);
		
		//click on "save" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
		Thread.sleep(3000);
		
		//click on "Info"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdFileInfo_ctl02_imgRecordInfo']");
		Thread.sleep(3000);
		
		// click on "Info"--Exit
		click_element(driver, "xpath", ".//*[@id='__divMsgTooltip_Fixed']/tr[1]/td[2]/div/img");
		Thread.sleep(3000);
		
		//Click on "Add Attachment"
		click_element(driver, "xpath", ".//*[@id='dvpage-content']/div/table[1]/tbody/tr/td[2]/div/img");
		Thread.sleep(3000);
		
		
		//Click on "Add Attachment"
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_AjaxFileUpload1_Html5InputFile']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Thread.sleep(3000);
		
		//Click on upload
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_AjaxFileUpload1_UploadOrCancelButton']");
		Thread.sleep(3000);
		
		//Click on Exit Button
		click_element(driver, "xpath", ".//*[@id='closePopupbutton']");
		Thread.sleep(3000);
		
	    //Click on "Clear Filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		Thread.sleep(3000);
		
		//Click on CLose Button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnBack']");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
