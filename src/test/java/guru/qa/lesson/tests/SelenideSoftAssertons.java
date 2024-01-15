package guru.qa.lesson.tests;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertons {
    @Test
    void shouldFind() {
        // - Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$("div#wiki-body ul li");
        $(byText("Soft assertions")).click();

        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("div#wiki-body").shouldHave(Condition.text("3. Using JUnit5 extend test class:"));
    }
}