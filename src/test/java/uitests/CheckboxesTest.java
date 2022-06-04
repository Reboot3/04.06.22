package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest extends TestBase {

    @Test
    public void testName() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> allInputs = driver.findElements(By.tagName("input"));

        WebElement firstInput = allInputs.get(0);
        WebElement secondInput = allInputs.get(1);

        WebElement checkBox01Xpath = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkBox02Xpath = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        String attributeValue = firstInput.getAttribute("checked");

        if (attributeValue != null) {
            firstInput.click();
        }

        Assert.assertTrue(firstInput.getAttribute("checked") == null);

    }
}
