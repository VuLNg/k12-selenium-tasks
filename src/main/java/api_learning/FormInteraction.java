package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormInteraction {
    private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
    private static final By USERNAME_SEL = By.id("username");
    private static final By PASSWORD_SEL = By.cssSelector("#password");
    private static final By LOGINBUTTON_SEL = By.cssSelector("#login [type='submit']");
    private static final String USERNAME_STR = "tomsmith";
    private static final String PASSWORD_STR = "SuperSecretPassword!";
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(TARGET_URL);
        try{
            WebElement usernameEle = driver.findElement(USERNAME_SEL);
            WebElement passwordEle = driver.findElement(PASSWORD_SEL);

            // Refresh page
            driver.navigate().refresh();
            usernameEle = driver.findElement(USERNAME_SEL);
            passwordEle = driver.findElement(PASSWORD_SEL);
            WebElement loginBtnEle = driver.findElement(LOGINBUTTON_SEL);
            usernameEle.sendKeys(USERNAME_STR);
            passwordEle.sendKeys(PASSWORD_STR);
            loginBtnEle.click();

            // Navigate back
            driver.navigate().back();

            // Debug purpose only
            try{
                Thread.sleep(2000);
            } catch (Exception ignored){}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
