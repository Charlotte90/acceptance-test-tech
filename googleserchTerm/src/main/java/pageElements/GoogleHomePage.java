package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BasePage{

    private By textAreaLocator = By.id("lst-ib");
    private By searchButtonLocator = By.name("btnK");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }



    public SearchResultPage searchFor(String termToBeSearched) {
        WebElement googleTextBox = driver.findElement(textAreaLocator);
        googleTextBox.sendKeys(termToBeSearched);
        googleTextBox.sendKeys(Keys.TAB);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(searchButtonLocator)));
        //Click on searchButton
        driver.findElement(searchButtonLocator).click();
        return new SearchResultPage(driver);
    }
}
