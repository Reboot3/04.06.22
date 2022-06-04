import org.testng.annotations.Test;
import uitests.TestBase;

public class XpathTest extends TestBase {

    @Test
    public void testName() {
        String fullXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String relativeXpath = "//form/div[1]/div[1]/div[1]/div/div[2]/input";

        String xpath1 = "//*[@name='q']";
        String xpath2 = "//input[@name='q'][@title='search']";
        String xpath3 = "//input[@name='value01' or @name='value02]";
        String xpath4 = "//input[contains(@class,'YacQv')]";
        String xpath5 = "//input[starts-with(@class,'class-')]";
        String xpath6 = "//*[text()='Log In']";
        String xpath7 = "(//input[@type='text'])[last()]";
        String xpath8 = "(//input[@type='text'])[2]";
    }
}
