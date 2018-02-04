package com.epam.automation;

import org.openqa.selenium.WebDriver;

import com.epam.automation.elements.DecoratedElement;

public abstract class PageBase {
	
	protected static WebDriver driver;
	
	public static void initBasePage(WebDriver driver) {
		PageBase.driver = driver;
		DecoratedElement.setDriver(driver);
	}

}
