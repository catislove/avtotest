package org.example.Homework8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class StudyGuidesPage {

    private SelenideElement studyGuidesButton = $(By.id("/library/tutorials/"));
    private SelenideElement searchLineButton = $(By.xpath("//div[@id='title-search']//input[@id='title-search-input']"));
    private SelenideElement searchButton = $(By.xpath("//input[@name=\"s\"]"));

    @Step("Проверка кнопки 'Учебные пособия' и поисковой строки")
    public StudyGuidesPage clickStudyGuidesButton(){
        studyGuidesButton.click();
        searchLineButton.click();
        searchLineButton.sendKeys("Абросимов");
        searchButton.click();
        String xpathLocator = "//p/b[.='Отсортировано по релевантности']";
        Assertions.assertNotNull("Отсортировано по релевантности","Отсортировано по релевантности");
        return this;
    }
}