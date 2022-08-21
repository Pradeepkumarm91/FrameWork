package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();

		WebElement txtUser = driver.findElement(By.id("email"));
		fill(txtUser, "greens");

		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "12345");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
