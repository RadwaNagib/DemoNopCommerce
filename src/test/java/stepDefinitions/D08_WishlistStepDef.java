package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P04_wishList;

public class D08_WishlistStepDef {

    int number;
    WebDriver driver =Hooks.driver;
    P04_wishList p04_wishList=new P04_wishList(driver);
    @When("user add product to wishlist")
    public void wishlist()
    {
        //USING findElements when the same path have more the one element to get all elements that have this path in dom page and switch between them by index
        // [element0,element1,element2,element3]
       // Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
        p04_wishList.wishlist().get(2).click();
        System.out.println("success");

    }
    @Then("wishlist notification success is visible")
    public void notification_success()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }

@And("number of wishlist items increased")
    public void wish_items_increase()
  {
    Assert.assertTrue(number > 0);
  }
}
