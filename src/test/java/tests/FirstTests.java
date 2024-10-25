package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FirstPage;

import static io.qameta.allure.Allure.step;

public class FirstTests extends TestBase {

    FirstPage firstPage = new FirstPage();

    @Test
    @Tag("watchTest")
    @DisplayName("Название кнопки 'Команда' соответствует требованиям")
    public void buttonTeamWatchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открыть страницу", () -> {
            firstPage.openPage();
        });

        step("Проверить текст кнопки 'Команда'", () -> {
            firstPage.checkButtonTeam();
        });
    }

    @Test
    @DisplayName("Кнопка 'Стать клиентом' кликабельна")
    public void buttonClientWatchTest() {
        step("Открыть страницу", () -> {
            firstPage.openPage();
        });
        step("Проверить кликабельность кнопки 'Стать клиентом'", () -> {
            firstPage.checkButtonClient();
        });
    }

    @Test
    @DisplayName("Название кнопки 'Стать поставщиком' соответствует требованиям")
    public void buttonProducerWatchTest() {
        step("Открыть страницу", () -> {
            firstPage.openPage();
        });
        step("Проверить текст кнопки 'Стать поставщиком'", () -> {
            firstPage.checkButtonProducer();
        });
    }

    @Test
    @DisplayName("Название кнопки 'Контакты' соответствует требованиям")
    public void buttonContactsWatchTest() {
        step("Открыть страницу", () -> {
            firstPage.openPage();
        });
        step("Проверить текст кнопки 'Контакты'", () -> {
            firstPage.checkButtonContacts();
        });
    }

    @Test
    @DisplayName("Название кнопки 'Стать клиентом' соответствует требованиям")
    public void buttonJoinWatchTest() {
        step("Открыть страницу", () -> {
            firstPage.openPage();
        });
        step("Проверить текст кнопки 'Стать клиентом'", () -> {
            firstPage.checkButtonJoin();
        });
    }
}
