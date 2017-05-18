package dmsFunctionality;

import dmsPageObjects.SelectMapVersionPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */

public class SelectMapVersionFunctionality extends AbstractFunctionality {


    SelectMapVersionPage selectMapVersionPage;

    //Enable MAP 2.0
    public void selectMap20(){
        selectMapVersionPage = new SelectMapVersionPage(DriverFactory.getDriver());
        selectMapVersionPage.openSetMapPage();
        selectMapVersionPage.doubleClickOnSuperUser();
        waitForJSandJQueryToLoad();
        selectMapVersionPage.openAccessTab();
        selectMapVersionPage.openToolsTab();
        selectMapVersionPage.selectMap2Checkbox();
        selectMapVersionPage.unselectMap1Checkbox();
        selectMapVersionPage.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }

    //Enable MAP 1.0
    public void selectMap10() {
        selectMapVersionPage = new SelectMapVersionPage(DriverFactory.getDriver());
        selectMapVersionPage.doubleClickOnSuperUser();
        selectMapVersionPage.openAccessTab();
        selectMapVersionPage.openToolsTab();
        selectMapVersionPage.unselectMap2Checkbox();
        selectMapVersionPage.selectMap1Checkbox();
        selectMapVersionPage.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }
}
