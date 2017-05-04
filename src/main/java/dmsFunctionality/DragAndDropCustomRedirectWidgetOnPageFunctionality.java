package dmsFunctionality;

import dmsPageObjects.MapEditorPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/27/2017.
 */
public class DragAndDropCustomRedirectWidgetOnPageFunctionality extends AbstractFunctionality {

    private MapEditorPage mapEditorPage;

    //Drop Custom Redirect widget to the page in MAP 2.0 editor
    public void dragAndDropCustomRedirectWidgetOnPage(){
        mapEditorPage = new MapEditorPage(DriverFactory.getDriver());
        mapEditorPage.openMapEditorPage();
        waitForJSandJQueryToLoad();
        mapEditorPage.clickOnHomePage();
        waitForJSandJQueryToLoad();
        mapEditorPage.addNewPage();
        waitForJSandJQueryToLoad();
        mapEditorPage.clickOnWidgetsLibraryButton();
        waitForJSandJQueryToLoad();
        mapEditorPage.dragAndDropCustomRedirectWidget();
        waitForJSandJQueryToLoad();
        mapEditorPage.activateThePage();
        waitForJSandJQueryToLoad();
    }
}
