package dmsFunctionality;

import data.User;
import dmsPageObjects.LoginToDmsPage;
import utility.AbstractFunctionality;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 4/4/2017.
 */
public class LoginToDmsFunctionality extends AbstractFunctionality {

    private LoginToDmsPage loginToDmsPage;

    //Login to DMS as Supervisor
    public void loginToDmsAsSupervisor(User user) {
        loginToDmsPage = new LoginToDmsPage(DriverFactory.getDriver());
        loginToDmsPage.openLoginDmsPage();
        loginToDmsPage.fillUserLogin(user);
        loginToDmsPage.fillUserPassword(user);
        loginToDmsPage.clickOnSignInButton();
        waitForJSandJQueryToLoad();
    }
}
