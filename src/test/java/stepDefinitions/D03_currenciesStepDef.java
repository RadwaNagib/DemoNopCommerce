package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    WebDriver driver = Hooks.driver;

    @Given("navigate to homepage")
    public void get_url4() {
        driver.navigate().to("https://demo.nopcommerce.com/ 4");
    }

    @Then("Select Euro from currency dropdown list")
    public void select_Euro() {
        String euro = String.valueOf(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(euro, "Euro", "true");
        driver.navigate().to("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        System.out.println("Euro");
    }

}
