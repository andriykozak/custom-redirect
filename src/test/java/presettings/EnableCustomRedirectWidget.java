package presettings;

import data.JQuery;
import data.JQueryRepository;
import data.User;
import data.UserRepository;
import dmsFunctionality.EnableCustomRedirectWidgetFunctionality;
import dmsFunctionality.LoginToDmsFunctionality;
import dmsFunctionality.SelectJqueryVersionFunctionality;
import dmsFunctionality.SelectMapVersionFunctionality;
import org.testng.annotations.Test;



/**
 * Created by Andriy on 1/26/2017.
 */
public class EnableCustomRedirectWidget extends AbstractTest {

    private User ixlooSupervisor = UserRepository.getIxlooSupervisor();
    private JQuery jQuery11 = JQueryRepository.getJQuery11();
    private LoginToDmsFunctionality loginToDmsFunctionality;
    private SelectJqueryVersionFunctionality selectJqueryVersionFunctionality;
    private SelectMapVersionFunctionality selectMapVersionFunctionality;
    private EnableCustomRedirectWidgetFunctionality enableCustomRedirectWidgetFunctionality;

    @Test
    public void loginToDms() {
        loginToDmsFunctionality = new LoginToDmsFunctionality(driver);
        selectJqueryVersionFunctionality = new SelectJqueryVersionFunctionality(driver);
        selectMapVersionFunctionality = new SelectMapVersionFunctionality(driver);
        enableCustomRedirectWidgetFunctionality = new EnableCustomRedirectWidgetFunctionality(driver);

        driver.get("http://www.andrijk.ixloo.com/dms/login");
        loginToDmsFunctionality.loginToDmsAsSupervisor(ixlooSupervisor);

        driver.get("http://www.andrijk.ixloo.com/dms/settings/website#general");
        selectJqueryVersionFunctionality.setJquery(jQuery11);

        driver.get("http://www.andrijk.ixloo.com/dms/settings/users");
        selectMapVersionFunctionality.selectMap20();

        driver.get("http://www.andrijk.ixloo.com/dms/settings/sites");
        enableCustomRedirectWidgetFunctionality.enableCustomRedirectWidget();
    }
}
