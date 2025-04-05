package webdriverUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {

    private static WebDriver driver;

    // ✅ Set WebDriver instance (from BaseClass)
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    // ✅ Open URL
    public static void openURL(String url) {
        driver.get(url);
    }

    // ✅ Get WebDriver instance
    public static WebDriver getDriver() {
        return driver;
    }

    // ✅ Close browser
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ✅ Refresh page
    public static void refreshPage() {
        driver.navigate().refresh();
    }

    // ✅ Navigate back
    public static void navigateBack() {
        driver.navigate().back();
    }

    // ✅ WebDriverWait (explicit wait setup)
    public static WebDriverWait getExplicitWait(int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    // ✅ Send text to input field
    public static void setText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    // ✅ Click on element
    public static void clickElement(WebElement element) {
        element.click();
    }

    // ✅ Handle alerts
    public static void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    // ✅ Use JavaScriptExecutor
    public static void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void setValueUsingJS(WebElement element, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + value + "';", element);
    }

    // ✅ Use Robot class for keyboard actions
    public static void pressEnter() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void pressTab() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // ✅ Keyboard keys using Actions
    public static void sendKeysUsingActions(WebElement element, String text) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys(text).build().perform();
    }

    public static void pressEnterUsingActions() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
}  
