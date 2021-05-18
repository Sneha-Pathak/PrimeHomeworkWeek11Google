import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeDemo
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl); // will open url on chrome browser
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void verifyUserShouldLogoutSuccessfully()
    {
        //Enter username and password
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //click on login
        driver.findElement(By.id("btnLogin")).click();

        //click on welcome paul
        driver.findElement(By.id("welcome")).click();

        //click on logout
        driver.findElement(By.linkText("Logout")).click();

        //Assert
        String expectedMessage = "LOGIN Panel";

        WebElement errorMessage = driver.findElement(By.id("logInPanelHeading"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("User is not logout Successfully..",expectedMessage,actualMessage);
    }
}
