import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String filePath) {
        // Cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Capture screenshot as a file
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        try {
            // Copy the screenshot file to the specified path
            FileHandler.copy(screenshot, new File(filePath));
        } catch (IOException e) {
            System.out.println("Error while saving screenshot: " + e.getMessage());
        }
    }
}
