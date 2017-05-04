package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import utility.driver.DriverFactory;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;


/**
 * Created by Home on 28.01.2017.
 */
public class AbstractFunctionality {

    //wait for JS and jQuery to load
    public boolean waitForJSandJQueryToLoad() {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(DriverFactory.getDriver());
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(60, TimeUnit.SECONDS);

        //method for execute Java Script: page should be loaded
        Function<WebDriver, Boolean> jsLoad = new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };

        // wait for jQuery to load
        Function<WebDriver, Boolean> jQueryLoad = new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
                } catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }
}
