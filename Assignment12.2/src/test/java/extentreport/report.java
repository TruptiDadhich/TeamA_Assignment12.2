package extentreport;
import Utility.utility;

import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report {
	protected static ExtentReports reports;
	@BeforeTest
	public static ExtentReports extentrepo() {
		String path = System.getProperty("user.dir") + "\\extendreports\\TestReport_"+utility.getCurrentDateTime()+".html";
		ExtentSparkReporter repo = new ExtentSparkReporter(path);
		repo.config().setReportName("SampleApi");
		reports = new ExtentReports();
		reports.attachReporter(repo);
		return reports;
	}
}
