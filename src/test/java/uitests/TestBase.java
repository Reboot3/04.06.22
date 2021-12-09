package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(UITestListener.class)
public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void methodSetup(@Optional("Firefox") String browser, ITestContext context) {
        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        context.setAttribute("driver", driver);
    }

    @AfterMethod
    public void testMethodTearDown() {
        driver.quit();
    }

    @BeforeSuite
    public void suiteSetup() {
        String os = System.getProperty("os.name");

        if (os.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/macos/m1/chromedriver4638");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/macos/m1/geckodriverAarch64");
        }

        if (os.contains("Windows")) {
            //TODO: set chrome and geckodriver properties for windows
        }
    }

    @AfterSuite
    public void afterSuite() {

    }

}
