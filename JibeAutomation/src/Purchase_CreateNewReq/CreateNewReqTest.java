package Purchase_CreateNewReq;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import common_Function.WebDriverPass;

public class CreateNewReqTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	CreateNewReq w = new CreateNewReq();
	
	  @Test(priority=1)
	  public void createnewreqM() throws Exception {
		  test=report.startTest("CreateNewReqsn"); 
		  
		  w.createnewreqM(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->CreateNewReqsn"); 
		    
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
	  	  report = CreateNewReq.getReporter("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html");
	  }

	  @AfterSuite
	  public void afterSu() {
	      report.close();
	  }


	  }
