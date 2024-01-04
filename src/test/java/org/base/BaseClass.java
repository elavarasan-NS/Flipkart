package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void launchInternetExplorer() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	
	public void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void launchUrl(String pageUrl) {
		driver.get(pageUrl);
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void maxmizeWindow() {
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	public void implictWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	public void loadingTime() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void clickElement(WebElement element) {		
		element.click();
	}
	
	public void passText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	
	public void robotKeyPress(int key) throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(key);
	}
	
	public void robotKeyRel(int key) throws AWTException {
		Robot rt = new Robot();
		rt.keyRelease(key);
	}
	
	public void switchToNewWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String value : windowHandles) {
			if (windowHandle != value) {
				driver.switchTo().window(value);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
