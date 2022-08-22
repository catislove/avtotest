package org.example.Homework8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class LibraryPage {
    private SelenideElement libraryButton = $(By.id("/library/"));

    @Step("Клик на кнопку Библиотека")
    public StudyGuidesPage clickLibraryButton(){
        libraryButton.click();
        return page(StudyGuidesPage.class);
    }
}