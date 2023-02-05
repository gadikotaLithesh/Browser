package com.lithesh.Browser;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp01 {
    @Test
    public void test() {
        // Check that the page title is "My Account"
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/account");
        driver.findElement(By.id("ap_email")).sendKeys("yourmail@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("your password");
        driver.findElement(By.id("signInSubmit")).click();
        boolean accountInfoDisplayed = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
        System.out.println(accountInfoDisplayed);

    }
}