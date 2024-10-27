package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FirstPage;

@Tag("watchTest")
public class FirstTests extends TestBase {

    FirstPage firstPage = new FirstPage();

    @Test
    @DisplayName("Название кнопки 'Команда' соответствует требованиям")
    public void buttonTeamWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonTeam();
    }

    @Test
    @DisplayName("Кнопка 'Стать клиентом' кликабельна")
    public void buttonClientWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonClient();
    }

    @Test
    @DisplayName("Название кнопки 'Стать поставщиком' соответствует требованиям")
    public void buttonProducerWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonProducer();
    }

    @Test
    @DisplayName("Название кнопки 'Контакты' соответствует требованиям")
    public void buttonContactsWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonContacts();
    }

    @Test
    @DisplayName("Название кнопки 'Стать клиентом' соответствует требованиям")
    public void buttonJoinWatchTest() {
        firstPage.openPage();
        firstPage.checkButtonJoin();
    }
}
