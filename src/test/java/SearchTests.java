import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        //Open google
        open("https://www.google.com/");

        //Refuse от coockie
        $("#W0wltc > div").click();

        // Type "selenide" 
        $("[name=q]").setValue("selenide").pressEnter();

        //To check that selenide appeared as a result of a search
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

}
