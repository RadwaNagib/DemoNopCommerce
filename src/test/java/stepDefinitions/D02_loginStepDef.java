package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.P02_login;

public class D02_loginStepDef {
    WebDriver driver =Hooks.driver;
    P02_login p_login=new P02_login(driver);

    @Given("click on login Tab")
    public void login_tab()
    {
       driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void enter_data(String eml,String pssword)
    {
      p_login.login_steps(eml,pssword);
    }
    @And("Click on login button")
    public void click_login_btton()
    {
        driver.findElement(By.xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]")).click();

    }
    @Then("user could login success")
    public void login_success()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/", driver.getCurrentUrl());
        String my_account=driver.findElement(By.xpath("//a[@class=\"ico-account\"]")).getText();
        soft.assertEquals(my_account,"My account");
        soft.assertAll();
        System.out.println("my account");

    }

}
