package pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_homePage {
    WebDriver driver;

    public P03_homePage(WebDriver driver){
        this.driver=driver;

    }

        public WebElement sliders(String num)
        {
            //The main idea is that you could locate first & second sliders with only one locator in pom design pattern like this
            return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));

        }
    }



