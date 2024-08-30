import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProvider implements WebDriverProvider {
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
