package tests.negative.sinus;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class EmptySinusTest extends BaseTest {
    @Test(priority = 3, retryAnalyzer = retry.Retry.class)
    public void checkEmptySinus () {
        googleHomePage.open("https://www.google.com");
        googleHomePage.enterText().clickToFind();
        calculatorPage.clickToSinus().getAnswer();
        Assert.assertEquals(calculatorPage.answerValueForSinus(), "Error");
        calculatorPage.close();
    }

}
