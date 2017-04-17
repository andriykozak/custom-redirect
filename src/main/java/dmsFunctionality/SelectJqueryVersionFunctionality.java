package dmsFunctionality;

import data.JQuery;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

/**
 * Created by Andriy on 4/4/2017.
 */
public class SelectJqueryVersionFunctionality extends AbstractPage {

    public SelectJqueryVersionFunctionality(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    dmsPageObjects.SetJqueryPage setJquery;

    //Sets jQuery version
    public void setJquery(JQuery jQuery){
        setJquery = new dmsPageObjects.SetJqueryPage(driver);
        setJquery.clickOnEditButton();
        setJquery.setJqueryVersion(jQuery);
        waitForJSandJQueryToLoad();
    }
}
