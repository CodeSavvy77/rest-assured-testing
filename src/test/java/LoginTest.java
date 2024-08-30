import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("user");
        loginPage.enterPassword("pass");
        loginPage.clickLogin();
        // Add assertions here
    }
}
