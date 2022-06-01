package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P05_shoppingCart;

public class D09_ShoppingCartStepDef {

    WebDriver driver =Hooks.driver;
    P05_shoppingCart p5_shoppingcard=new P05_shoppingCart(driver);
    int number;

    @When("user add product to shopping card")
    public void shopping_card()
    {
        p5_shoppingcard.shopping_card().get(2).click();
        System.out.println("success");
    }
    @Then("shopping card notification success is visible")
    public void notification_success()
    {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }

}
