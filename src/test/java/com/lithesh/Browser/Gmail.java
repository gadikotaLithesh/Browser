package com.lithesh.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("yourmail@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.id("password")).sendKeys("your password");
        driver.findElement(By.id("passwordNext")).click();

    }

}
