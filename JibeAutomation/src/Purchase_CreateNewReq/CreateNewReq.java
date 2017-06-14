package Purchase_CreateNewReq;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class CreateNewReq extends RW{
	
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { 
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Reshma") 
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	
	public void createnewreqM(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		
		driver.get("http://192.168.1.202/STG_OSG/purchase/InvertyItems.aspx");
		Thread.sleep(5000);
	/*	// path for "purchase"
		WebElement purchase = driver.findElement(By.linkText("Purchase")); 
		Actions action = new Actions(driver);
		action.moveToElement(purchase).build().perform();
		action.moveToElement(purchase).perform();	
		Thread.sleep(2000);
	
		// path for create New Req.
		WebElement createnewreq  = driver.findElement(By.linkText("Create New Reqsn")); 
		createnewreq.click();    	
		Thread.sleep(3000);*/

		// select "Fleet" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLFleet']", "US FLEET 1");
		Thread.sleep(1000);

		// select "Vessel" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLVessel']", "Demo OSG Test 1");
		Thread.sleep(1000);
		
		//department type Radio Button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_optList_1']");
		Thread.sleep(3000);

		// select "Department" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbDept']", "DECK STORES-CONSUMABLES");
		Thread.sleep(1000);

		// select "Catalogue" dropdown
		dropdown(driver, "id", "ctl00_MainContent_rgdCatalog", "FORMS 2");
		Thread.sleep(1000);

		/*// select "Requisition" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbRequisitionList']", "06/06/2017 / Admin / Normal");
		Thread.sleep(1000);
*/
		// select "Urgency " dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbdivReqPrio']", "Urgent");
		Thread.sleep(1000);

		// select "Reqsn Type" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlReqsnType']", "4-Monthly");
		Thread.sleep(1000);

		// Click on "view Requisition"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRequisition']");
		Thread.sleep(3000);

		// Window handling Function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(4000);
		
		//clear Textbox
		clear_element(driver, "xpath", ".//*[@id='txtgrdItemReqstdQty']");
		Thread.sleep(3000);
		
		// Change Reqst Qty
		sendkeys(driver, "xpath", ".//*[@id='txtgrdItemReqstdQty']", "1");
		Thread.sleep(3000);
		

		// Change Reqst Qty
		sendkeys(driver, "xpath", ".//*[@id='txtgrdItemReqstdQty']", "1");
		Thread.sleep(3000);
		

		// Change Reqst Qty
		sendkeys(driver, "xpath", ".//*[@id='txtgrdItemReqstdQty']", "1");
		Thread.sleep(3000);
		
		
		// Click on Sub-Catalogues--All
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdSubCatalog_ctl00__0']/td");
		Thread.sleep(3000);

		// Click on Sub-Catalogues--General
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdSubCatalog_ctl00__1']/td");
		Thread.sleep(3000);

		// Click on Add Item
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnAdd']");
		Thread.sleep(3000);

		// Part No.
		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_DivItembtnSave']");
		Thread.sleep(3000);

		// Alert of "partNo."
		Alert partNo = driver.switchTo().alert();
		// To read the text from alert
		String Alert2 = partNo.getText();
		System.out.println(" alert :" + Alert2);
		Thread.sleep(2000);
		partNo.accept();
		Thread.sleep(2000);

		// search by "Part No."
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtPartnumber']", "1");
		Thread.sleep(3000);

		// search by "Item"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtShortDescription']", "Test");
		Thread.sleep(3000);

		// select "Unit" dropdown
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_cmbUnitnPackage']", "BATCH");
		Thread.sleep(1000);

		// click on "save button"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_DivItembtnSave']");
		Thread.sleep(3000);

		// Click on Preview and finalize button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnPreview']");
		Thread.sleep(3000);
		
		// Reason for req.
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtReqComment']", "Test");
		Thread.sleep(3000);
		
		//click on "Answer"
		sendkeys(driver, "xpath", ".//*[@id='txtDescriptive']", "Test");
		Thread.sleep(3000);	
		
		//delivery port
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_DDLPort']", "CHARLESTON");
		Thread.sleep(1000);
		
		//delivery date
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtfrom']", "24/06/2017");
		Thread.sleep(3000);
		
		//click on "save and finalized"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnFinalize']");
		Thread.sleep(3000);

		// Alert of "Save."
		Alert Save1 = driver.switchTo().alert();
		// To read the text from alert
		String Alert4 = Save1.getText();
		System.out.println(" alert :" + Alert4);
		Thread.sleep(2000);
		Save1.accept();
		Thread.sleep(2000);

		

	}

}
