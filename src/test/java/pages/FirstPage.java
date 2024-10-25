package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstPage {

    public String team = "Команда";
    public String producer = "Стать поставщиком";
    public String contacts = "Контакты";
    public String join = "Стать клиентом";

    private final SelenideElement buttonTeam = $(".nav-section__link");
    private final SelenideElement buttonClient = $(".contact-us__open.hero__contact-us");
    private final SelenideElement buttonProducer = $("[data-role ='provider']");
    private final SelenideElement buttonContacts = $(".hero__login");
    private final SelenideElement buttonJoin = $("[data-role ='buyer']");

    public FirstPage openPage() {
        open("/");
        return this;
    }

    public FirstPage checkButtonTeam() {
        buttonTeam.shouldHave(text(team));
        return this;
    }

    public FirstPage checkButtonClient() {
        buttonClient.shouldBe(clickable);
        return this;
    }

    public FirstPage checkButtonProducer() {
        buttonProducer.shouldHave(text(producer));
        return this;
    }

    public FirstPage checkButtonContacts() {
        buttonContacts.shouldHave(text(contacts));
        return this;
    }

    public FirstPage checkButtonJoin() {
        buttonJoin.shouldHave(text(join));
        return this;
    }

}



