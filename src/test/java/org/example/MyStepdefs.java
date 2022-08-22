package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Homework8.LibraryPage;
import org.example.Homework8.NewsPage;
import org.example.Homework8.StudyGuidesPage;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @When("Кликнуть на кнопку Все новости")
    public void кликнутьНаКнопкуВсеНовости() {
        new NewsPage().clickAllNewsButton();
    }

    @And("Кликнуть на кнопку Библиотека МИИГАиК")
    public void кликнутьНаКнопкуБиблиотекаМИИГАиК() {
        new LibraryPage().clickLibraryButton();
    }

    @Then("Кликнуть на кнопку Учебные пособия и проверить строку поиска")
    public void кликнутьНаКнопкуУчебныеПособияИПроверитьСтрокуПоиска() {
        new StudyGuidesPage().clickStudyGuidesButton();
    }

    @Given("Пользователь находится на главной странице МИИГАиК")
    public void пользовательНаходитсяНаГлавнойСтраницеМИИГАиК() {
        open("https://miigaik.ru/");
    }
}
