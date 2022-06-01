package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    WebDriver driver = Hooks.driver;

    public WebElement search_category() {
        By search=By.id("small-searchterms");
        WebElement searchEle=driver.findElement(search);
        return searchEle;
    }

    @Given("^Enter \"(.*)\" on search text$")
    public void enter_search_element(String search)
    {
         search_category().sendKeys(search);
         System.out.println("Electronics");
    }

@When("click on search button")
    public void click_on_search_btton()
{
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
@Then("user could fine Electronics product")
    public void electric_category()
{
    SoftAssert soft=new SoftAssert();
    String expectedresult="https://demo.nopcommerce.com/search?q=Electronics";
    String actualresult=Hooks.driver.getCurrentUrl();
    System.out.println(actualresult);
    soft.assertTrue(actualresult.contains(expectedresult),"true");
    int size=driver.findElements(By.id("q")).size();
    soft.assertTrue(size>0,"true");
    //int size = driver.findElements(By.cssSelector("")).size();
   // soft.assertTrue(size > 0);
    System.out.println("size>0");
    soft.assertAll();

}

//SCENARIO 2

@Given("^Enter \"(.*)\" on search textBOX$")
    public void enetr_sku(String saerch_sku)
{
    search_category().sendKeys(saerch_sku);
    System.out.println("AP_MBP_13");
}
    @When("click on search_button")
    public void click_on_Search_btton()
    {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Then("user could fine AP_MBP_13product")
    public void electric_Category()
    {
        SoftAssert soft=new SoftAssert();
        String expectedresult="https://demo.nopcommerce.com/search?q=AP_MBP_13";
        String actualresult=Hooks.driver.getCurrentUrl();
        System.out.println(actualresult);
        soft.assertTrue(actualresult.contains(expectedresult),"true");
        int size=driver.findElements(By.id("q")).size();
        soft.assertTrue(size>0,"true");
        //int size = driver.findElements(By.cssSelector("")).size();
        // soft.assertTrue(size > 0);
        System.out.println("size>0");
        soft.assertAll();

    }

}