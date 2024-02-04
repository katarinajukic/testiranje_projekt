package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("//*[@id='mweb-unauth-container']/div/div[3]/div/div/div[3]/form/div[7]/button/div");

    private By accountMenuButton = By.xpath("//*[@id='HeaderContent']/div/div/div[2]/div/div/div/div[5]/div[5]/div/div/button/div/div");
    private By logoutButton = By.xpath("//*[@id='HeaderAccountOptionsFlyout-item-12']/div/div/div[1]/div/div");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public void clickAccountMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(accountMenuButton)).click();
    }

    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(logoutButton)).click();
    }
}
