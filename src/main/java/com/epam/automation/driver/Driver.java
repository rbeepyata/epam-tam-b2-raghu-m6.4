package com.epam.automation.driver;

import org.openqa.selenium.WebDriver;

import com.epam.automation.ConfigProperties;

/**
 * Singleton
 * @author Raghunandan_Beepyata
 *
 */
public class Driver {

    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getInstance() {
        if (null == driver) {
            driver = DriverFactory.getDriver(ConfigProperties.BROWSER);
        }
        return driver;
    }
}
