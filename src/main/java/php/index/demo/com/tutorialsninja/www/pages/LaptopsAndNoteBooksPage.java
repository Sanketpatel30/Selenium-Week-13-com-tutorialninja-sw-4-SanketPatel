package php.index.demo.com.tutorialsninja.www.pages;

import org.openqa.selenium.By;
import php.index.demo.com.tutorialsninja.www.utilities.Utility;

public class LaptopsAndNoteBooksPage extends Utility {

    By laptopAndNotebook = By.xpath("//body[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]");


    public void laptopAndNotBook() {
        clickOnElement(laptopAndNotebook);
    }


}
