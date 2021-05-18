import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopDemoRegisterPage
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl); // will open url on chrome browser
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageAndFillDetails()
    {
        //Click on Register Link
        driver.findElement(By.linkText("Register")).click();

        //Select Female gender
        //driver.findElement(By.id("gender-male")).click();

        //Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("Chris");

        //Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Hatfield");

        //Select Day in DOB
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("15");

        //Select Month in DOB
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");

        //Select Year in DOB
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");

        //Enter Email Address
        driver.findElement(By.id("Email")).sendKeys("chris@gmail.com");

        //Enter Company name
        driver.findElement(By.id("Company")).sendKeys("CostCutter");

        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("Abcd123");

        //Enter Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd123");

        //Click on Register
        driver.findElement(By.id("register-button")).click();

        //Assert
        String expectedMessage = "Your registration completed";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='result']"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("User is not Register Successfully..",expectedMessage,actualMessage);
    }
}
