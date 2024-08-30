import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverExceptionsHandling {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize browser window
            driver.manage().window().maximize();
            // Set implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Navigate to a webpage
            driver.get("https://example.com");

            // 1. NoSuchElementException
            try {
                WebElement element = driver.findElement(By.id("non-existent-element"));
                element.click();
            } catch (NoSuchElementException e) {
                System.out.println("NoSuchElementException caught: " + e.getMessage());
            }

            // 2. TimeoutException
            try {
                WebElement element = driver.findElement(By.id("slow-loading-element"));
                element.click();
            } catch (TimeoutException e) {
                System.out.println("TimeoutException caught: " + e.getMessage());
            }

            // 3. StaleElementReferenceException
            try {
                WebElement staleElement = driver.findElement(By.id("stale-element"));
                driver.navigate().refresh(); // Refreshing causes the element to go stale
                staleElement.click();
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException caught: " + e.getMessage());
            }

            // 4. ElementNotInteractableException
            try {
                WebElement hiddenElement = driver.findElement(By.id("hidden-element"));
                hiddenElement.click();
            } catch (ElementNotInteractableException e) {
                System.out.println("ElementNotInteractableException caught: " + e.getMessage());
            }

            // 5. ElementClickInterceptedException
            try {
                WebElement element = driver.findElement(By.id("intercepted-element"));
                element.click();
            } catch (ElementClickInterceptedException e) {
                System.out.println("ElementClickInterceptedException caught: " + e.getMessage());
            }

            // 6. NoAlertPresentException
            try {
                driver.switchTo().alert().accept(); // Switch to an alert that is not present
            } catch (NoAlertPresentException e) {
                System.out.println("NoAlertPresentException caught: " + e.getMessage());
            }

            // 7. WebDriverException
            try {
                WebElement element = driver.findElement(By.id("element"));
                element.click();
            } catch (WebDriverException e) {
                System.out.println("WebDriverException caught: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            // Clean up
            driver.quit();
        }
    }
}
