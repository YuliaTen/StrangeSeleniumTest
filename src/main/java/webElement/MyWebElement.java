package webElement;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import java.util.List;
import static webDriver.MyWebDriver.waitImage;

public class MyWebElement extends RemoteWebElement implements WebElement {

    //расширяем WebElement с помощью паттерна Декоратор для добавления новых методов в текущий функционал
    RemoteWebElement remoteElement;
    public MyWebElement(WebElement remoteElement){
        this.remoteElement = (RemoteWebElement) remoteElement;
    }

    // метод получения видимости у текущего элемента
    public MyWebElement shouldBe(Condition... var1) {
        long startTime = System.currentTimeMillis();
        long timeMs=0;
        do{
            if (this.isDisplayed()) { return this;}
            timeMs = System.currentTimeMillis() - startTime;
            waitImage(5000);
        }
        while (this.isDisplayed() || (timeMs - startTime) >= 60000);
        System.out.println("элемент был не найден в зоне видимости");
        return this;
    }

    @Override
    public void click() {remoteElement.click(); }

    @Override
    public void submit() { }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        remoteElement.sendKeys(keysToSend);
    }

    @Override
    public void clear() { }

    @Override
    public String getTagName() { return null; }

    @Override
    public String getAttribute(String name) { return null; }

    @Override
    public boolean isSelected() {return false; }

    @Override
    public boolean isEnabled() {return false; }

    @Override
    public String getText() { return remoteElement.getText(); }

    @Override
    public List<WebElement> findElements(By by) {return null;  }

    @Override
    public MyWebElement findElement(By by) { return new MyWebElement(remoteElement.findElement(by)); }

    @Override
    public boolean isDisplayed() { return remoteElement.isDisplayed(); }

    @Override
    public Point getLocation() {return null; }

    @Override
    public Dimension getSize() { return null; }

    @Override
    public Rectangle getRect() {return null; }

    @Override
    public String getCssValue(String propertyName) { return null; }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException { return null;}
}
