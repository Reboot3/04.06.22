package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandlesTest extends TestBase {

    @Test
    public void testName() {
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();
        Set<String> windowHandles = driver.getWindowHandles();
        String[] arrayOfHandles = windowHandles.toArray(new String[0]);
        String firstWindow = arrayOfHandles[0];
        String secondWindow = arrayOfHandles[1];
        driver.switchTo().window(secondWindow);

        String title = driver.getTitle();
        Assert.assertEquals(title, "New Window");
    }
}
