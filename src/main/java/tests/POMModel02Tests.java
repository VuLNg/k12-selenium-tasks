package tests;

import driver.DriverFactory;
import models.pages.LoginPageModel01;
import models.pages.LoginPageModel02;
import org.openqa.selenium.WebDriver;

public class POMModel02Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://");
        LoginPageModel02 loginPage = new LoginPageModel02(driver);
        loginPage.inputUsername("");
        loginPage.inputPassword("");
        loginPage.clickOnLoginBtn();
    }
}
