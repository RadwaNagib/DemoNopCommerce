package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.P01_register;

public class D01_registerStepDef {
    WebDriver driver =Hooks.driver;
    P01_register p_register = new P01_register(driver);



   @Given("click on register Tab")
    public void click_register_tab()
   {
       driver.findElement(By.linkText("Register")).click();
   }
   @When("user Fill require data")
    public void fill_data()
   {
       p_register.firstnamePOM().sendKeys("f");
       p_register.lastnamePOM().sendKeys("f");
       p_register.email().sendKeys("testing_21@example.com");
       p_register.day().click();
       p_register.month().click();
       p_register.year().click();
       p_register.company_name().sendKeys("Automation Company");
       p_register.password().sendKeys("P@ssw0rd");
       p_register.password_confrm().sendKeys("P@ssw0rd");


   }
   @And("Click on REGISTER button")
    public void click_register_button()
   {
       driver.findElement(By.id("register-button")).click();

   }

   @Then("user could register success")
    public void register_success()
   {
       SoftAssert soft=new SoftAssert();
       String expectedResult="Your registration completed";
       String actualResult=driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
       soft.assertTrue(actualResult.contains(expectedResult),"gettext");
       System.out.println("first assert");
      String message_color=driver.findElement(By.xpath("//div[@class=\"result\"]")).getCssValue("color");
       soft.assertEquals(message_color,"rgba(76, 177, 124, 1)");
       soft.assertAll();

   }
   @And("go to home page")
    public void go_to_homepage()
   {
System.out.println("finish");

   }
}
