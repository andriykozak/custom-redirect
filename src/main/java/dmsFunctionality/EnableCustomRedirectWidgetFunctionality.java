package dmsFunctionality;

import dmsPageObjects.SitesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

/**
 * Created by Andriy on 4/17/2017.
 */
public class EnableCustomRedirectWidgetFunctionality extends AbstractPage {

    public EnableCustomRedirectWidgetFunctionality(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    private SitesPage sitesPage;

    public void enableCustomRedirectWidget() {
        sitesPage = new SitesPage(driver);
        sitesPage.openSiteEditor();
        waitForJSandJQueryToLoad();
        sitesPage.openWidgetsEditor();
        waitForJSandJQueryToLoad();
        sitesPage.enableCustomRedirectWidgetCheckbox();
        sitesPage.clickOnCloseWindowButton();
        sitesPage.clickOnOkButton();
        waitForJSandJQueryToLoad();
    }
}
