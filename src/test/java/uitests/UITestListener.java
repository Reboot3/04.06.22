package uitests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;
import org.testng.log4testng.Logger;

import java.io.File;
import java.sql.Timestamp;


public class UITestListener extends TestListenerAdapter {

    Logger logger = Logger.getLogger(this.getClass());
    WebDriver driver;

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        driver = (WebDriver) iTestResult.getTestContext().getAttribute("driver");

        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File file = scrShot.getScreenshotAs(OutputType.FILE);
        String path = buildScreenshotPath(iTestResult);
        Utils.copyFile(file, new File(path));

        logger.error("TEST FAILED. Screenshot: " + path);
    }

    private String buildScreenshotPath(ITestResult iTestResult) {
        String classSubfolder = "/" + iTestResult.getTestClass().getName().replace(".", "/");
        String testSubFolder = "/" + iTestResult.getMethod().getMethodName();
        String fileName = "/image" + new Timestamp(System.currentTimeMillis()) + ".png";


        return new StringBuilder()
                .append(System.getProperty("user.dir"))
                .append("/screenshots")
                .append(classSubfolder)
                .append(testSubFolder)
                .append(fileName).toString();
    }
}
