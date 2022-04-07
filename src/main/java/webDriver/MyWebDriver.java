package webDriver;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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



    public static WebElement $x(String xpathExpression) {
        return driver.findElement(By.xpath(xpathExpression));
    }

    public static WebElement $(String css) {
        return driver.findElement(By.cssSelector(css));
    }

    public static void waitImage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void afterEach(ExtensionContext extensionContext) throws Exception {
        driver.quit();
    }
}
