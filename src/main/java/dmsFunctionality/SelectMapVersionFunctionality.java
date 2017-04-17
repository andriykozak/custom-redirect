package dmsFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

/**
 * Created by Andriy on 4/4/2017.
 */

public class SelectMapVersionFunctionality extends AbstractPage {

    public SelectMapVersionFunctionality(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    dmsPageObjects.SetMapPage setMap;

    //Enables MAP 2.0
    public void selectMap20(){
        setMap = new dmsPageObjects.SetMapPage(getWebDriver());
        setMap.doubleClickOnSuperUser();
        waitForJSandJQueryToLoad();
        setMap.openAccessTab();
        setMap.openToolsTab();
        setMap.selectMap2Checkbox();
        setMap.unselectMap1Checkbox();
        setMap.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }

    //Enables MAP 1.0
    public void selectMap10() {
        setMap = new dmsPageObjects.SetMapPage(getWebDriver());
        setMap.doubleClickOnSuperUser();
        setMap.openAccessTab();
        setMap.openToolsTab();
        setMap.unselectMap2Checkbox();
        setMap.selectMap1Checkbox();
        setMap.clickOnSaveButton();
        waitForJSandJQueryToLoad();
    }
}
