package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class LoginPage extends Utility {

    By loginButton = By.xpath("//a[normalize-space()='Login']");
    By newCustomer = By.xpath("//a[@class='btn btn-primary']");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void newCustomerPage() {
        clickOnElement(newCustomer);
    }

}
