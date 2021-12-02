package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {

    WebDriver driver;


    @Parameters({"browser"})
    @BeforeSuite
    public void suiteSetup(@Optional("Firefox") String browser) {
        String os = System.getProperty("os.name");

        if (os.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/macos/m1/chromedriver4638");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/macos/m1/geckodriverAarch64");
        }

        if (os.contains("Windows")) {
            //TODO: set chrome and geckodriver properties for windows
        }

        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @DataProvider(name = "strings for query")
    public Object[][] createData1() {
        return new Object[][]{
                {"Portnov Computer School"},
                {"Portnov School"},
        };
    }

}