package org.main;

import java.awt.AWTException;

import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.flip.AddToCartPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {

	@BeforeClass
	private void launchChromeBrowser() {
		launchChrome();
		maxmizeWindow();
		implictWait();
	}

	@AfterClass
	private void closeAllWindow() throws InterruptedException {
		loadingTime();
		closeBrowser();
	}

	@Test
	private void tc1() throws AWTException {
		launchUrl("https://www.flipkart.com/");
		AddToCartPojo cart = new AddToCartPojo();
		cart.searchMobile("Mobile");
		robotKeyPress(KeyEvent.VK_ENTER);
		robotKeyRel(KeyEvent.VK_ENTER);
		cart.clickFirstMobile();
		switchToNewWindow();
		cart.clickAddToCart();
	}
}
