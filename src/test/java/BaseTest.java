import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected Logger logger = new Logger();

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
}

