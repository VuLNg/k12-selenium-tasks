package api_learning;

import dev.failsafe.internal.util.Assert;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InterviewQuestions {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
    private static final By USERNAME_SEL = By.id("username");
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        List<WebElement> usernameEle = driver.findElements(USERNAME_SEL);
        if(usernameEle.isEmpty()) {
            Assert.state(false,("The element is not found"));
        }
    }
}
