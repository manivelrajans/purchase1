package technical_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class InspectionType extends RW{
	
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
	
	public void InspectionTypes(WebDriver driver1) throws InterruptedException {//(priority=0)

		WebDriver driver = driver1;
	
	
		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1193, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
	
		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1194, 2)));// path for Admin
		Thread.sleep(2000);
		Admin.click();
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		 
	     WebElement InspectionTypeList = driver.findElement(By.linkText(data.getData(4, 1195, 2)));//path for "Inspection Type"
	     InspectionTypeList.click();
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	}  
	     
	public void AddInspection(WebDriver driver1) throws Exception { //(priority=1)

		WebDriver driver = driver1;    
	     
		click_element(driver, "id",(data.getData(4, 1196, 2))); //Clicking on Add button
		Thread.sleep(2000);
	
		 click_element(driver, "id",(data.getData(4, 1199, 2)));                    //Clicking on Save button
	     Thread.sleep(2000);
	     
	     Alert alert = driver.switchTo().alert();                                         //Alert handling for Please enter Inspection  Type.
	     String Alert = alert.getText();
	     System.out.print("Alert msg for Inspection name blank is:"+Alert);
	     alert.accept();
	     Thread.sleep(2000);
	     
	     sendkeys(driver,"id", (data.getData(4, 1197, 2)),(data.getData(4, 1198, 2))); //Sendkeys for Type Inspection"Inspection"
		 Thread.sleep(1000);
	     
		 dropdown(driver, "id", "ctl00_MainContent_ddlColor","Green");// Dropdown -->Color->Green
		 Thread.sleep(1000);
		
	     driver.findElement(By.id(data.getData(4, 1199, 2))).click();                    //Clicking on Save button
	     Thread.sleep(4000);
	     
	     //----------------------Add same ainspection----------------//
	     
	 	click_element(driver, "id",(data.getData(4, 1196, 2))); //Clicking on Add button
		Thread.sleep(2000);
		

	     sendkeys(driver,"id", (data.getData(4, 1197, 2)),(data.getData(4, 1198, 2))); //Sendkeys for Type Inspection"Inspection"
		 Thread.sleep(1000);
	     
		 dropdown(driver, "id",(data.getData(4, 1226, 2)), (data.getData(4, 1227, 2)));// Dropdown -->Color-->Green
		 Thread.sleep(1000);
		
	     driver.findElement(By.id(data.getData(4, 1199, 2))).click();                    //Clicking on Save button
	     Thread.sleep(4000);
	     
	     Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Inspection Type Already Exist
	     String Alert1 = alert1.getText();
	     System.out.println("Alert msg for Inspection name blank is:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
	     
	    
	}
	
	//----------------------Search And Edit added Inspection------------------------------//
	public void EditInspection(WebDriver driver1) throws Exception { //(priority=2)

		WebDriver driver = driver1;    
	      
	 
	     click_element(driver, "id",(data.getData(4, 1206, 2))); //Click on Refresh
		 Thread.sleep(2000);  
		
	     /*clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			*/
		 sendkeys(driver,"id", (data.getData(4, 1215, 2)), (data.getData(4,1198,2))); //Sendkeys for Inspection Type
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(4, 1204, 2))); //Click on Edit
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id", (data.getData(4, 1205, 2)));// Clear  Inspection name 
		 Thread.sleep(1000);
		    
		 sendkeys(driver,"id", (data.getData(4, 1205, 2)), (data.getData(4,1207, 2))); //Sendkeys for Inspection Type
		 Thread.sleep(1000);
		  

	     driver.findElement(By.id(data.getData(4, 1199, 2))).click();                    //Clicking on Save button
	     Thread.sleep(4000);
	    
		
	     //---------------------------------Search Edited name----------------------------------------//
	     
	     click_element(driver, "id",(data.getData(4, 1206, 2)));                    //Click on Refresh
	     Thread.sleep(2000);
	   
	     clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			
		 sendkeys(driver,"id", (data.getData(4, 1215, 2)), (data.getData(4,1207, 2))); //Sendkeys for Inspection Type
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
		 Thread.sleep(1000);
	}     
		//---------------------Delete added Inspection------------------------------//
			public void DeleteInspection(WebDriver driver1) throws Exception { //(priority=3)

				WebDriver driver = driver1;    
			      
		 click_element(driver, "id",(data.getData(4, 1219, 2)));                    //Click on Delete
	     Thread.sleep(2000);
	     
	   //Alert handling for Delete
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     Thread.sleep(2000);
	     
	   //---------------------Verify Delete Inspection------------------------------//

	     click_element(driver, "id",(data.getData(4, 1206, 2)));                    //Click on Refresh
	     Thread.sleep(2000);
	   
	     clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			
		 sendkeys(driver,"id", (data.getData(4, 1215, 2)), (data.getData(4,1207, 2))); //Sendkeys for Inspection Type
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
		 Thread.sleep(1000);
		 
		 String Record = driver.findElement(By.xpath(data.getData(4, 1228, 2))).getText(); // Record
	     Thread.sleep(1000);	
	     
	     System.out.println(""+ Record);
	     Thread.sleep(1000);
	     
			}     
}
	



