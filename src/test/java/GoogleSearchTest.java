import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver4638");

        WebDriver driver = new ChromeDriver();

        String fullXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String xPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String selector = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";

        driver.get("https://google.com/");
        String nameValue = "q";
        WebElement textInput = driver.findElement(By.name(nameValue));
        textInput.sendKeys("Portnov Computer School");
        textInput.submit();

        WebElement statsElement = driver.findElement(By.id("result-stats"));
        String wholeStatsText = statsElement.getText();
        String[] array = wholeStatsText.split(" ");
        String numberOfResults = array[1];
        String replacedComma = numberOfResults.replace(',', ' ');
        int parsedInteger = Integer.parseInt(replacedComma);

        Assert.assertTrue(parsedInteger > 1000);
    }

    @Test
    public void testFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriverAarch64");

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
