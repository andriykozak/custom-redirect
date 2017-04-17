package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;


/**
 * Created by Home on 28.01.2017.
 */
public class AbstractPage {

    //объявление класса
    //   private static final Logger LOG = LogFactory.getLogger(Page.class);

    protected WebDriver driver; //объявление переменной driver класса WebDriver доступна классам потомкам

	/*
     * Constructor injecting the WebDriver interface
	 *
	 * @param webDriver
	 */

    public AbstractPage(WebDriver webDriver) {
        this.driver = webDriver;
    } //конструктор класса принимает на входе переменную класса WebDriver возвращает класс

    public WebDriver getWebDriver() {
        return driver;
    } //метод getWebDriver() возвращает переменную driver

    public String getTitle() {
        return driver.getTitle();
    } //метод getTitle() возвращает заголовок страницы

    public String getPageUrl() {               //метод getPageUrl() возвращает текуший URL
        String pageUrl = driver.getCurrentUrl();
        //      LOG.info("Current page url is: " + pageUrl);
        return pageUrl;
    }

    public boolean waitForJSandJQueryToLoad() {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(60, TimeUnit.SECONDS);

        /*method for execute Java Script: page should be loaded*/
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
