package technical_Admin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class AlarmUnitLibrary extends RW{
	 

	/*Technical
	Admin
	Alarm Unit*/
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
	
	public void AlarmUnits(WebDriver driver1) throws Exception { //(priority=0)
	
		WebDriver driver = driver1;
	
		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1269, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1270, 2)));// path for Admin																					
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		WebElement AlarmUnit = driver.findElement(By.linkText(data.getData(4, 1271, 2))); // path for Alarm Unit Library
		AlarmUnit.click();	
		Thread.sleep(3000);
		
	}
	
	public void PMSAlarmUnit(WebDriver driver1) throws Exception { //(priority=1)

		WebDriver driver = driver1;
		
	
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		
		String TotalRecords = driver.findElement(By.id(data.getData(4, 1273, 2))).getText();     //Total  TotalRecords&page
		
		System.out.println("In PMS Alarm Unit Total Records & pages  are " + TotalRecords);
		
	}	
		public void AddNewUnit(WebDriver driver1) throws Exception {            //(priority=2)

			WebDriver driver = driver1;
			
			
		click_element( driver, "id",(data.getData(4, 1274, 2)));  //Path for Add New unit
		Thread.sleep(1000);
		
		click_element( driver, "id",(data.getData(4, 1277, 2)));  //Path for Save
		Thread.sleep(2000);
		

		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please enter a unit name
	     String Alert1 = alert1.getText();
	     System.out.println("Alert msg:"+Alert1);
	     alert1.accept();		
	     Thread.sleep(2000);
		
		
		sendkeys( driver,"id",(data.getData(4, 1275, 2)), (data.getData(4, 1276, 2)));  //Path for Add New unit
		Thread.sleep(2000);
			
		click_element( driver, "id",(data.getData(4, 1277, 2)));  //Path for Save
		Thread.sleep(2000);
		
		//-----------------Search Added new unit---------------//
		
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		//---------------- Adding Same Unit---------------//
		
		click_element( driver, "id",(data.getData(4, 1278, 2)));  //Path for Add New unit
		Thread.sleep(2000);
			

		sendkeys( driver,"id",(data.getData(4, 1275, 2)), (data.getData(4, 1276, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1281, 2)));  //Path for Save
		Thread.sleep(2000);
		
		}
		
		public void EditUnit(WebDriver driver1) throws Exception {           //(priority=3)

			WebDriver driver = driver1;
			
			
			//--------------------------Edit Added unit-------------------------//
			

		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(1000);
						
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit 
		Thread.sleep(1000);
		
		
		sendkeys( driver,"id",(data.getData(4, 1286, 2)), (data.getData(4, 1276, 2)));  //Senkye for  Unit
		Thread.sleep(1000);
		
		
		click_element( driver, "id",(data.getData(4, 1289, 2)));  //Path for Search Button
		Thread.sleep(1000);
		
						
		click_element( driver, "id",(data.getData(4, 1290, 2)));  //Path for Edit
		Thread.sleep(1000);
		
		
		clear_element(driver, "xpath", (data.getData(4, 1291, 2))); // Clear unit name
		Thread.sleep(1000);
		
		sendkeys( driver,"id",(data.getData(4, 1292, 2)), (data.getData(4, 1293, 2)));  //Path for Edit Unit
		Thread.sleep(1000);		
		
		click_element( driver, "id",(data.getData(4, 1294, 2)));  //Path for Save
		Thread.sleep(2000);
		
		
		//----------------Searching Edit unit----------//
		
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(1000);
						
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit 
		Thread.sleep(1000);
		
		
		sendkeys( driver,"id",(data.getData(4, 1286, 2)), (data.getData(4, 1293, 2)));  //Senkye for  Unit
		Thread.sleep(1000);
		
		
		click_element( driver, "id",(data.getData(4, 1289, 2)));  //Path for Search Button
		Thread.sleep(1000);
		}
		
		public void DeleteUnit(WebDriver driver1) throws Exception {      //(priority=4)

			WebDriver driver = driver1;
			

		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(1000);
						
		clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
		Thread.sleep(1000);
	
		sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1293, 2)));  //Path for Edit Unit
		Thread.sleep(1000);	
			
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(1000);
		
		click_element( driver, "id",(data.getData(4, 1299, 2)));  //Path for Delete
		Thread.sleep(1000);
		
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete unit
	     String Alert = alert.getText();
	     System.out.println("Alert msg for DeleteUnit:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
	     //---------------Delete Sec added name-----------//
	     
	     click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(1000);
							
		clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
		Thread.sleep(1000);
		
		sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1276, 2)));  //Path for Edit Unit
		Thread.sleep(1000);	
				
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(1000);
			
		click_element( driver, "id",(data.getData(4, 1299, 2)));  //Path for Delete
		Thread.sleep(1000);
			
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete unit
		 String Alert1 = alert1.getText();
		 System.out.println("Alert msg for DeleteUnit:"+Alert1);
		 alert1.accept();
		 Thread.sleep(2000);
	     
	 	//-------------------------Search Delete---------------//
	     
	     click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		 Thread.sleep(1000);
	     
		clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
		Thread.sleep(2000);
		
		sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1293, 2)));  //Path for Edit Unit
		Thread.sleep(2000);	
				
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(2000);
		
		
		String Record = driver.findElement(By.xpath(data.getData(4, 1302, 2))).getText(); // Record
	    Thread.sleep(1000);	
	    
	    System.out.println(""+ Record);
	    Thread.sleep(1000);	
		
	    click_element( driver, "id",(data.getData(4, 1304, 2)));  //Path for Export to excel
		 Thread.sleep(1000);
			
		}
}
