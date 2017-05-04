package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.driver.DriverFactory;

/**
 * Created by Andriy on 13.04.2017.
 */
public class AbstractTestCase {

    @BeforeClass
    public void runBrowser(){
        DriverFactory.getDriver();
    }

    @AfterClass
    public void quitBrowser(){
        DriverFactory.closeDriver();
    }
}
