package presettings;

import data.JQuery;
import data.JQueryRepository;
import data.User;
import data.UserRepository;
import dmsFunctionality.*;
import org.testng.annotations.Test;
import testng.AbstractTestCase;


/**
 * Created by Andriy on 1/26/2017.
 */
public class EnableCustomRedirectWidget extends AbstractTestCase {

    private User ixlooSupervisor = UserRepository.getIxlooSupervisor();
    private JQuery jQuery11 = JQueryRepository.getJQuery11();
    private LoginToDmsFunctionality loginToDmsFunctionality;
    private SelectJqueryVersionFunctionality selectJqueryVersionFunctionality;
    private SelectMapVersionFunctionality selectMapVersionFunctionality;
    private EnableCustomRedirectWidgetFunctionality enableCustomRedirectWidgetFunctionality;
    private DragAndDropCustomRedirectWidgetOnPageFunctionality dragAndDropCustomRedirectWidgetOnPageFunctionality;

    @Test
    public void loginToDms() {
        loginToDmsFunctionality = new LoginToDmsFunctionality();
        selectJqueryVersionFunctionality = new SelectJqueryVersionFunctionality();
        selectMapVersionFunctionality = new SelectMapVersionFunctionality();
        enableCustomRedirectWidgetFunctionality = new EnableCustomRedirectWidgetFunctionality();
        dragAndDropCustomRedirectWidgetOnPageFunctionality = new DragAndDropCustomRedirectWidgetOnPageFunctionality();
/*
        loginToDmsFunctionality.loginToDmsAsSupervisor(ixlooSupervisor);
        selectJqueryVersionFunctionality.setJquery(jQuery11);
        selectMapVersionFunctionality.selectMap20();
        enableCustomRedirectWidgetFunctionality.enableCustomRedirectWidget();
        */
        dragAndDropCustomRedirectWidgetOnPageFunctionality.dragAndDropCustomRedirectWidgetOnPage();
    }
}
