package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_shoppingCart {
    WebDriver driver;

    public P05_shoppingCart(WebDriver driver){
        this.driver=driver;

    }
    public List<WebElement> shopping_card(){
        return driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }
}
