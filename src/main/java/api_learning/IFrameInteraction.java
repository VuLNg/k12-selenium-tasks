package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.ui.SelectExt;

public class IFrameInteraction {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/iframe";
    private static final By IFRAME_SEL = By.cssSelector("iframe[id^='mce']");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(TARGET_URL);
        try{
            // Locate the dropdown and select
            WebElement iFrameEle = driver.findElement(IFRAME_SEL);

            // Switch to the target iFrame
            driver.switchTo().frame(iFrameEle);

            // Interact with iFrame's elements
            WebElement inputFieldEle = driver.findElement(By.id("tinymce"));
            inputFieldEle.click();
            inputFieldEle.clear();
            inputFieldEle.sendKeys("Random text");
            Thread.sleep(2000);

            // Switch back to the parent frame
            driver.switchTo().defaultContent();

            // Continue to interact with other elements outside the frame

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
