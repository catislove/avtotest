package org.example.Homework8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NewsPage {

    private SelenideElement allNewsButton = $(By.xpath("//a[@href=\"/about/news/\" and @class=\"btn btn-link\"]"));

    @Step("Клик на кнопку 'Все новости'")
    public LibraryPage clickAllNewsButton(){
        allNewsButton.click();
        return page(LibraryPage.class);
    }
}
