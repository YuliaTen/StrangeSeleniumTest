package seleniumTest;

import dataSource.MailLoginPage;
import dataSource.TestData;
import org.junit.jupiter.api.*;
import static webDriver.MyWebDriver.*;
import static webElement.Condition.visible;

public class SeleniumMail  {

    @BeforeEach
    void setUp(){  open(TestData.getStartURL()); }

    @Test
     void login() throws InterruptedException {
        MailLoginPage mp = new MailLoginPage();
        //нажать войти
        (mp.getIncomeBtn()).shouldBe(visible).click();
        //ввод логина
        (mp.getLoginField()).sendKeys(TestData.getLoginMail());
       (mp.getLoginBtn()).shouldBe(visible).click();
       // ввод пароля
        (mp.getPasswdField()).sendKeys(TestData.getPasswordMail());
        (mp.getLoginBtn()).shouldBe(visible).click();
        // ожидание
        waitImage(10000);
        // проверка соответствия отображаемого логина пользователя с вводимым
        Assertions.assertTrue(mp.getLoginMail().getText().contains(TestData.getLoginMail()));
        //выйти из сервисов Яндекса
        mp.getOut().click();
    }
}
