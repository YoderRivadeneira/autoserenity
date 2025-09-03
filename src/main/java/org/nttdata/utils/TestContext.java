package org.nttdata.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class TestContext {

    private static WebDriver driver;



    public static void initialize() throws IOException {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();


            boolean isCI = System.getenv("CI") != null;

            ChromeOptions options = new ChromeOptions();
            if (isCI) {

                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }

            driver = new ChromeDriver(options);

        }
    }

    public static WebDriver getDriver() {
        return driver;
    }


    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
