package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_wishList {
    WebDriver driver;

    public P04_wishList(WebDriver driver){
        this.driver=driver;

    }
    public List<WebElement> wishlist(){
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

}
