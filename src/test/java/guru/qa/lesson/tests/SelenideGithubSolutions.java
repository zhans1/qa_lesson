package guru.qa.lesson.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideGithubSolutions {
    @Test
    void goTest(){
        //На главной странице GitHub выберите меню Solutions ->
        // Enterprize с помощью команды hover для Solutions. Убедитесь
        // что загрузилась нужная страница (например что заголовок - "Build like the best."

        open("https://github.com/");
        $$("div.header-menu-wrapper li").findBy(Condition.text("Solutions")).hover();
        $$("ul.f5 li a").findBy(Condition.text("Enterprise")).click();
        sleep(5000);
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered"));
    }

    @Test
    void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("div#column-a").dragAndDrop(DragAndDropOptions.to($("div#column-b")));
        $("div#column-a").shouldHave(Condition.text("B"));
    }
}