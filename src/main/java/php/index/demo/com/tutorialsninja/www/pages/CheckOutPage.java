package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.browserfactory.ManageBrowser;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class CheckOutPage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
}
