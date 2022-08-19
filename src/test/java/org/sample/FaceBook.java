package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();

		a.get("https://www.facebook.com/");

		WebElement userName = a.findElement(By.id("email"));
		userName.sendKeys("greens");

		String attribute = userName.getAttribute("value");
		System.out.println(attribute);

		WebElement password = a.findElement(By.id("pass"));
		password.sendKeys("123123123");

		String attribute2 = password.getAttribute("value");
		System.out.println(attribute2);

		a.findElement(By.name("login")).click();
	}
}
