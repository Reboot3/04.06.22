package uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitests.CommonTools;

import java.time.Duration;

public class ResultsPage {

    WebDriver driver;

    By resultsById = By.id("result-stats");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElement(By elementToWait) {
        Duration forHowLong = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, forHowLong);
        ExpectedCondition<WebElement> condition = ExpectedConditions.elementToBeClickable(elementToWait);
        //wait.until(driver -> driver.findElement(By.id("id")).isDisplayed());
        wait.until(condition);
    }

    public int getNumberOfResults() {
        waitForElement(resultsById);

        WebElement statsElement = driver.findElement(resultsById);
        return CommonTools.parseResults(statsElement);
    }
}
