package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    private WebDriver driver;
    private By searchInput = By.xpath("//*[@id=\"searchBoxContainer\"]/div/div/div[2]/input");
    private By searchEnter = By.xpath("//*[@id=\"searchBoxContainer\"]/div/div[1]/div[1]/input");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchQuery(String query) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(searchInput));

        searchBox.clear();
        searchBox.sendKeys(query);
    }

    public void performSearch() {
        driver.findElement(searchEnter).sendKeys(Keys.ENTER);
    }
}
