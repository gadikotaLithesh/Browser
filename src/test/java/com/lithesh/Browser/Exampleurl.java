package com.lithesh.Browser;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Exampleurl {

	@Test
	public void test() {
		WebDriver driver;
		System.out.println("Welcome");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://google.com");
	}
	

}
