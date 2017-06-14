package quality_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import quality_Admin.FormTypeLibrary;





public class FormTypeLibraryTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	FormTypeLibrary w = new FormTypeLibrary();
	

   @Test(priority=0)
  public void FormTypeLibrary() throws InterruptedException {
	   test=report.startTest("FormTypeLibrary");	  
	   w.FormTypeLibrarys(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Form Type Library"); 
  }
   @Test(priority=1)
   public void FromType() throws Exception {
	   test=report.startTest("FromType");	  
	   w.FromType(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "From Type"); 
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
	   report = FormTypeLibrary.getReporter("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html");			  }
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}

