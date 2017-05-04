package dmsFunctionality;

import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */

public class SelectMapVersionFunctionality extends AbstractFunctionality {


    dmsPageObjects.SetMapPage setMap;

    //Enable MAP 2.0
    public void selectMap20(){
        setMap = new dmsPageObjects.SetMapPage(DriverFactory.getDriver());
        setMap.openSetMapPage();
        setMap.doubleClickOnSuperUser();
        waitForJSandJQueryToLoad();
        setMap.openAccessTab();
        setMap.openToolsTab();
        setMap.selectMap2Checkbox();
        setMap.unselectMap1Checkbox();
        setMap.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }

    //Enable MAP 1.0
    public void selectMap10() {
        setMap = new dmsPageObjects.SetMapPage(DriverFactory.getDriver());
        setMap.doubleClickOnSuperUser();
        setMap.openAccessTab();
        setMap.openToolsTab();
        setMap.unselectMap2Checkbox();
        setMap.selectMap1Checkbox();
        setMap.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }
}
