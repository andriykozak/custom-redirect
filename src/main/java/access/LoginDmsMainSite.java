package access;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Andriy on 1/27/2017.
 */
public class LoginDmsMainSite {

    public static void loginDmsAsSupervisor(){
        open("http://andrijk.ixloo.com/dms/login");
        $(byTitle("Login - Dealer Management System V9"));
        $(byId("login")).setValue("andriykozak");
        $(byId("password")).setValue("andriykozak123").pressEnter();
        $(byTitle("Home - Dealer Management System V9"));
        Configuration.holdBrowserOpen = true;
    }
}
