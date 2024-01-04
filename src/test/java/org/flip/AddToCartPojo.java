package org.flip;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCartPojo extends BaseClass {

	public void searchMobile(String vale) {
		WebElement searchBox = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		passText(searchBox, vale);
	}

	public void clickFirstMobile() {
		WebElement firstmobile = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 (Starlight, 128 GB)']"));
		clickElement(firstmobile);
	}

	public void clickAddToCart() {
		WebElement addToCart = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		clickElement(addToCart);
	}

}
