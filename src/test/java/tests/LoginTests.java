package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void negetiveloginTest1(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester23");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
<<<<<<< HEAD
        Assert.assertEquals(driver.getTitle(),"Web Orders")
=======
        String errorMsg = driver.findElement(By.id("ctl00_MainContent_status")).getText();

        Assert.assertEquals(errorMsg, "Invalid Login or Password.");
>>>>>>> feature
    }


    @AfterMethod
    public void closeDriver(){
        driver.close();
    }

    @Test
    public void logoutTest(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
        driver.findElement(By.id("ctl00_logout")).click();
       //String  add some master shitg
        Assert.assertEquals(driver.getTitle(), "Web Orders Login");


    }




    }

