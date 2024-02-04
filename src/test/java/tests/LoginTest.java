package tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    public String testURL = "https://www.pinterest.com/login/";

    @Before
    public void setUp() {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        driver.navigate().to(testURL);

    }

    @Test
    public void testLogin() {
        loginPage.login("testiranjeprojekt@gmail.com", "testiranje123");

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
