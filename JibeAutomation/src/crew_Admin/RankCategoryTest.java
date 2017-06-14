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
import crew_Admin.RankCategory;
import quality_Admin.FormTypeLibrary;






public class RankCategoryTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	RankCategory r=new RankCategory();
	
	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("RankCategoryTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Rank category"); 
		   }
	@Test(priority=2)
	  public void addrankcategory() throws Exception {
		  test=report.startTest("add rank category");
		  r.addrankcategory(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "add rank category"); 
		   }
	  
	  @Test(priority=3)
	  public void search() throws Exception {
		  test=report.startTest("search rank category ");
		  r.search(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "search rank category"); 
		   }
	  
	  @Test(priority=4)
	  public void edit() throws Exception {
		  test=report.startTest("edit rank category");
		  r.edit(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "edit rank category"); 
		   }

	  @Test(priority=5)
	  public void delete() throws Exception {
		  test=report.startTest("delete rank category");
		  r.delete(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "delete rank category"); 
		   }
	  @Test(priority=6)
	  public void exportexcel() throws Exception {
		  test=report.startTest("export excel");
		  r.exportexcel(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "export excel"); 
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
