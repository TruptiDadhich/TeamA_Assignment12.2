package Test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.baseclass;
import extentreport.report;

public class getpostmethodTest extends report {
	@Test
	public void testFirst()
	{
		reports.createTest("testFirst");
		baseclass.get();
	}
	@Test
	public void testSecond()
	{
		reports.createTest("testSecond");
		baseclass.get1();
	}
 
	@Test
	public void testThird()
	{
		reports.createTest("testThird");
		baseclass.post();
		reports.flush();
	}
}