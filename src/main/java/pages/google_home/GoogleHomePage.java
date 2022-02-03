package pages.google_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import static constants.Constant.Input.CALCULATOR;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchString = By.xpath("//input[@jsaction='paste:puy29d;']");
    private final By findButton = By.xpath("//div[@class='aajZCb']//div[@class='lJ9FBc']//input[@class='gNO89b']");

    public GoogleHomePage enterText () {
        WebElement buttonFind = driver.findElement(searchString);
        waitElementIsVisible(buttonFind).sendKeys(CALCULATOR);
        return this;
    }
    public GoogleHomePage clickToFind () {
        driver.findElement(findButton).click();
        return this;
    }
}
