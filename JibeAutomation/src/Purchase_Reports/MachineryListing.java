package Purchase_Reports;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class MachineryListing extends RW{

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

	//open Purchase-->MachineryListing using URL
	

	public String MachineryListingm(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
		
	driver.get("http://192.168.1.102/JIBE/Technical/PMS/MachineryInformation.aspx");
	Thread.sleep(2000);
	
	//String ExpectedTitle="	Machinery Information"
	
	String actualTitle = driver.getTitle().trim();
	String expectedTitle = "Machinery Information".trim();
	assertEquals(expectedTitle,actualTitle);
	
	 if(actualTitle.equals(actualTitle)){
   	  System.out.println("Title Match");
   	
   }
       else {
       	System.out.println("Title does not match");
       }
	return (expectedTitle);
	  
}
	
	
	
	
	
	
	
	
	
	}	

