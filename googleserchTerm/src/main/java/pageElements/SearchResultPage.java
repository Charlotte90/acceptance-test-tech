package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage extends BasePage{
    private By zaraHomePagelink = By.linkText("ZARA United Kingdom - Official Website");
    private By resultId = By.id("ires");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }





    public boolean validateResult(String expectedResult) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(resultId)));

        for(WebElement element : driver.findElement(resultId).findElements(By.tagName("a"))){
            if(element.getText().toLowerCase().contains(expectedResult.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public boolean validatePage() {
        for(WebElement element : driver.findElement(By.id("navcnt")).findElements(By.tagName("a"))){
            if(!element.getAttribute("aria-label").contains("Page 1"))continue;
            return true;
        }
        return false;
    }
}
