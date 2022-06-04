import org.junit.Assert;
import org.junit.Test;
import uitests.CommonTools;

public class CommonToolsTest {

    @Test
    public void verifyExtractInteger() {
        String value = "About 820,000 results (0.53 seconds)";
        int actual = CommonTools.extractInteger(value);
        Assert.assertEquals(820000, actual);
    }

    @Test
    public void testOSVersion() {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }
}
