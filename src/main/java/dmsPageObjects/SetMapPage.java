package dmsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.AbstractPageObject;
import utility.env.EnvironmentFactory;

/**
 * Created by Andriy on 3/6/2017.
 */
public class SetMapPage extends AbstractPageObject {

    public SetMapPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//li[@id='user_13811']/a")
    private WebElement findSuperUser;

    @FindBy(id = "user_editor_tab4")
    private WebElement findAccessTab;

    @FindBy(id = "go_9")
    private WebElement findToolsTab;

    @FindBy(id = "addon_make_a_page_2")
    private WebElement findMap2Checkbox;

    @FindBy(id = "addon_make_a_page")
    private WebElement findMap1Checkbox;

    @FindBy(linkText = "Save")
    private WebElement saveButton;

    public void openSetMapPage(){
        driver.get(EnvironmentFactory.chooseEnvironment().toString() + "dms/settings/users/");
    }

    public void doubleClickOnSuperUser() {
        Actions action = new Actions(driver);
        findSuperUser.sendKeys("");
        action.doubleClick(findSuperUser).perform();
    }

    public void openAccessTab() {
        findAccessTab.click();
    }

    public void openToolsTab() {
        findToolsTab.click();
    }

    public void selectMap2Checkbox() {
        if (!findMap2Checkbox.isSelected()) {
            findMap2Checkbox.click();
        }
    }

    public void unselectMap2Checkbox() {
        if (findMap2Checkbox.isSelected()) {
            findMap2Checkbox.click();
        }
    }

    public void selectMap1Checkbox() {
        if (!findMap2Checkbox.isSelected()) {
            findMap2Checkbox.click();
        }
    }

    public void unselectMap1Checkbox() {
        if (findMap1Checkbox.isSelected()) {
            findMap1Checkbox.click();
        }
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }
}
