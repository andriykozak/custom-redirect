package access;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Andriy on 1/27/2017.
 */
public class EnableMap20SubSite {

    public static void setJquery11() {
        open("http://mister.andrijk.ixloo.com/dms/settings/website#general");
        $(byTitle("Website : Settings - Dealer Management System V9"));
        $(byXpath("//tr[@id='jquery_version']//a[.='Edit']")).click();
        $(byName("jquery_version")).setValue("1.11.2").pressEnter();
        $(byXpath("//tr[@id='jquery_version']//a[.='Edit']")).shouldBe(visible);
    }

    public static void setMap20() {
        open("http://mister.andrijk.ixloo.com/dms/settings/users");
        $(byTitle("Users : Settings - Dealer Management System V9"));
        $(byXpath("//div[1]/div[1]/table/tbody/tr/td[3]/div[1]/table/tbody/tr/td[1]/div[4]/ul/li/a")).doubleClick();
        $(byLinkText("User Editor"));
        $(byId("user_editor_tab4")).click();
        $(byId("go_9")).click();
        $(byId("addon_make_a_page")).setSelected(false).shouldNotBe(selected);
        $(byId("addon_make_a_page_schedule")).setSelected(false).shouldNotBe(selected);
        $(byId("addon_make_a_page_responsive")).setSelected(false).shouldNotBe(selected);
        $(byId("addon_make_a_page_2")).setSelected(true).shouldBe(selected);
        $(byLinkText("Save")).click();
        sleep(3000);
    }

}

