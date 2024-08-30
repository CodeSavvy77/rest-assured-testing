import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllElementsExample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://example.com");

        // Get all elements on the webpage
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));

        // Print the number of elements found
        System.out.println("Total number of elements found: " + allElements.size());

        // Iterate through the list and print each element's tag name and text (if any)
        for (WebElement element : allElements) {
            System.out.println("Tag Name: " + element.getTagName() + ", Text: " + element.getText());
        }

        // Close the browser
        driver.quit();
    }
}
