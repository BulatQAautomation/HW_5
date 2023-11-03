import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void goToSolutionsDropDownTest(){
        open("https://github.com");
        $("ul.d-lg-flex.list-style-none").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("#js-global-screen-reader-notice").shouldHave(text("The AI Powered Developer Platform."));
    }
}
