package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class LinkTextInteraction {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";


    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(TARGET_URL);
        try{
/*           By powerByLinkTextSel = By.linkText("Elemental Selenium");
           WebElement powerByLinkTextSelEle = driver.findElement(powerByLinkTextSel);
           powerByLinkTextSelEle.click();*/

            By powerByPartialLinkTextSel = By.partialLinkText("Elemental");
            WebElement powerByPartialLinkTextSelEle = driver.findElement(powerByPartialLinkTextSel);
            powerByPartialLinkTextSelEle.click();

            // Debug purpose only
            try {
                Thread.sleep(200);
            } catch (Exception ignored) {}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
