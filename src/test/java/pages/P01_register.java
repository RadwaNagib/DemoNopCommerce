package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_register {

    WebDriver driver;

    public P01_register(WebDriver driver){
        this.driver=driver;
    }

    public WebElement gender()
    {
        By female=By.id("gender-female");
        WebElement name=driver.findElement(female);
        return name;
 //        return driver.findElement(By.id("gender-female"));

    }
    public WebElement firstnamePOM()
    {
        By firstname=By.id("FirstName");
        WebElement firstnameEle=driver.findElement(firstname);
        return firstnameEle;

    }

    public WebElement lastnamePOM()
    {
        By lastname=By.id("LastName");
        WebElement lastnameEle=driver.findElement(lastname);
        return lastnameEle;

    }
    public WebElement email() {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }
    public WebElement day()
    {
        By day=By.xpath("//select[@name=\"DateOfBirthDay\"]//option[@value=\"13\"]");
        WebElement dayEle =driver.findElement(day);
        return dayEle;
    }
    public WebElement month()
    {
        By month=By.xpath("//select[@name=\"DateOfBirthMonth\"] //option [@value=\"3\"]");
        WebElement monthEle=driver.findElement(month);
        return monthEle;
    }
    public WebElement year()
    {
        By year=By.xpath("//select[@name=\"DateOfBirthYear\"] //option [@value=\"2006\"]");
        WebElement yearEle=driver.findElement(year);
        return yearEle;
    }
    public WebElement company_name() {
        By com_name = By.id("Company");
        WebElement com_name_Ele = driver.findElement(com_name);
        return com_name_Ele;
    }

    public WebElement password()
    {
        By pass_word=By.id("Password");
        WebElement p_word_Ele=driver.findElement(pass_word);
        return p_word_Ele;
    }
    public WebElement password_confrm()
    {
        By pass_word_confrm=By.id("ConfirmPassword");
        WebElement p_word_Ele_confrm=driver.findElement(pass_word_confrm);
        return p_word_Ele_confrm;
    }

}
