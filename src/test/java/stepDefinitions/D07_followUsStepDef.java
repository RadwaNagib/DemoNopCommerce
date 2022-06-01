package stepDefinitions;

import com.sun.deploy.security.BrowserAuthenticator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.P05_shoppingCart;

import java.util.ArrayList;


public class D07_followUsStepDef {

    WebDriver driver = Hooks.driver;
    ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

// scenario:1 >> open facebook
    @When("user open facebook link")
    public void open_facebook() {

        Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"]")).click();
    }

   @Then("^\"([^\"]*)\" is opened in new tab$")
    public void facebook_new_tab(String URL) throws InterruptedException {
       //ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

       Thread.sleep(2000);
           Tabs = new ArrayList<>(driver.getWindowHandles());
           Hooks.driver.switchTo().window(Tabs.get(1));

           System.out.println(Hooks.driver.getCurrentUrl());
           System.out.println(Hooks.driver.getTitle());

       Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

// that's because we need to only close tab 1
           driver.close();

         driver.switchTo().window(Tabs.get(0));
           System.out.println(driver.getCurrentUrl());

// that's because we need to close the whole browser after finishing all the steps as we used to do before
           driver.quit();

   }

   //scenario:2---open twitter

@When("user open twitter link")
    public void open_twitter()
{
    Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]")).click();
}
@Then("^\"([^\"]*)\" is open in new tab")
    public void twitter_on_newtab(String URL) throws InterruptedException {
    Thread.sleep(2000);
    Tabs = new ArrayList<>(driver.getWindowHandles());
    Hooks.driver.switchTo().window(Tabs.get(1));

    System.out.println(Hooks.driver.getCurrentUrl());
    System.out.println(Hooks.driver.getTitle());

    Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

// that's because we need to only close tab 1
    driver.close();

    driver.switchTo().window(Tabs.get(0));
    System.out.println(driver.getCurrentUrl());

// that's because we need to close the whole browser after finishing all the steps as we used to do before
    driver.quit();

}

//Scenario"4>> open youtube

    @When("user opens youtube link")
    public void open_youtube()
    {
        Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"]")).click();
    }
    @Then("^\"([^\"]*)\" is opened in new Tab")
    public void open_youtube_newtab(String URL) throws InterruptedException
    {
        Thread.sleep(2000);
        Tabs = new ArrayList<>(driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");

// that's because we need to only close tab 1
        driver.close();

        driver.switchTo().window(Tabs.get(0));
        System.out.println(driver.getCurrentUrl());

// that's because we need to close the whole browser after finishing all the steps as we used to do before
        driver.quit();


    }
    @When("user open rss link")
    public void open_rss()
    {
        Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"]")).click();
    }
   @Then("^\"([^\"]*)\" are open in new tab$")
    public void rss_new_tab(String URL) throws InterruptedException
   {
       Thread.sleep(3000);
       Tabs= new ArrayList<>(driver.getWindowHandles());
       Hooks.driver.switchTo().window(Tabs.get(1));

       System.out.println(Hooks.driver.getCurrentUrl());
       System.out.println(Hooks.driver.getTitle());

       Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

       // that's because we need to only close tab 1
       driver.close();

       driver.switchTo().window(Tabs.get(0));
       System.out.println(driver.getCurrentUrl());

// that's because we need to close the whole browser after finishing all the steps as we used to do before
       driver.quit();
   }
}













