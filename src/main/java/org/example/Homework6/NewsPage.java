package org.example.Homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]")
    private WebElement allNewsButton;

    public LibraryPage clickAllNewsButton(){
        allNewsButton.click();
        return new LibraryPage(driver);
    }
}
