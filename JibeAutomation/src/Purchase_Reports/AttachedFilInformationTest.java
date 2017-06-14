package Purchase_Reports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;



public class AttachedFilInformationTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	AttachedFileInformation p=new AttachedFileInformation();
	
	@Test(priority=1)
	  public void VettingQuestionnairem() throws Exception {
		  test=report.startTest("Reports module ");
		  p.purchase(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "technical-->Reports-->Attached File Information"); 
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
	  report = AttachedFileInformation.getReporter("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html");	  }
  


  }