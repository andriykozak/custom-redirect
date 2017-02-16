package presettings;

import access.ActivateCustomRedirectWidget;
import access.EnableMap20SubSite;
import access.LoginDmsSubSite;
import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Andriy on 1/26/2017.
 */
public class EnableCustomRedirectWidget {

    @BeforeTest
    public void login() {
        LoginDmsSubSite.loginDmsAsSupervisor();
    }

    @BeforeTest
    public void map20() {
        EnableMap20SubSite.setJquery11();
        EnableMap20SubSite.setMap20();
    }

    @Test
    public void enableWidget(){
        ActivateCustomRedirectWidget.activateWidget();
    }

    @Test
    public void checkWidgetOnPage(){
        open("http://mister.andrijk.ixloo.com/dms/tools/make_a_page_2");
        $(byCssSelector("div.map-link.pull-right")).click();
        $(byCssSelector("span.mapx-button-ico.widget")).click();
        $(byCssSelector("div.ico-widget.widget-custom_redirect")).dragAndDropTo("div.ax-container");
        $(byTitle("Activate Page (publish)")).click();
        open("http://mister.andrijk.ixloo.com");
        $(byId("errorTitleText")).shouldHave(Condition.text("The page isn't redirecting properly"));
    }
}
