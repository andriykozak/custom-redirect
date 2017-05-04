package utility.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utility.PropertyManager;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andriy on 13.04.2017.
 */
public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory(){

    }

    //Initialize a WebDriver, takes it from properties
    public static WebDriver getDriver(){
        if(driver == null){
            switch (PropertyManager.getBrowserType()){
                case FIREFOX:
                    //System.setProperty("webdriver.gecko.driver", "path to geckodriver");
                    driver = new FirefoxDriver();
                    break;
                case CHROME:
                    //System.setProperty("webdriver.chromedriver.driver", "path to geckodriver");
                    driver = new ChromeDriver();
                    break;
                case EXPLORER:
                    //System.setProperty("geckodriver", "path to geckodriver");
                    driver = new InternetExplorerDriver();
                    break;
            }
            setTimeOuts();
        }
        return driver;
    }

    //Set timeouts from properties and give it for getWedriver method
    public static WebDriver setTimeOuts(){
        driver.manage().timeouts().implicitlyWait(PropertyManager.getImplicitWait(), TimeUnit.SECONDS);
        return driver;
    }

    //Close the Webdriver
    public static void closeDriver(){
        if(driver != null){
            driver.close();
            driver.quit();

            driver = null;
        }
    }
}
