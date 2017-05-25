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
    private static String defaultRedirectUrl;
    private static String titleCustomRedirect;
    private static String redirectFrom;
    private static String redirectTo;

    public static void getProperties() {
        bundle = ResourceBundle.getBundle("customredirect");
        browserName = bundle.getString("browser.type");
        implicitWait = Integer.parseInt(bundle.getString("implicit.wait"));
        baseUrl = bundle.getString("base.url");
        defaultRedirectUrl = bundle.getString("default.redirect");
        titleCustomRedirect = bundle.getString("title.custom.redirect");
        redirectFrom = bundle.getString("redirect.from");
        redirectTo = bundle.getString("redirect.to");
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

    //Get default redirect URL from properties
    public static String getDefaultRedirectURL(){
        getProperties();
        return defaultRedirectUrl;
    }

    //Get title of custom redirect from properties
    public static String getTitleCustomRedirect(){
        getProperties();
        return titleCustomRedirect;
    }

    //Get Redirect FROM for custom redirect, from properties
    public static String getRedirectFrom(){
        getProperties();
        return redirectFrom;
    }

    //Get Redirect TO for custom redirect, from properties
    public static String getRedirectTo(){
        getProperties();
        return redirectTo;
    }
}
