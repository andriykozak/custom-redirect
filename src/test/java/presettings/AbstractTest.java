package presettings;

import dmsFunctionality.LoginToDmsFunctionality;
import dmsPageObjects.LoginDmsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Irina M. on 19.02.2017.
 */
public class AbstractTest {


    protected WebDriver driver;
    public String baseUrl;
    protected LoginToDmsFunctionality loginToDmsFunctionality;
    protected LoginDmsPage loginPage;


    @BeforeClass
    public void start () throws Exception {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//        baseUrl = PropertyLoader.loadProperty("site.url");
//        driver.get(PropertyLoader.loadProperty("dms.url"));
        loginPage = PageFactory.initElements(driver, LoginDmsPage.class);
        loginToDmsFunctionality = new LoginToDmsFunctionality(driver);
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
