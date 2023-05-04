package php.index.demo.com.tutorialsninja.www.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

import javax.rmi.CORBA.Util;

public class BaseTest extends Utility {

    String browser = "Chrome";
@BeforeMethod
    public void setUp(){
    selectBrowser(browser);
    }
@AfterMethod
    public void tearDown(){
closeBrowser();
    }
}
