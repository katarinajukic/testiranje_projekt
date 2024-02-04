package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PinPage {

    private WebDriver driver;
    private By savePinButton = By.id("gradient");

    public PinPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPin(String pinLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pinElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pinLocator)));
        pinElement.click();
    }

    public void savePin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement savePinElement = wait.until(ExpectedConditions.elementToBeClickable(savePinButton));
        savePinElement.click();
    }
}
