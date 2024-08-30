import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private WebDriver driver;

    // This method is called when a test method starts
    @Override
    public void onTestStart(ITestResult result) {
        // Initialize WebDriver here or get it from a test setup method
    }

    // This method is called when a test method finishes
    @Override
    public void onTestSuccess(ITestResult result) {
        // Handle test success (if needed)
    }

    // This method is called when a test method fails
    @Override
    public void onTestFailure(ITestResult result) {
        // Capture screenshot on test failure
        String filePath = "path/to/screenshots/" + result.getMethod().getMethodName() + ".png";
        ScreenshotUtil.takeScreenshot(driver, filePath);
    }

    // This method is called when a test method is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        // Handle test skip (if needed)
    }

    // This method is called when the test suite starts
    @Override
    public void onStart(ITestContext context) {
        // Initialize WebDriver or any setup before tests start
    }

    // This method is called when the test suite finishes
    @Override
    public void onFinish(ITestContext context) {
        // Cleanup WebDriver or any teardown after tests finish
    }
}
