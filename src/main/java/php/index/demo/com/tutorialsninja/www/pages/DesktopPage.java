package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class DesktopPage extends Utility {

    By deskTopPage = By.xpath("(//a[normalize-space()='Desktops'])[1]");

    public void clickOnLoginPage(){
        clickOnElement(deskTopPage);
    }
}
