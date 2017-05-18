package dmsFunctionality;

import dmsPageObjects.SitesPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/17/2017.
 */
public class SitesPageFunctionality extends AbstractFunctionality {

    private SitesPage sitesPage;

    //Enable Custom Redirect widget in Administration
    public void enableCustomRedirectWidget() {
        sitesPage = new SitesPage(DriverFactory.getDriver());
        sitesPage.openSitesPage();
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
