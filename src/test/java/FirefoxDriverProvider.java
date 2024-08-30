import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverProvider implements WebDriverProvider {
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}