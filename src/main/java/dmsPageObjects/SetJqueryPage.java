package dmsPageObjects;

import data.JQuery;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.AbstractPageObject;
import utility.env.EnvironmentFactory;

/**
 * Created by Andriy on 1/27/2017.
 */
public class SetJqueryPage extends AbstractPageObject {

    public SetJqueryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//tr[@id='jquery_version']//a[.='Edit']")
    private WebElement findEditButton;

    @FindBy(css = "input[name='jquery_version']")
    private WebElement findJqueryInput;

    public void openSetJqueryPage(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString() + "dms/settings/website#general/");
    }

    public void clickOnEditButton(){
        findEditButton.click();
    }

    public void setJqueryVersion(JQuery jQuery){
        findJqueryInput.clear();
        findJqueryInput.sendKeys(jQuery.getjQuery());
        findJqueryInput.sendKeys(Keys.RETURN);
    }
}

