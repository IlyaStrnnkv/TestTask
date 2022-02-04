package pages.google_calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class CalculatorPage extends BasePage {

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    private final By inputField = By.xpath("//div[@class='TIGsTb']");
    private final By leftParenthesis = By.xpath("//div[@jsname='j93WEe']");
    private final By rightParenthesis = By.xpath("//div[@jsname='qCp9A']");
    private final By plus = By.xpath("//div[@jsname='XSr6wc']");
    private final By multiplication = By.xpath("//div[@jsname='YovRWb']");
    private final By subtraction = By.xpath("//div[@jsname='pPHzQc']");
    private final By division = By.xpath("//div[@jsname='WxTTNd']");
    private final By result = By.xpath("//div[@jsname='Pt8tGc']");
    private final By zero = By.xpath("//div[@jsname='bkEvMb']");
    private final By one = By.xpath("//div[@jsname='N10B9']");
    private final By two = By.xpath("//div[@jsname='lVjWed']");
    private final By three = By.xpath("//div[@jsname='KN1kY']");
    private final By four = By.xpath("//div[@jsname='xAP7E']");
    private final By five = By.xpath("//div[@jsname='Ax5wH']");
    private final By six = By.xpath("//div[@jsname='abcgof']");
    private final By sinus = By.xpath("//div[@jsname='aN1RFf']");
    private final By answer = By.xpath("//span[@jsname='VssY5c']");


    public CalculatorPage sum2elementsInParenthesis (int a, int b) {

        WebElement fieldInput = driver.findElement(inputField);
        waitElementIsVisible(fieldInput).click();
        driver.findElement(leftParenthesis).click();
        switch (a){
            case (1):
                driver.findElement(one).click();
                break;
            case (2):
                driver.findElement(two).click();
                break;
            case (3):
                driver.findElement(three).click();
                break;
            case (4):
                driver.findElement(four).click();
                break;
            case (5):
                driver.findElement(five).click();
                break;
            case (6):
                driver.findElement(six).click();
                break;
            case (0):
                driver.findElement(zero).click();
                break;
            default:
                Assert.fail("It was input the wrong number");
        }

        driver.findElement(plus).click();

        switch (b){
            case (1):
                driver.findElement(one).click();
                break;
            case (2):
                driver.findElement(two).click();
                break;
            case (3):
                driver.findElement(three).click();
                break;
            case (4):
                driver.findElement(four).click();
                break;
            case (5):
                driver.findElement(five).click();
                break;
            case (6):
                driver.findElement(six).click();
                break;
            case (0):
                driver.findElement(zero).click();
                break;
            default:
                Assert.fail("It was input the wrong number");
        }
        driver.findElement(rightParenthesis).click();
        return this;
    }

    public CalculatorPage multiplicationByThree () {
        driver.findElement(multiplication).click();
        driver.findElement(three).click();
        return this;
    }

    public CalculatorPage subtractionFourty () {
        driver.findElement(subtraction).click();
        driver.findElement(four).click();
        driver.findElement(zero).click();
        return this;
    }

    public CalculatorPage divisionByFive () {
        driver.findElement(division).click();
        driver.findElement(five).click();
        return this;
    }

    public CalculatorPage sixDivideByZero () {
        WebElement fieldInput = driver.findElement(inputField);
        waitElementIsVisible(fieldInput).click();
        driver.findElement(six).click();
        driver.findElement(division).click();
        driver.findElement(zero).click();
        return this;
    }



    public CalculatorPage getAnswer () {
        driver.findElement(result).click();
        return this;
    }

    public CalculatorPage clickToSinus () {
        driver.findElement(sinus).click();
        return this;
    }






    public int answerValueIntForOpt() throws NumberFormatException{
        WebElement element = driver.findElement(answer);
        String answer = element.getAttribute("innerText");
        int intAnswer = Integer.parseInt(answer.trim());
        return intAnswer;
    }

    public String answerValueStringForDiv() {
        WebElement element = driver.findElement(answer);
        String answer = element.getAttribute("innerText");
        return answer;
    }
    public String answerValueForSinus () {
        WebElement element = driver.findElement(answer);
        String answer = element.getAttribute("innerText");
        return answer;
    }

}
