package dmsPageObjects;

import data.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import utility.PropertyLoader;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class LoginDmsPage extends AbstractPage {

    public LoginDmsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    private String loginUrl = PropertyLoader.loadProperty("superdms.url");
    private String login = PropertyLoader.loadProperty("super.login");
    private String password = PropertyLoader.loadProperty("super.pw");

    @FindBy(how = How.ID, using = "login")
    private WebElement loginInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.ID, using = "login2")
    private WebElement signInButton;

    public void fillUserLogin(User user){
        loginInput.clear();
        loginInput.sendKeys(user.getLogin());
    }

    public void fillUserPassword(User user){
        passwordInput.clear();
        passwordInput.sendKeys(user.getPassword());
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }
}
