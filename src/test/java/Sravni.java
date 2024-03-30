import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;


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
    @Test
    public void osago() {
        Configuration.pageLoadTimeout = 3000;
        open("https://www.rgs.ru/auto/osago");
        assertEquals (title(), "ОСАГО онлайн: калькулятор еОСАГО", "Не тудой приперся");
        Selenide.Wait().until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='action-item btn--basic']"))).click();

        //switchTo().frame($x("//*[@id='RESOLUTE_INSURANCE']"));

        //$x("//div[contains(text(),'Легковые ТС')]").click();
        //$x("//div[text()='Легковые ТС (B)']").click();


        //$x("//input[@aria-invalid='true']").setValue("89,00");


        //$(new ByTextCaseInsensitive("л.с.")).click();
        //$x("//div[text()='л.с.']").click();




    }
}