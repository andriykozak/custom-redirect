package dmsFunctionality;

import dmsPageObjects.WidgetSettingsPage;
import utility.AbstractFunctionality;
import utility.PropertyManager;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 5/18/2017.
 */
public class WidgetSettingsFunctionality extends AbstractFunctionality {

    private WidgetSettingsPage widgetSettingsPage;

    public void setDefaultRedirect(){
        widgetSettingsPage = new WidgetSettingsPage(DriverFactory.getDriver());
        widgetSettingsPage.openMapEditorPage();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.clickOnHomePage();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.editActivePage();
        widgetSettingsPage.openCustomRedirectWidgetSettings();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.fillDefaultRedirect(PropertyManager.getDefaultRedirectURL());
        widgetSettingsPage.clickOkButton();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.activateThePage();
        waitForJSandJQueryToLoad();
    }

    public void setCustomRedirect(){
        widgetSettingsPage = new WidgetSettingsPage(DriverFactory.getDriver());
        widgetSettingsPage.openMapEditorPage();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.clickOnHomePage();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.editActivePage();
        widgetSettingsPage.openCustomRedirectWidgetSettings();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.clearDefaultRedirect();
        widgetSettingsPage.openCustomRedirectEditor();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.fillTitleField(PropertyManager.getTitleCustomRedirect());
        widgetSettingsPage.fillRedirectFromField(PropertyManager.getRedirectFrom());
        widgetSettingsPage.fillRedirectToField(PropertyManager.getRedirectTo());
        widgetSettingsPage.clickOkButton();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.clickOkButton();
        waitForJSandJQueryToLoad();
        widgetSettingsPage.activateThePage();
        waitForJSandJQueryToLoad();
    }

    public void openHomePageDWS(){
        widgetSettingsPage.openHomePageDWS();
        waitForJSandJQueryToLoad();
    }
}
