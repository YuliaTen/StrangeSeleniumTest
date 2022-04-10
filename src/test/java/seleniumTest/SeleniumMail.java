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
        (mp.getIncomeBtn()).shouldBe(visible).click();;
        (mp.getLoginField()).sendKeys(TestData.getLoginMail());
       (mp.getLoginBtn()).shouldBe(visible).click();;
        (mp.getPasswdField()).sendKeys(TestData.getPasswordMail());
        (mp.getLoginBtn()).shouldBe(visible).click();
        waitImage(5000);
        Assertions.assertTrue(mp.getLoginMail().getText().contains(TestData.getLoginMail()));
        mp.getOut().click();
    }
}
