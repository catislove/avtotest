package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Homework6.NewsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework6Test {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://miigaik.ru/");
    }

    @Test
    void GoToTheLibraryThroughTheNews() {
        new NewsPage(driver).clickAllNewsButton()
                .clickLibraryButton()
                .clickStudyGuidesButton();
    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }

}
