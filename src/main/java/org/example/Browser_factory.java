package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Browser_factory {

    protected static WebDriver driver;
    protected WebDriver openBrowser(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/home/nirk/Downloads/Chromedriver/chromedriver_linux64/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "/home/nirk/Downloads/Firefoxdriver/geckodriver-v0.31.0-linux64/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}