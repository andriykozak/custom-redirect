package dmsFunctionality;

import dmsPageObjects.WidgetSettingsPage;
import utility.AbstractFunctionality;

/**
 * Created by Andriy on 5/18/2017.
 */
public class WidgetSettingsFunctionality extends AbstractFunctionality {

    private WidgetSettingsPage widgetSettingsPage;

    public void setDefaultRedirect(){
        widgetSettingsPage.openMapEditorPage();
        widgetSettingsPage.clickOnHomePage();
        widgetSettingsPage.editActivePage();
        widgetSettingsPage.openCustomRedirectWidgetSettings();
        widgetSettingsPage.fillDefaultRedirect();
        widgetSettingsPage.clickOkButton();
        widgetSettingsPage.activateThePage();
    }
}
