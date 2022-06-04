package uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    By searchInput = By.name("q");
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get("https://google.com/");
    }

    public void typeQueryAndSubmit(String queryText) {
        WebElement textInput = driver.findElement(searchInput);
        textInput.sendKeys(queryText);
        textInput.submit();
    }

}
