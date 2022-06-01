package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {

    WebDriver driver;
    public P02_login(WebDriver driver){
        this.driver=driver;
    }

    public WebElement email()
    {
        By email=By.id("Email");
        WebElement emailEle=driver.findElement(email);
        return emailEle;
    }
    public WebElement password() {
        By password = By.id("Password");
        WebElement passwordEle =driver.findElement(password);
        return passwordEle;
    }
    public void login_steps(String email,String password)
    {
        email().clear();
        email().sendKeys(email);
       password().sendKeys(password);
    }


}
