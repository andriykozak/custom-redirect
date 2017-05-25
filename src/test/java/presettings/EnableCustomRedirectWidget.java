package presettings;

import data.JQuery;
import data.JQueryRepository;
import data.User;
import data.UserRepository;
import dmsFunctionality.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.AbstractTestCase;
import utility.driver.DriverFactory;


/**
 * Created by Andriy on 1/26/2017.
 */
public class EnableCustomRedirectWidget extends AbstractTestCase {

    private User ixlooSupervisor = UserRepository.getIxlooSupervisor();
    private JQuery jQuery11 = JQueryRepository.getJQuery11();
    private LoginToDmsFunctionality loginToDmsFunctionality;
    private SelectJqueryVersionFunctionality selectJqueryVersionFunctionality;
    private SelectMapVersionFunctionality selectMapVersionFunctionality;
    private SitesPageFunctionality sitesPageFunctionality;
    private MapEditorFunctionality mapEditorFunctionality;
    private WidgetSettingsFunctionality widgetSettingsFunctionality;

    @Test
    public void loginToDms() {
        loginToDmsFunctionality = new LoginToDmsFunctionality();
        selectJqueryVersionFunctionality = new SelectJqueryVersionFunctionality();
        selectMapVersionFunctionality = new SelectMapVersionFunctionality();
        sitesPageFunctionality = new SitesPageFunctionality();
        mapEditorFunctionality = new MapEditorFunctionality();

        loginToDmsFunctionality.loginToDmsAsSupervisor(ixlooSupervisor);
        /*
        selectJqueryVersionFunctionality.setJquery(jQuery11);
        selectMapVersionFunctionality.selectMap20();
        enableCustomRedirectWidgetFunctionality.enableCustomRedirectWidget();
        */
        mapEditorFunctionality.dragAndDropCustomRedirectWidgetOnPage();
    }

    @Test(description = "verify Default Redirect to google.com")
    public void verifyDefaultRedirect(){
        widgetSettingsFunctionality = new WidgetSettingsFunctionality();
        loginToDmsFunctionality = new LoginToDmsFunctionality();
        loginToDmsFunctionality.loginToDmsAsSupervisor(ixlooSupervisor);
        widgetSettingsFunctionality.setDefaultRedirect();
        widgetSettingsFunctionality.openHomePageDWS();
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("www.google"));
    }

    @Test(description = "verify Custom Redirect to google.com")
    public void verifyCustomRedirect(){
        widgetSettingsFunctionality = new WidgetSettingsFunctionality();
        loginToDmsFunctionality = new LoginToDmsFunctionality();
        loginToDmsFunctionality.loginToDmsAsSupervisor(ixlooSupervisor);
        widgetSettingsFunctionality.setCustomRedirect();
        widgetSettingsFunctionality.openHomePageDWS();
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("www.google"));
    }
}
