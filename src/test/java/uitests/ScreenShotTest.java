package uitests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ScreenShotTest extends TestBase {

    @Test
    public void shouldFailTest() {
        driver.get("https://google.com");
        Assert.assertTrue(false);
    }
}
