package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.P03_homePage;

public class D06_homeSlidersStepDef {
    WebDriver driver =Hooks.driver;
    P03_homePage home=new P03_homePage(driver);


@When("click on first slider")
    public void click_on_first_slider()
{
    home.sliders("1").click();
}
@Then("go to Nokia Lumia 1020")
    public void nokia_page()
{

    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
}
@When("click on second slider")
    public void click_on_second_slider()
{
    home.sliders("2");
}
@Then("go to iphone-6")
    public void iphone_page()
{
    Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
}


}
