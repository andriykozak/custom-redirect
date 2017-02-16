package access;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Andriy on 2/2/2017.
 */
public class ActivateCustomRedirectWidget {

    public static void activateWidget(){
        open("http://mister.andrijk.ixloo.com/dms/settings/sites");
        $(byTitle("Sites : Settings - Dealer Management System V9"));
        $(byId("site_20")).doubleClick();
        $(byText("Site editor"));
        $(byId("site_widgets_open")).click();
        $(byText("Site Widgets"));
        $(byId("dws_custom_redirect")).setSelected(true).shouldBe(selected);
        $(byLinkText("close")).click();
        $(byXpath("//div[@class='ui-dialog-buttonset']//button[.='Ok']")).click();
        sleep(8000);

        /*open("http://andrijk.ixloo.com/dms/admin/dealers");
        $(byTitle("Dealers : Admin - Dealer Management System V9"));
        $(byId("dealer_543")).doubleClick();
        $(byTitle("Dealers : Admin - Dealer Management System V9"));
        $(byXpath("//span[@id='site_package_editor_open']//a[.='Edit']")).click();
        $(byLinkText("Dealer Web Site Package"));
        $(byId("dws_custom_redirect")).setSelected(true).shouldBe(selected);
        $(byXpath("//div[6]/div[3]/button[1]")).click();
        $(byTitle("Dealers : Admin - Dealer Management System V9"));
        $(byLinkText("Save")).click();
        $(byId("dealer_543")).shouldBe(visible);
*/
    }
}
