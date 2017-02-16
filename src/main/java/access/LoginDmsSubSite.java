package access;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Andriy on 2/7/2017.
 */
public class LoginDmsSubSite {

    public static void loginDmsAsSupervisor(){
        open("http://mister.andrijk.ixloo.com/dms/login");
        $(byTitle("Login - Dealer Management System V9"));
        $(byId("login")).setValue("andriykozak");
        $(byId("password")).setValue("andriykozak123").pressEnter();
        $(byTitle("Home - Dealer Management System V9"));
        sleep(3000);
        Configuration.holdBrowserOpen = true;
    }
}
