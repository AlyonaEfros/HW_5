import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideActionsTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void dragAndDrop (){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-b").dragAndDropTo($("#column-a"));
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
        sleep(5000);
    }

}
