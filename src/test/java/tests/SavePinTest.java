package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.PinPage;

public class SavePinTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private PinPage pinPage;
    public String testURL = "https://www.pinterest.com/login/";

    @Test
    public void testSavePin() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        driver.navigate().to(testURL);
        loginPage.login("testiranjeprojekt@gmail.com", "testiranje123");

        PinPage pinPage = new PinPage(driver);
        pinPage.selectPin("//*[@id=\"homefeedGridFadeInTransitionContainer\"]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/a/div/div[1]/div/div/div/div/div/img");

        pinPage.savePin();
        driver.quit();
    }
}
