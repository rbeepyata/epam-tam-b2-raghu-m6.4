package com.epam.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.automation.driver.Driver;

public class TestBase {
	
	protected WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = Driver.getInstance();
		PageBase.initBasePage(driver);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterTest() {
		driver.quit();
	}

}
