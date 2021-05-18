import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationPracticeSignIn
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        String baseUrl = "http://automationpractice.com/index.php";
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
    public void verifyUserShouldNotSignInWithInvalidPassword()
    {
        //Click on Sign In in Homepage
        driver.findElement(By.xpath("//a[@class='login']")).click();

        //Enter valid Email Address
        driver.findElement(By.id("email")).sendKeys("sapana@gmail.com");

        //Enter wrong Password
        driver.findElement(By.id("passwd")).sendKeys("abc");

        // Click on sign in
        driver.findElement(By.id("SubmitLogin")).click();

        //Assert
        String expectedMessage = "There is 1 error";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@id='center_column']/div/p"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Invalid Password...",expectedMessage,actualMessage);
    }
}
