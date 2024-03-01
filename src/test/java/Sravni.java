import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Sravni {
    @Test
    public void avtorizatsiya() {
        open("https://www.sravni.ru/");
        $(new ByTextCaseInsensitive("Войти")).click();
        switchTo().window(1);
        $x("//a[contains(@href, \"signin/email\")]").click();
        $x("//input[@name='email']").setValue("redison00x@mail.ru");
        $x("//input[@name='password']").setValue("bestPROGRAMMIST228");
        $x("//span[@class=\"_hp2bt3\"]").click();
        switchTo().window(0);
        $x("//div[@class=\"page_wrapper__Yk7Um\"]").shouldBe(Condition.visible);
    }
}