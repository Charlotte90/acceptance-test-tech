package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsers {

    private static WebDriver driver;


    public WebDriver initiliaseBrowser(){
        String chromePath = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--enable-javascript");
        driver= new ChromeDriver(options);
        return driver;
    }


    public static WebDriver getDriver(){
        return driver;
    }


    public void closeBrowser(){
        if(driver!= null)
            driver.quit();
    }

}
