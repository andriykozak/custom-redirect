package dmsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.AbstractPageObject;
import utility.env.EnvironmentFactory;

/**
 * Created by Andriy on 4/17/2017.
 */
public class SitesPage extends AbstractPageObject {


    public SitesPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//li[@id='site_79']/a")
    private WebElement findSite;

    @FindBy(id = "site_widgets_open")
    private WebElement findWidgetsEditor;

    @FindBy(id = "site_pages_open")
    private WebElement findPagesEditor;

    @FindBy(id = "dws_custom_redirect")
    private WebElement findRedirectWidgetCheckbox;

    @FindBy(linkText = "close")
    private WebElement closeWindowButton;

    @FindBy(xpath = "//div[@class='ui-dialog-buttonset']//button[.='Ok']")
    private WebElement findOkButton;

    public void openSitesPage(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString() + "dms/settings/sites/");
    }

    public void openSiteEditor(){
        Actions action = new Actions(driver);
        findSite.sendKeys("");
        action.doubleClick(findSite).perform();
    }

    public void openWidgetsEditor(){
        findWidgetsEditor.click();
    }

    public void enableCustomRedirectWidgetCheckbox(){
        if (!findRedirectWidgetCheckbox.isSelected()) {
            findRedirectWidgetCheckbox.click();
        }
    }

    public void clickOnCloseWindowButton(){
        closeWindowButton.click();
    }

    public void clickOnOkButton(){
        findOkButton.click();
    }
}
