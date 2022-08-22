package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework5Test {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private static final String MIIGAIK_BASE_URL = "https://miigaik.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(MIIGAIK_BASE_URL);
    }


   @Test
    void GoToTheLibraryThroughTheNews()  {
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
               driver.findElement(By.xpath("//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]")));
       driver.findElement(By.xpath("//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]")).click();
       driver.findElement(By.id("/library/")).click();
       driver.findElement(By.id("/library/tutorials/")).click();
       driver.findElement(By.xpath("//div[@id='title-search']//input[@id='title-search-input']")).click();
       driver.findElement(By.xpath("//div[@id='title-search']//input[@id='title-search-input']")).sendKeys("Абросимов");
       driver.findElement(By.xpath("//input[@name=\"s\"]")).click();
       webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p/b[.='Отсортировано по релевантности']")));
       Assertions.assertEquals(driver.findElement(By.xpath("//p/b[.='Отсортировано по релевантности']")).getText(), "Отсортировано по релевантности");
   }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }

}
