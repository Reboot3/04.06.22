package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

@Listeners(UITestListener.class)
public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void methodSetup(@Optional("Firefox") String browser, ITestContext context) {
        switch (browser) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        context.setAttribute("driver", driver);
    }

    @AfterMethod
    public void methodTearDown() {
        driver.quit();
    }

    @BeforeSuite
    public void suiteSetup() {
        String os = System.getProperty("os.name");

        if (os.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/macos/m1/chromedriver4638");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/macos/m1/geckodriverAarch64");
        } else if (os.contains("Windows")) {
            //TODO: set chrome and geckodriver properties for windows
        }
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

}
