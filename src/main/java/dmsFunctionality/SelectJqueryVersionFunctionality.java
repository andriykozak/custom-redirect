package dmsFunctionality;

import data.JQuery;
import dmsPageObjects.SelectJqueryVersionPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */
public class SelectJqueryVersionFunctionality extends AbstractFunctionality {

    SelectJqueryVersionPage selectJqueryVersionPage;

    //Set jQuery version
    public void setJquery(JQuery jQuery){
        selectJqueryVersionPage = new SelectJqueryVersionPage(DriverFactory.getDriver());
        selectJqueryVersionPage.openSetJqueryPage();
        selectJqueryVersionPage.clickOnEditButton();
        selectJqueryVersionPage.setJqueryVersion(jQuery);
        waitForJSandJQueryToLoad();
    }
}
