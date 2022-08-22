package org.example.Homework7;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LibraryPage extends BasePage {
    public LibraryPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "/library/")
    private WebElement libraryButton;

    @Step("Клик на кнопку Библиотека")
    public StudyGuidesPage clickLibraryButton(){
        libraryButton.click();
        return new StudyGuidesPage(driver);
    }
}