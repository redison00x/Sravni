import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Sravni {
    @Test
    public void avtorizatsiya() {
        open("https://www.sravni.ru/");
        $(new ByTextCaseInsensitive("Войти")).click();
        $x("//a[contains(@href, '/signin/email')]").click();

    }
}