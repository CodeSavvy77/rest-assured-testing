import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumWaitsExample {
    public static void main(String[] args) {
        // Set up WebDriver and navigate to the web page
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // 1. Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Example usage of Implicit Wait
        WebElement element1 = driver.findElement(By.id("element-id"));

        // 2. Explicit Wait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Example usage of Explicit Wait
        WebElement element2 = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id")));

        // 3. Fluent Wait
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))  // Total time to wait
                .pollingEvery(Duration.ofSeconds(2)) // Frequency of checking condition
                .ignoring(NoSuchElementException.class); // Ignore specific exceptions

        // Example usage of Fluent Wait
        WebElement element3 = fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("element-id")));

        // Continue with further actions on the elements
        element1.click();
        element2.sendKeys("Some text");
        element3.submit();

        // Clean up
        driver.quit();
    }
}
