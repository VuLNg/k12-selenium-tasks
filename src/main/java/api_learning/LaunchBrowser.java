package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();

        // Open web page
        driver.get("https://sdetpro.com");

        // Close a window
        driver.close();

        // Quit the session
        driver.quit();
    }
}
