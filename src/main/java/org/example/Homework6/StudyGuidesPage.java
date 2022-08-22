package org.example.Homework6;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StudyGuidesPage extends BasePage {
    public StudyGuidesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "/library/tutorials/")
    private WebElement studyGuidesButton;

    @FindBy(xpath = "//div[@id='title-search']//input[@id='title-search-input']")
    private WebElement searchLineButton;

    @FindBy(xpath = "//input[@name=\"s\"]")
    private WebElement searchButton;

    public StudyGuidesPage clickStudyGuidesButton(){
        studyGuidesButton.click();
        searchLineButton.click();
        searchLineButton.sendKeys("Абросимов");
        searchButton.click();
        String xpathLocator = "//p/b[.='Отсортировано по релевантности']";
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
        Assertions.assertNotNull("Отсортировано по релевантности","Отсортировано по релевантности");
        return this;
    }
}