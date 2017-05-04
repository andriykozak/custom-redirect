package utility;

import utility.driver.BrowserType;
import utility.env.Environment;
import java.util.ResourceBundle;

/**
 * Created by Andriy on 13.04.2017.
 */
public class PropertyManager {

    private static ResourceBundle bundle;
    private static String browserName;
    private static int implicitWait;
    private static String baseUrl;

    public static void getProperties() {
        bundle = ResourceBundle.getBundle("customredirect");
        browserName = bundle.getString("browser.type");
        implicitWait = Integer.parseInt(bundle.getString("implicit.wait"));
        baseUrl = bundle.getString("base.url");
    }

    //Get browser type from properties
    public static BrowserType getBrowserType() {
        getProperties();

        BrowserType returnBrowserType = null;

        for (BrowserType browserType : BrowserType.values()) {
            if (browserName.equalsIgnoreCase(browserType.toString())) {
                returnBrowserType = browserType;
                break;
            }
        }
        return returnBrowserType;
    }

    //Get implicit wait from properties
    public static int getImplicitWait(){
        getProperties();
        return implicitWait;
    }

    //Get base URL from properties
    public static Environment getUrl() {
        getProperties();

        Environment returnEnvironment = null;

        for (Environment environment : Environment.values()) {
            if (baseUrl.equalsIgnoreCase(environment.name())) {
                returnEnvironment = environment;
                break;
            }
        }
        return returnEnvironment;
    }

}
