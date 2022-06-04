import org.junit.Assert;
import org.junit.Test;

public class CommonToolsTest {

    @Test
    public void verifyExtractInteger() {
        String value = "About 820,000 results (0.53 seconds)";
        int actual = CommonTools.extractInteger(value);
        Assert.assertEquals(820000, actual);
    }
}
