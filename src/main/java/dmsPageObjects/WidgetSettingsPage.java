package dmsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.AbstractPageObject;
import utility.env.EnvironmentFactory;

/**
 * Created by Andriy on 5/18/2017.
 */
public class WidgetSettingsPage extends AbstractPageObject {

    public WidgetSettingsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    MapEditorPage mapEditorPage = new MapEditorPage(driver);

    @FindBy(xpath = "//*[@class='row']/div[@title='Default redirect']/div/input")
    private WebElement findDefaultRedirectField;

    @FindBy(xpath = "//*[@class='row']/div[@title='Custom Redirect']/div/input")
    private WebElement findCustomRedirectEditorButton;

    @FindBy(xpath = "//*[@class='row']/div/div/input[@data-param='title']")
    private WebElement findTitleField;

    @FindBy(xpath = "//*[@class='row']/div/div/input[@data-param='url_from']")
    private WebElement findRedirectFromField;

    @FindBy(xpath = "//*[@class='row']/div/div/input[@data-param='url_to']")
    private WebElement findRedirectToField;

    @FindBy(xpath = "//*[@title='Add new item']")
    private WebElement findAddNewItemButton;

    @FindBy(xpath = "//*[@class='ui-button-text'][text()='Close']")
    private WebElement findRemoveItemButton;

    @FindBy(xpath = "//*[@class='ui-dialog-buttonset']/button[1]")
    private WebElement findOkButton;


    public void openMapEditorPage(){
        mapEditorPage.openMapEditorPage();
    }

    public void clickOnHomePage(){
        mapEditorPage.clickOnHomePage();
    }

    public void editActivePage(){
        mapEditorPage.editActivePage();
    }

    public void activateThePage(){
        mapEditorPage.activateThePage();
    }

    public void openCustomRedirectWidgetSettings(){
        mapEditorPage.openCustomRedirectWidgetSettings();
    }

    public void openCustomRedirectEditor(){
        findCustomRedirectEditorButton.click();
    }

    public void addNewItem(){
        findAddNewItemButton.click();
    }

    public void removeItem(){
        findRemoveItemButton.click();
    }

    public void clickOkButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(findOkButton).sendKeys("").perform();
    }

    public void fillDefaultRedirect(String defaultRedirectURL){
        findDefaultRedirectField.clear();
        findDefaultRedirectField.sendKeys(defaultRedirectURL);
    }

    public void clearDefaultRedirect() {
        findDefaultRedirectField.clear();
    }

    public void fillTitleField(String titleCustomRedirect){
        findTitleField.clear();
        findTitleField.sendKeys(titleCustomRedirect);
    }

    public void fillRedirectFromField(String redirectFrom){
        findRedirectFromField.clear();
        findRedirectFromField.sendKeys(redirectFrom);
    }

    public void fillRedirectToField(String redirectTo){
        findRedirectToField.clear();
        findRedirectToField.sendKeys(redirectTo);
    }

    public void openHomePageDWS(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString());
    }
}

