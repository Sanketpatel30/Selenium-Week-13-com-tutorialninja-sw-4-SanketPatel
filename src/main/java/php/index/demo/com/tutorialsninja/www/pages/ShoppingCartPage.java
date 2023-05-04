package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

import java.lang.reflect.UndeclaredThrowableException;

public class ShoppingCartPage extends Utility {

    By shoppingCart = By.xpath("//button[@id='button-cart']");

    public void addToCart() {
        clickOnElement(shoppingCart);
    }
}
