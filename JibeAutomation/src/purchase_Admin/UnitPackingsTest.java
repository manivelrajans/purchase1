package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import purchase_Admin.UnitPackings;
import quality_Admin.FormTypeLibrary;

public class UnitPackingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	UnitPackings w = new UnitPackings();
	

   @Test(priority=14)
   public void UnitPacking() throws InterruptedException {
	   test=report.startTest("UnitPacking");	  
	   w.UnitPacking(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "UnitPacking"); 
  }
   
   @Test(priority=15)
   public void AddUnitPacking() throws Exception {
 	   test=report.startTest("AddUnitPacking");	  
 	   w.AddUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "AddUnitPacking"); 
   }
   
   
   @Test(priority=16)
   public void EditUnitPacking() throws Exception {
 	   test=report.startTest("EditUnitPacking");	  
 	   w.EditUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "EditUnitPacking"); 
   }
   
   @Test(priority=17)
   public void DeletetUnitPacking() throws Exception {
 	   test=report.startTest("DeletetUnitPacking");	  
 	   w.DeletetUnitPacking(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "DeletetUnitPacking"); 
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
