package dataSource;

import webElement.MyWebElement;
import static webDriver.MyWebDriver.$;
import static webDriver.MyWebDriver.$x;

public class MailLoginPage  {

    // получение элемента по кнопке Войти на стартовой странице
    public MyWebElement getIncomeBtn() {
        return  $x("//a[@class = 'control button2 button2_view_classic button2_size_mail-big button2_theme_mail-white button2_type_link HeadBanner-Button HeadBanner-Button-Enter with-shadow']");
    }

    // получение элемента для ввода логина
    public MyWebElement getLoginField() { return $("#passp-field-login"); }

    // получение элемента для ввода пароля
    public MyWebElement getPasswdField() {
        return $("#passp-field-passwd");
    }

    // получение элемента по кнопке Войти
    public MyWebElement getLoginBtn() {
        return $x("//button[@id='passp:sign-in']");
    }

    // получение элемента Логина внутри почты
    public MyWebElement getLoginMail(){ return  $x("//a[@class='user-account user-account_left-name user-account_has-ticker_yes user-account_has-accent-letter_yes count-me legouser__current-account legouser__current-account i-bem']//span[@class='user-account__name']");}

    //получение элемента Выйти из сервисов Яндекса
    public MyWebElement getOut() {
        $x("//div[@class='user-pic user-pic_has-plus_ user-account__pic']//img[@src='https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle']").click();
        return  $x("//a[@class='menu__item menu__item_type_link count-me legouser__menu-item legouser__menu-item_action_exit legouser__menu-item legouser__menu-item_action_exit']");
    }
}
