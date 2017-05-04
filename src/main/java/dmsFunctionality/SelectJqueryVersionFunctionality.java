package dmsFunctionality;

import data.JQuery;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */
public class SelectJqueryVersionFunctionality extends AbstractFunctionality {

    dmsPageObjects.SetJqueryPage setJquery;

    //Set jQuery version
    public void setJquery(JQuery jQuery){
        setJquery = new dmsPageObjects.SetJqueryPage(DriverFactory.getDriver());
        setJquery.openSetJqueryPage();
        setJquery.clickOnEditButton();
        setJquery.setJqueryVersion(jQuery);
        waitForJSandJQueryToLoad();
    }
}
