package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;


public class D05_hoverCategoriesStepDef {
    String subCategoryName;
    String search_name_st;
    WebDriver driver = Hooks.driver;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
        // hover on "Computers"
        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();		// this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);


// click on "Desktops"
        desktops.click();

    }
   @Then("ensure to get selected subcategory")
    public void selected_subcategory()
   {
       System.out.println(subCategoryName);
       WebElement search_name=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]"));
       search_name_st=search_name.getText().toLowerCase().trim();
       System.out.println(search_name_st);
       Assert.assertTrue(subCategoryName.contains(search_name_st));

   }

}