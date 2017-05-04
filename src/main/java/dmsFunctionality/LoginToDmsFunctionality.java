package dmsFunctionality;

import data.User;
import dmsPageObjects.LoginDmsPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */
public class LoginToDmsFunctionality extends AbstractFunctionality {

    private LoginDmsPage loginDmsPage;

    //Login to DMS as Supervisor
    public void loginToDmsAsSupervisor(User user) {
        loginDmsPage = new LoginDmsPage(DriverFactory.getDriver());
        loginDmsPage.openLoginDmsPage();
        loginDmsPage.fillUserLogin(user);
        loginDmsPage.fillUserPassword(user);
        loginDmsPage.clickOnSignInButton();
        waitForJSandJQueryToLoad();
    }
}
