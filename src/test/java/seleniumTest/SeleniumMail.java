package seleniumTest;

import dataSource.MailLoginPage;
import dataSource.TestData;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static webDriver.MyWebDriver.*;


public class SeleniumMail  {


    @BeforeEach
    void setUp(){

        open(TestData.getStartURL());
    }

    @Test
     void login() throws InterruptedException {
        MailLoginPage mp = new MailLoginPage();
        (mp.getIncomeBtn()).click();
        (mp.getLoginField()).sendKeys(TestData.getLOGIN());
        (mp.getLoginBtn()).click();
        (mp.getPasswdField()).sendKeys(TestData.getPASS());
        (mp.getLoginBtn()).click();
        //ожидание почему то не срабатывает, если он видит, тест проходит, если почта грузится он почему то не ждет
        // не могу понять почему
        waitImage();
        //Assertions.assertTrue(mp.getLoginMail().getText().contains(TestData.getLOGIN()));
        mp.getOut().click();
    }
}
