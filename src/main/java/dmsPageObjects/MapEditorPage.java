package dmsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.AbstractPageObject;
import utility.env.EnvironmentFactory;

import static org.testng.Assert.assertEquals;

/**
 * Created by Andriy on 4/27/2017.
 */
public class MapEditorPage extends AbstractPageObject {

    public MapEditorPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = "div[data-page='index'")
    private WebElement findHomePage;

    @FindBy(css = "div.map-link.pull-right")
    private WebElement findAddNewPageLink;

    @FindBy(xpath = "(//span[@class='ui-button ui-state-default'])[last()]")
    private WebElement findDeleteLastPageButton;

    @FindBy(xpath  = "(//span[@class='mapx-button-ico edit'])[last()]/..")
    private WebElement findEditLastPageButton;

    @FindBy(css = "span.mapx-button-ico.widget")
    private WebElement findWidgetsLibraryButton;

    @FindBy(css = ".ico-widget.widget-custom_redirect")
    private WebElement findCustomRedirectWidget;

    @FindBy(xpath = "//div[@class='mapx-container']/div[2]/main/div/div/div")
    private WebElement findMapPageContainer;

    @FindBy(xpath = "//div[@class='menu-actions']/div/div[5]/div")
    private WebElement findActivateButton;

    public void openMapEditorPage(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString() + "dms/tools/make_a_page_2/");
    }

    public void clickOnHomePage(){
        findHomePage.click();
    }

    public void addNewPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findAddNewPageLink).click().perform();
    }

    public void clickOnWidgetsLibraryButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findWidgetsLibraryButton).click().perform();
    }

    public void dragAndDropCustomRedirectWidget(){
        Actions actions = new Actions(driver);
        StringBuffer verificationErrors = new StringBuffer();
        actions.dragAndDrop(findCustomRedirectWidget, findMapPageContainer).perform();
        try {
            assertEquals("Dropped!", findMapPageContainer.getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    public void activateThePage(){
        findActivateButton.click();
    }
}
