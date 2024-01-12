package guru.qa.lesson.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideRepositorySearch {
    @Test
    void shouldhaveAtTheTop() {
        // Arrange - организация
            //открыть главную страницу
            //ввести в поле поиска selenide и нажать enter
            //кликнуть на первый репозиторий из списка найденных
            //проверка: заголовок selenide/selenide
        //Act - дествие
        open("https://github.com");
        $("span.flex-1").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$("a").click();

        //Assert - проверка
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));
        sleep(5000);

    }
}
