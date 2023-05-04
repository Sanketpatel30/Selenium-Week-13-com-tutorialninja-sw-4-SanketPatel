package php.index.demo.com.tutorialsninja.www.pages;

import org.asynchttpclient.netty.util.Utf8ByteBufCharsetDecoder;
import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class ComponentsPage extends Utility {
    By components = By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]");

    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        clickOnElement(components);
    }
}
