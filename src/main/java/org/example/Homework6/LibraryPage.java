package org.example.Homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LibraryPage extends BasePage {
    public LibraryPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "/library/")
    private WebElement libraryButton;

    public StudyGuidesPage clickLibraryButton(){
        libraryButton.click();
        return new StudyGuidesPage (driver);
    }
}