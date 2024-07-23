package waiters;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    private WebDriver driver;

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition condition) { //вешаем ожидание
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(condition);
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }

}
