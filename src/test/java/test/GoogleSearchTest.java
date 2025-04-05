package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java_utility.AppConstants;
import java_utility.BaseClass;
import java_utility.ConfigReader;
import java_utility.ExcelUtil;
import webdriverUtility.WebDriverUtil;

public class GoogleSearchTest extends BaseClass {

	@Test
	public void searchGoogleForiPhone() throws InterruptedException, IOException {

		// Open URL
		WebDriverUtil.openURL(AppConstants.URL);
		System.out.println("Page Title: " + driver.getTitle());

		// Read value from Excel
		String cellValue = ExcelUtil.readCell(ConfigReader.getProperty("filePath"), "Rupa", 0, 0);
		System.out.println("Excel Value: " + cellValue);

		// Locate search box and perform search (you can replace with cellValue if
		// needed)
		WebElement searchArea = driver.findElement(By.name("q"));
		searchArea.sendKeys("iPhone 15"); // or use: searchArea.sendKeys(cellValue);
		Thread.sleep(2000);
		searchArea.sendKeys(Keys.ENTER);
		Thread.sleep(3000); // Wait for results

	}
}
