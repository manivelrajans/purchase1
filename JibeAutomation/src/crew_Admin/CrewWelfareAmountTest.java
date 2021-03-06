package crew_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import crew_Admin.CrewWelfareAmount;
import quality_Admin.FormTypeLibrary;


public class CrewWelfareAmountTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	CrewWelfareAmount r=new CrewWelfareAmount();
	
	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("CrewWelfareAmountTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Crew Welfare Amount"); 
		   }
	@Test(priority=2)
	  public void addWelfareDetails() throws Exception {
		  test=report.startTest("add Welfare Details");
		  r.addWelfareDetails(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add Welfare Details"); 
		   }
	  
	  @Test(priority=3)
	  public void filter() throws Exception {
		  test=report.startTest("Filter Welfare Details ");
		  r.filter(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "Filter Welfare Details"); 
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