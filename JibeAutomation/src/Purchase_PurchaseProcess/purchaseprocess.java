package Purchase_PurchaseProcess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class purchaseprocess extends RW{
	
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

	// -----------------------------------------------------------"mouse hover on purchase process"-------------------------------//
	

	public void purchase(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// Select "Purchase" module
		WebElement adminm = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(adminm).build().perform();
		action.moveToElement(adminm).perform();
		Thread.sleep(2000);

		// Select "Purchase process"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[5]/ul/li[2]/a/span")));
		admin.click();
		//action.moveToElement(admin).build().perform();
		Thread.sleep(2000);

		// validation for expected page is open or not
		String actualTitle = driver.getTitle();
		System.out.println("Title :" +actualTitle);
		Thread.sleep(2000);
	}
	// -----------------------------------------------------------"Search functionality"-------------------------------------//
	

	public void search(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		// select "fleet" DropDown Checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_chkSelectAll']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// select "Vessel " DropDown Checkbox

		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_chkSelectAll']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// click on search button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		Thread.sleep(3000);
		
	    //Switching to iFrame
		WebElement iframe=driver.findElement(By.id("ctl00_MainContent_mainFrame"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		//Click on "Requisition"
		click_element(driver, "xpath", ".//*[@id='rgdNewREQ_ctl00__4']/td[3]/a");
		Thread.sleep(3000);

	/*	// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
*/
		
		
		
		// window switching function

		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		
		//send RFQ
		
		
		//Click on "Cancel Reqsn"
 		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnCancel']");
 		Thread.sleep(3000);
 		
		// Enter "Supplier Name"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_ucPurcCancelReqsnNew_txtRemark']", "AutomationTester");
		Thread.sleep(2000);
		
		/*//Verifying sendkeys
		String SupplierName=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ucPurcCancelReqsnNew_txtRemark']")).getAttribute("value");
		System.out.println("Supplier Name :" +SupplierName);
		Thread.sleep(2000);*/
 				
 		//click on "cancel" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_ucPurcCancelReqsnNew_btnCancel']");
 		Thread.sleep(3000);
 		
 		//Click on "Hold"
 		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnHold']");
 		Thread.sleep(3000);
 		
		// Enter "Remarks"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_HoldUnHold_txtRemarks']", "AutoTest");
		Thread.sleep(2000);
 				
		//Verifying sendkeys
		String Remarks=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_HoldUnHold_txtRemarks']")).getAttribute("value");
		System.out.println("Remarks1 :" +Remarks);
		Thread.sleep(2000);
				
 		//click on "cancel" button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_HoldUnHold_btndivCancel']");
 		Thread.sleep(3000);
 		
 		//Click on "All Remark"
 		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lbtnAllremarks']");
 		Thread.sleep(3000);
 		
		// Enter "Remarks"
		sendkeys(driver, "xpath", ".//*[@id='newasynctxtRemark']", "AutomationTest");
		Thread.sleep(2000);

		// click on "cancel" button
		click_element(driver, "xpath", ".//*[@id='__divAddReqsnRemark']/div[2]/div[3]/button[2]");
		Thread.sleep(3000);
 		
 		//Click on "Reqsn Type"
		dropdown(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlReqsnType']", "4-Monthly");
		Thread.sleep(3000);
 		
 		//Sendkeys For "Reason for changing reqsn type"
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtTypeRemark']", "Test");
		Thread.sleep(2000);
 		
		//Verifying sendkeys
		String reqsntype=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_txtTypeRemark']")).getAttribute("value");
		System.out.println("Reason for changing reqsn type :" +reqsntype);
		Thread.sleep(2000);
		
		//Click on "save"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnReqsnTypeSave']");
		Thread.sleep(3000);
 		
 		// Click on "View Reqsn Type Change Log"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnViewlogType0']");
		Thread.sleep(3000);
 		
		// Click on "View Reqsn Type Change Log-->Exit"
		click_element(driver, "xpath", ".//*[@id='closePopupbutton']");
		Thread.sleep(3000);
		
		//Click on "Click to view vessel"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnMakerDetails']");
		Thread.sleep(3000);
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(6000);
				
	/*	//Click on "Add Attachment"
		click_element(driver, "name", "ctl00$MainContent$ctl03");
		Thread.sleep(3000);
			
		// Select file button
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_AjaxFileUpload1_Html5InputFile']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");	
		Thread.sleep(3000);
		
		//click on "Upload"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_AjaxFileUpload1_UploadOrCancelButton']");
		Thread.sleep(3000);
		
		// click on "Exit button"
		click_element(driver, "xpath", ".//*[@id='closePopupbutton']");
		Thread.sleep(3000);*/
	}
		// -----------------------------------------------------------"vessel"-------------------------------------//
		

		public void Vessel(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		

			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window
			// click "vessel"
			click_element(driver, "xpath", ".//*[@id='rgdNewREQ_ctl00__0']/td[1]/a");
			Thread.sleep(4000);
					

			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}

			// Close the new window, if that window no more required
			driver.close();

			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);
		}
		
   // -----------------------------------------------------------"vessel"-------------------------------------//
		

				public void RFQ(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;

		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);

	/*	// Switching to iFrame
		WebElement iframe = driver.findElement(By.id("ctl00_MainContent_mainFrame"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
*/
		// click on RFQ / Quotation
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_lnkMenu2']");
		Thread.sleep(4000);
		
		//Click on "Clear Filter"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnClear']");
		Thread.sleep(4000);
		
		// select "fleet" DropDown Checkbox
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_chkSelectAll']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLFleet_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// select "Vessel " DropDown Checkbox

		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_chkSelectAll']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_DDLVessel_btnApplyFilter']")).click();
		Thread.sleep(3000);

		// select "Department " DropDown Checkbox

		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_cmbDept_imgCollapseExpandDDL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_cmbDept_CheckBoxListItems_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_cmbDept_btnApplyFilter']")).click();
		Thread.sleep(3000);
				
		// click on search button
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRefresh']");
		Thread.sleep(3000);
				
		//************************************** "Remarks"*********************************************************************//
		// switch to "Frame"
		WebElement iframe1 = driver.findElement(By.id("ctl00_MainContent_mainFrame"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(3000);
		
		//Click on "Remarks"
		click_element(driver, "xpath", ".//*[@id='imgbtnPurchaserRemark']");
		Thread.sleep(4000);
		
		//sendkeys Of remarks
		sendkeys(driver, "xpath", ".//*[@id='newasynctxtRemark']", "Test");
		Thread.sleep(3000);
		
		//verifying sendkeys
		String remarks=driver.findElement(By.xpath(".//*[@id='newasynctxtRemark']")).getAttribute("value");
		System.out.println("Remarks entered is :"+remarks);
		Thread.sleep(2000);
		
		//click on "save button"
		click_element(driver, "xpath", ".//*[@id='__divAddReqsnRemark']/div[2]/div[3]/button[1]");
		Thread.sleep(4000);
		
		//alert capturing for remarks
		Alert remarks1 = driver.switchTo().alert();
		// To read the text from alert
		String Alertpub = remarks1.getText();
		System.out.println(" alert :" + Alertpub);
		Thread.sleep(2000);
		remarks1.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		//***************************************** "Put On Hold" ******************************************************************//
		//click on "Put on hold"
		click_element(driver, "xpath", ".//*[@id='rgdNewREQ_ctl00_ctl04_btnOnHold']");
		Thread.sleep(4000);
		
		//Sendkeys for "Put on hold"
		sendkeys(driver, "xpath", ".//*[@id='HoldUnHold_txtRemarks']", "AutomationTest");
		Thread.sleep(2000);
		
		//verifying put on hold
		String putonhold=driver.findElement(By.xpath(".//*[@id='HoldUnHold_txtRemarks']")).getAttribute("value");
		System.out.println("Remarks entered is :"+putonhold);
		Thread.sleep(2000);
		
		// Alert of "Onhold"
		Alert Onhold = driver.switchTo().alert();
		// To read the text from alert
		String Alert = Onhold.getText();
		System.out.println(" alert :" + Alert);
		Thread.sleep(2000);
		Onhold.accept();
		Thread.sleep(2000);
				
		
		//click on "save" Button
		click_element(driver, "xpath", ".//*[@id='HoldUnHold_btndivSave']");
		Thread.sleep(4000);
		
		//********************************************* "Attachment" **********************************************************//
		
		
		// Click on "Attachment"
		click_element(driver, "xpath", ".//*[@id='rgdNewREQ_ctl00_ctl04_ImgAttachment']");
		Thread.sleep(4000);
				
		// Switch To iframe
		WebElement iframe11 = driver.findElement(By.id("ReqsnAttachment_ID"));
		driver.switchTo().frame(iframe11);
		Thread.sleep(2000);
				
		// Select file button
		driver.findElement(By.xpath(".//*[@id='AjaxFileUpload1_Html5InputFile']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Thread.sleep(3000);

		// click on "Upload"
		click_element(driver, "xpath", ".//*[@id='AjaxFileUpload1_UploadOrCancelButton']");
		Thread.sleep(3000);

		//Click on delete button
		click_element(driver, "xpath", ".//*[@id='gvReqsnAttachment_ctl02_imgbtnDelete']");
		Thread.sleep(3000);
		
		// Alert of "delete"
		Alert delete = driver.switchTo().alert();
		// To read the text from alert
		String Alertpub1 = delete.getText();
		System.out.println(" alert :" + Alertpub1);
		Thread.sleep(2000);
		delete.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
				
		//back to window
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
 //*********************************************** "Click on RFQ"*************************************************************//
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
					
		// Click on RFQ button
		click_element(driver, "xpath", ".//*[@id='rgdPending_ctl00_ctl04_ImgSelect']");
		Thread.sleep(3000);
		
		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		
		//****************************************Search Functionality of RFQ*****************************************//
		
		
		//Enter Supplier name
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtSupname']", "10 KNOT TRANSPORTATION LLC");
		Thread.sleep(3000);
		
		// Enter City
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtCity']", "TAMPA");
		Thread.sleep(3000);
		
		// Enter Country
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_ddlCountry']", "UNITED STATES OF AMERICA");
		Thread.sleep(3000);
		
		//Click on Search
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnimg']");
		Thread.sleep(3000);
		
		//Click on Delivery Remarks---For all
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_grvSupplier_ctl00_ctl02_ctl00_lbtnDLVINS']");
		Thread.sleep(3000);
		
		//Select Delivery port
		dropdown(driver, "id", "ctl00_MainContent_DDLPortAll","CHARLESTON");
		Thread.sleep(3000);

		//Delivery Instructions: 
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_txtdelivery']", "Test");
		Thread.sleep(3000);
		
		//Click on "OK"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnDELSave']");
		Thread.sleep(3000);
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
				}
				
	public void QuotationApproval(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
		
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
				
	    //Click on "Evalute" Button	
		click_element(driver, "xpath", ".//*[@id='rgdEval_ctl00_ctl04_ImgSelect']");
		Thread.sleep(3000);	
		
		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		
		//Click on Compare Quotation
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnRetrieve']");
		Thread.sleep(3000);
		
		//Save Qtn Evalution
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSaveEvaln']");
		Thread.sleep(3000);
		
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		
		//click on Roll back
		click_element(driver, "xpath", ".//*[@id='rgdEval_ctl00_ctl04_BtnCancelReqStage']");
		Thread.sleep(3000);
		
		//Enter Reason
		sendkeys(driver, "xpath", ".//*[@id='ucPurc_Rollback_Reqsn1_txtReason']", "Test");
		Thread.sleep(3000);
		
		//click on "OK"
		click_element(driver, "xpath", ".//*[@id='ucPurc_Rollback_Reqsn1_btndivReqprioOK']");
		Thread.sleep(3000);
	}
		
	public void PendingDeliveryUpdate(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		
		//Click on "update Delivery"
		click_element(driver, "xpath", ".//*[@id='rgdDeliveryStatus_ctl00_ctl04_ImgUpdateDelivery']");
		Thread.sleep(3000);
		
		//Requisition/order/supplier Dropdown
		dropdown(driver, "id", "ctl00_MainContent_cmbRequisitionList","ANAC-44-170004-O/ANAC-PO-44-170001/WW GRAINGER INC");
		Thread.sleep(3000);
		
         //clear Delivered Qty
		clear_element(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdDeliveredItems_ctl00_ctl10_txtDeliverdQty']");
		Thread.sleep(2000);
		
		// sendkeys Delivered Qty
		sendkeys(driver, "xpath", ".//*[@id='ctl00_MainContent_rgdDeliveredItems_ctl00_ctl10_txtDeliverdQty']", "1");
		Thread.sleep(3000);
				
		//click on "Save"
		click_element(driver, "xpath", ".//*[@id='ctl00_MainContent_btnSave']");
		Thread.sleep(3000);
		
		// Alert of "save"
		Alert save = driver.switchTo().alert();
		// To read the text from alert
		String Alertpub1 = save.getText();
		System.out.println(" alert :" + Alertpub1);
		Thread.sleep(2000);
		save.accept();
		Thread.sleep(2000);

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		//***********************************************//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Click on "Qtns" Button
		click_element(driver, "xpath", ".//*[@id='rgdDeliveryStatus_ctl00__0']/td[12]/table/tbody/tr/td[3]/a/img");
		Thread.sleep(3000);

		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		
		//Click on "View Evalution"
		click_element(driver, "xpath", ".//*[@id='rgdDeliveryStatus_ctl00__0']/td[12]/table/tbody/tr/td[2]/a/img");
		Thread.sleep(3000);
		

		// Window Switching Functionality
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		
		//click on "Description"
		click_element(driver, "xpath", ".//*[@id='grdQuoteSupp']/tbody/tr[2]/td[4]/div/a");
		Thread.sleep(3000);
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


