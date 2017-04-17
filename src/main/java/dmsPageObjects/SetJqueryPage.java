package dmsPageObjects;

import data.JQuery;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import utility.PropertyLoader;

/**
 * Created by Andriy on 1/27/2017.
 */
public class SetJqueryPage extends AbstractPage {

    public SetJqueryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    String jQueryUrl = PropertyLoader.loadProperty("superdms.url") + "/settings/website#general";
    String jQueryVersion = PropertyLoader.loadProperty("jquery11");

    @FindBy(xpath = "//tr[@id='jquery_version']//a[.='Edit']")
    private WebElement editButton;

    @FindBy(css = "input[name='jquery_version']")
    private WebElement jQueryInput;

    public void clickOnEditButton(){
        editButton.click();
    }

    public void setJqueryVersion(JQuery jQuery){
        jQueryInput.clear();
        jQueryInput.sendKeys(jQuery.getjQuery());
        jQueryInput.sendKeys(Keys.RETURN);
    }
}

