package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class RegisterPage extends Utility {

    By registerTab = By.linkText("Register");

    public void registerPageFill() {
        clickOnElement(registerTab);
    }
}
