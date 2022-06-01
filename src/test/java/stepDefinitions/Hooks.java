package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
//define before and after annotation for your driver
    //Before annotation(@Before related to cucumber not testNG or Junit)
    public  static WebDriver driver=null;

    @Before
    public static void user_open_browser()

    {
        //1-always the first step in my code
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

        //2-new object
        driver =new ChromeDriver();

        //3-configuration to driver
        driver.manage().window().maximize();
        //implicitlywait : only have one condition  to check if the element is present in Dom page and executed only one in before page
        //explicitywait :have more one condition
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //4-navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void close() throws InterruptedException
    {
        Thread.sleep(2000);
         driver.quit();
    }


}
