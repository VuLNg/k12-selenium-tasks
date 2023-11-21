package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ui.WaitForElementEnable;

import java.time.Duration;

public class ExplicitWait {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
    private static final By USERNAME_SEL = By.id("username");
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(TARGET_URL);
        try{
            // Implicit Wait: apply globally for the whole session when finding elements | Interval time 500 milliseconds
            // Explicit Wait: apply locally for a specific element | Interval time 500 milliseconds
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Return the TimeoutException if a condition does not match
            //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tao lao")));

            // Return the NoSuchException if a condition does not match
            //webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tao lao"))));

            // Trigger action and verify the visibility of an element
//            try {
//                webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("tao lao")));
//            } catch (TimeoutException timeoutException) {
//                // Assert fail.....
//            }

            // Using customised explicit wait class
            webDriverWait.until(new WaitForElementEnable(By.cssSelector("#sth")));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
