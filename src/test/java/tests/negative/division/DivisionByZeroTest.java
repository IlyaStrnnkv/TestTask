package tests.negative.division;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DivisionByZeroTest extends BaseTest {
    @Test(priority = 2, retryAnalyzer = retry.Retry.class)
    public void divisionByZero () {
        googleHomePage.open("https://www.google.com");
        googleHomePage.enterText().clickToFind();
        calculatorPage.sixDivideByZero().getAnswer();
        Assert.assertEquals(calculatorPage.answerValueStringForDiv(), "Infinity");
        calculatorPage.close();
    }

}
