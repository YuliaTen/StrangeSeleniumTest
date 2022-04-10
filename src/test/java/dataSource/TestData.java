package dataSource;

public class TestData {
    static final String LOGIN = "eXVsaWF0ZXN0aXJvdmE";
    static final String PASS = "QXNkTGtqVmJuLTUxMA";
    private static String loginMail = Base64.decode(LOGIN);
    private static String passwordMail = Base64.decode(PASS);
   private static String  startURL = "https://mail.yandex.ru/";

    public static String getStartURL() {
        return startURL;
    }

    public static String getLoginMail() {
        return loginMail;
    }

    public static String getPasswordMail() {
        return passwordMail;
    }
}
