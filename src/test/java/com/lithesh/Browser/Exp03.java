package com.lithesh.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp03 {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("gadikotalithesh@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();


    }

}
