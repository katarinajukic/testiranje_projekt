package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SearchPage;

public class SearchTest {
    private WebDriver driver;
    private LoginPage loginPage;

    public String testURL = "https://www.pinterest.com/login/";

    @Test
    public void testSearch() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();

        try {
            driver.navigate().to(testURL);
            loginPage = new LoginPage(driver);
            loginPage.login("testiranjeprojekt@gmail.com", "testiranje123");

            SearchPage searchPage = new SearchPage(driver);
            searchPage.enterSearchQuery("how to pass testing 101");
            searchPage.performSearch();
        } finally {
            driver.quit();
        }
    }
}
