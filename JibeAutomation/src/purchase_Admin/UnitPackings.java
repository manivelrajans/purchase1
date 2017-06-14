package purchase_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class UnitPackings  extends RW{

	 
	 
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

	public void UnitPacking(WebDriver driver1) throws InterruptedException {  //(priority=0)

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

		WebElement UnitPackings  = driver.findElement(By.linkText(data.getData(5,86,2))); // path for UnitPackings
		UnitPackings.click();    	
		Thread.sleep(3000);
		
	}

	public void AddUnitPacking(WebDriver driver1) throws Exception {  //(priority=0)

		WebDriver driver = driver1;
		

		click_element(driver, "id",(data.getData(5,87,2))); //Click on Add New Unit Packing
		Thread.sleep(2000);		
		
		click_element(driver, "id",(data.getData(5,88,2))); //Click on Save
		Thread.sleep(1000);
		
		
		//Alert handling for Please enter main pack
		 Alert alert = driver.switchTo().alert();            //Alert handling for Please enter main pack
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
		sendkeys(driver,"id", (data.getData(5,89,2)), (data.getData(5,90,2))); //Sendkeys for Main Pack
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,91,2))); //Click on Save
		Thread.sleep(1000);
		
		//Alert handling for enter Abbreviation.
		 Alert alert1 = driver.switchTo().alert();            //Alert handling forenter Abbreviation.
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
		sendkeys(driver,"id", (data.getData(5,92,2)), (data.getData(5,93,2))); //Sendkeys for Abbreviation  
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,94,2))); //Click on Save
		Thread.sleep(1000);
		
}
	public void EditUnitPacking(WebDriver driver1) throws Exception {  //(priority=0)

		WebDriver driver = driver1;
		
	
		clear_element(driver, "id", (data.getData(5,95,2)));// Clear Main Pack / Abbreviation
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(5,96,2)), (data.getData(5,97,2))); //Sendkeys for Pack / Abbreviation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,98,2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,99,2))); //Click on Edit
		Thread.sleep(3000);
		
		clear_element(driver, "id", (data.getData(5,100,2)));// Clear Abbreviation  
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,101,2)), (data.getData(5,102,2))); //Sendkeys for Abbreviation  
		Thread.sleep(1000);
	
		click_element(driver, "id",(data.getData(5,103,2))); //Click on Save
		Thread.sleep(1000);
		
	}	
	
	public void DeletetUnitPacking(WebDriver driver1) throws Exception {  //(priority=14)

		WebDriver driver = driver1;
		
		clear_element(driver, "id",(data.getData(5,104,2)));// Clear Main Pack / Abbreviation
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,105,2)), (data.getData(5,106,2))); //Sendkeys for Pack / Abbreviation
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,107,2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,108,2))); //Click on Delete
		Thread.sleep(3000);
		

		//Alert handling for Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
	     click_element(driver, "id",(data.getData(5,109,2))); //Click on Export to Excel
		 Thread.sleep(3000);
	}		
}