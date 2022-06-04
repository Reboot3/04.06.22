import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testUnUsedLocators() {
        String fullXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String xPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String selector = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
    }

    //1. Navigate to the main page
    //2. Type the query and submit
    //3. Assert the amount result
    // - get the amount results
    // - compare that amount with expectations
    @Test
    public void testSearchAndVerifyResults() {
        navigateToMainPage();
        typeQueryAndSubmit();
        int actualNumberOfResults = getNumberOfResults();
        Assert.assertTrue(actualNumberOfResults > 1000);
    }

    private int getNumberOfResults() {
        WebElement statsElement = driver.findElement(By.id("result-stats"));
        return CommonTools.parseResults(statsElement);
    }

    private void typeQueryAndSubmit() {
        String nameValue = "q";
        WebElement textInput = driver.findElement(By.name(nameValue));
        textInput.sendKeys("Portnov Computer School");
        textInput.submit();
    }

    private void navigateToMainPage() {
        driver.get("https://google.com/");
    }

    @Test
    public void testOSVersion() {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }

    @Test
    public void testFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com/");
    }

    @Test
    public void testFirefoxWin() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com/");
    }
}
