import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksChecker {

    public static void main(String[] args) {
        // Set up WebDriver (example with ChromeDriver)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the desired webpage
        driver.get("http://saucedemo.com/");

        // Get all links on the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Check each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Check if the URL is valid and not null or empty
            if (url != null && !url.isEmpty()) {
                verifyLink(url);
            } else {
                System.out.println("Invalid URL: " + url);
            }
        }

        // Close the browser
        driver.quit();
    }

    // Method to verify link by sending an HTTP request
    public static void verifyLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(linkUrl + " - Broken link, response code: " + httpURLConnection.getResponseCode());
            }

        } catch (Exception e) {
            System.out.println(linkUrl + " - Exception: " + e.getMessage());
        }
    }
}
