package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.example.Homework7.AdditionalLogger;
import org.example.Homework7.NewsPage;
import org.example.Homework7.TestExtention;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.io.ByteArrayInputStream;
import static org.openqa.selenium.OutputType.BYTES;


@Story("Тест сайта МИИГАиК")
public class Homework7Test {
    WebDriver driver;

    @RegisterExtension
    TestExtention watcher = new TestExtention();

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
            driver = new EventFiringDecorator(new AdditionalLogger()).decorate(new ChromeDriver());
            driver.get("https://miigaik.ru/");
    }

    @Test
    @TmsLink("123")
    @Feature("Переход в библиотеку через Новости")
    @DisplayName("Переход в библиотеку через Новости")
    void GoToTheLibraryThroughTheNews()  {
        new NewsPage(driver).clickAllNewsButton()
                .clickLibraryButton()
                .clickStudyGuidesButton();
    }

    @AfterEach
    void killBrowser() {
        watcher.setScreenStream(new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(BYTES)));

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);

        for (LogEntry log: logEntries) {
            Allure.addAttachment("Элемент лога браузера", log.getMessage());
        }

        driver.quit();

    }
}
