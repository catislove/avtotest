package org.example.Homework7;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]")
    private WebElement allNewsButton;

    @Step("Клик на кнопку 'Все новости'")
    public LibraryPage clickAllNewsButton(){
        allNewsButton.click();
        return new LibraryPage(driver);
    }
}
