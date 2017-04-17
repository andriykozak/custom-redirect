package dmsFunctionality;

import data.User;
import dmsPageObjects.LoginDmsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

/**
 * Created by Andriy on 4/4/2017.
 */
public class LoginToDmsFunctionality extends AbstractPage {

    public LoginToDmsFunctionality(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    private LoginDmsPage loginDmsPage;

    //Login to DMS as Supervisor
    public void loginToDmsAsSupervisor(User user) {
        loginDmsPage = new LoginDmsPage(driver);
        loginDmsPage.fillUserLogin(user);
        loginDmsPage.fillUserPassword(user);
        loginDmsPage.clickOnSignInButton();
        waitForJSandJQueryToLoad();
    }
}
