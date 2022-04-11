package webDriver;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webElement.MyWebElement;
import java.util.concurrent.TimeUnit;

public class MyWebDriver implements AfterEachCallback {
    public static WebDriver driver ;

    public static void open(String link) {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(link);
    }

    //ожидание отображения
    public static void waitImage(long mlSec){
        try {
            Thread.sleep(mlSec);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //метод имитирующий вызов функции поиска по xpath Selenide
    public  static MyWebElement $x(String xpathExpression) {
        return new MyWebElement(driver.findElement(By.xpath(xpathExpression)));
    }

    //метод имитирующий вызов функции поиска по cssSelector Selenide
    public static MyWebElement $(String css) {
        return new MyWebElement(driver.findElement(By.cssSelector(css)));
    }


    public void afterEach(ExtensionContext extensionContext) throws Exception {
        driver.quit();
    }
}
