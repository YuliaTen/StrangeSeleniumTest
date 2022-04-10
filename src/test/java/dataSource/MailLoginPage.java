package dataSource;

import webElement.MyWebElement;
import static webDriver.MyWebDriver.$;
import static webDriver.MyWebDriver.$x;

public class MailLoginPage  {

    public MyWebElement getIncomeBtn() {
        return  $x("//a[@class = 'control button2 button2_view_classic button2_size_mail-big button2_theme_mail-white button2_type_link HeadBanner-Button HeadBanner-Button-Enter with-shadow']");
    }

    public MyWebElement getLoginField() { return $("#passp-field-login"); }

    public MyWebElement getPasswdField() {
        return $("#passp-field-passwd");
    }

    public MyWebElement getLoginBtn() {
        return $x("//button[@id='passp:sign-in']");
    }

    public MyWebElement getLoginMail(){ return  $x("//a[@class='user-account user-account_left-name user-account_has-ticker_yes user-account_has-accent-letter_yes count-me legouser__current-account legouser__current-account i-bem']//span[@class='user-account__name']");}

    public MyWebElement getOut() {
        $x("//div[@class='user-pic user-pic_has-plus_ user-account__pic']//img[@src='https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle']").click();
        return  $x("//a[@class='menu__item menu__item_type_link count-me legouser__menu-item legouser__menu-item_action_exit legouser__menu-item legouser__menu-item_action_exit']");
    }
}
