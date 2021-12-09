package uitests;

import org.junit.Assert;
import org.testng.annotations.Test;
import uitests.pages.MainPage;
import uitests.pages.ResultsPage;

public class GoogleSearchTest extends TestBase {
    //1. Navigate to the main page
    //2. Type the query and submit
    //3. Assert the amount result
    // - get the amount results
    // - compare that amount with expectations
    @Test(dataProvider = "strings for query")
    public void testSearchAndVerifyResults(String paramOne) {
        int testExpectedNumber = 10000;

        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.typeQueryAndSubmit(paramOne);

        ResultsPage resultsPage = new ResultsPage(driver);
        int actualNumberOfResults = resultsPage.getNumberOfResults();

        Assert.assertTrue("amount of result is less than " + testExpectedNumber, actualNumberOfResults > testExpectedNumber);
    }
}
