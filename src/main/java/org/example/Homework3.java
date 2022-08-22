package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver();
        driver.get("https://miigaik.ru/");
        driver.findElement(By.xpath("//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]")).click();
        driver.findElement(By.id("/library/")).click();
        driver.findElement(By.id("/library/tutorials/")).click();
        driver.findElement(By.xpath("//div[@id='title-search']//input[@id='title-search-input']")).click();
        driver.findElement(By.xpath("//div[@id='title-search']//input[@id='title-search-input']")).sendKeys("Абросимов");
        driver.findElement(By.xpath("//input[@name=\"s\"]")).click();
        driver.quit();
    }
}
