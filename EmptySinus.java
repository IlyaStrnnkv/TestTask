package tests.negative.sinus;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class EmptySinus extends BaseTest {
    @Test(priority = 3)
    public void checkEmptySinus () {
        googleHomePage.open("https://www.google.com");
        googleHomePage.enterText().clickToFind();
        calculatorPage.clickToSinus().getAnswer();
        Assert.assertEquals(calculatorPage.answerValueForSinus(), "Error");
    }

}
