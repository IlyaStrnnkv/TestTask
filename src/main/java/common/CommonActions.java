package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeOutVariable.IMPLICITLY_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (PLATFORM_AND_BROWSER){

            case("mac_chrome"):
            System.setProperty("webdriver.chrome.driver", "/Users/strnnkv/IdeaProjects/TestTask/resources/chromedriver");
            driver = new ChromeDriver();
            break;
            default:
                Assert.fail("Incorrect platform or browser " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        return driver;
    }

}
