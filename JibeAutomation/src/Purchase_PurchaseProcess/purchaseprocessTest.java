package Purchase_PurchaseProcess;

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


public class purchaseprocessTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	purchaseprocess p=new purchaseprocess();

	@Test(priority = 1)
	public void purchase() throws Exception {
		test = report.startTest("purchase ");
		p.purchase(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process");
	}
	
	@Test(priority = 3)
	public void RFQ() throws Exception {
		test = report.startTest("search ");
		p.RFQ(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process-->actions");
	}
	
	@Test(priority = 2)
	public void search() throws Exception {
		test = report.startTest("search ");
		p.search(driver);
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "purchase-->purchase process-->Search");
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
	  report = purchaseprocess.getReporter("C:\\Users\\Reshma\\workspace\\JibeAutomation\\Report.html");
  }
  
  @AfterSuite
public void afterSu() {
      report.close();
  }
}


