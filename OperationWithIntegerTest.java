package tests.positive;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class OperationWithIntegerTest extends BaseTest {

    @Test(priority = 1)
    public void operationWithInteger () {

        googleHomePage.open("https://www.google.com/");
        googleHomePage.enterText().clickToFind();
        calculatorPage.sum2elementsInParenthesis(1, 2).multiplicationByThree().subtractionFourty().divisionByFive().getAnswer();

        Assert.assertEquals(calculatorPage.answerValueIntForOpt(), 1);
    }

}
