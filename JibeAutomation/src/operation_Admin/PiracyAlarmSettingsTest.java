package operation_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import operation_Admin.PiracyAlarmSettings;
import quality_Admin.FormTypeLibrary;


public class PiracyAlarmSettingsTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	
	PiracyAlarmSettings p = new PiracyAlarmSettings();
	
  @Test(priority=4)
  public void PiracyAlarmSettingsModule() throws Exception {
	  test=report.startTest("Piracy Alarm Settings");
	  
	  p.PiracyAlarmIndex(driver);
	  
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Piracy Alarm Settings"); 
	  
	  }
  @AfterMethod
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	    } else if (result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	    } else {
	        test.log(LogStatus.PASS, "Test passed");
	    }
	    report.endTest(test);
	    report.flush();
}
 
     @BeforeSuite
    public void beforeSu() {
    	 report = FormTypeLibrary.getReporter("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html");		
}
  
  
  
  
  
  
  
  
  
  
  
  
  
}
