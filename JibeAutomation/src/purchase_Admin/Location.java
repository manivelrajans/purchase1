package purchase_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class Location extends RW{

	 
	 
	/*Technical
	PMS
	CopyRunHour*/
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void TestingLabList(WebDriver driver1) throws InterruptedException {  //(priority=0)

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

		WebElement Location  = driver.findElement(By.linkText(data.getData(5,33,2))); // path for Location 
		Location.click();    	
		Thread.sleep(2000);
		
	}
	public void AddNewLocation(WebDriver driver1) throws Exception  {  //(priority=1)

		WebDriver driver = driver1;
		
		click_element(driver, "id",(data.getData(5,34,2))); //Click on AddNewLocation
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,35,2)), (data.getData(5,36,2))); //Sendkeys for Short Code-->
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,37,2))); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for  enter Short Description.
		 Alert alert = driver.switchTo().alert();            //Alert handling for  enter Short Description.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(1000);
		
	     
	     sendkeys(driver,"id", (data.getData(5,38,2)), (data.getData(5,39,2))); //Sendkeys for Short Description
	     Thread.sleep(1000);
	     
	     sendkeys(driver,"id", (data.getData(5,40,2)), (data.getData(5,41,2))); //Sendkeys for Long Description
	     Thread.sleep(1000);
	     
	     sendkeys(driver,"id", (data.getData(5,42,2)), (data.getData(5,43,2))); //Sendkeys for No. Of Location
	     Thread.sleep(1000);
	     
	     dropdown(driver, "id", (data.getData(5,44,2)),(data.getData(5,45,2)));// Dropdown -->Vessel Type -->Test
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,46,2))); //Click on Save
		 Thread.sleep(8000);
		
	}
	
	public void EditLocation(WebDriver driver1) throws Exception  {  //(priority=2)

		WebDriver driver = driver1;
		 click_element(driver, "id",(data.getData(5,47,2))); //Click on Refresh
		 Thread.sleep(1000);
		 
		 clear_element(driver, "id",(data.getData(5,48,2)));// Clear Short Code / Desc
		 Thread.sleep(1000);
		 
		 sendkeys(driver,"id", (data.getData(5,49,2)), (data.getData(5,50,2))); //Sendkeys for Short Code / Desc->
		 Thread.sleep(1000);
			
		 click_element(driver, "id",(data.getData(5,51,2))); //Click on Search
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,52,2))); //Click on Edit
		 Thread.sleep(2000);
		 
		 clear_element(driver, "id", (data.getData(5,53,2)));// Clear Short Description 
		 Thread.sleep(1000);
		 
		 sendkeys(driver,"id", (data.getData(5,54,2)), (data.getData(5,55,2))); //Sendkeys for Short Description 
		 Thread.sleep(1000);
		 
		 click_element(driver, "id",(data.getData(5,56,2))); //Click on Save
		 Thread.sleep(2000);
	}
	
		 public void DeleteLocation(WebDriver driver1) throws Exception  {  //(priority=3)

				WebDriver driver = driver1;
		 
		 click_element(driver, "id",(data.getData(5,57,2))); //Click on Delete
		 Thread.sleep(2000);
		 
		//Alert handling for  Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for  Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
			
	     click_element(driver, "id",(data.getData(5,58,2))); //Click on Refresh
		 Thread.sleep(2000);
		 
		/* click_element(driver, "id",(data.getData(5,59,2))); //Click on Export to Excel
		 Thread.sleep(2000);
			*/
		
	}	
}
