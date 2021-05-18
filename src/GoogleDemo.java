import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleDemo
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        String baseUrl = "https://www.google.com/";
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
    public void verifyUserShouldNavigateToComputerPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a")).click();

        //Assert
        String expectedMessage = "Computers";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Computers Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToElectronicsPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a")).click();

        //Assert
        String expectedMessage = "Electronics";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Electronics Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToApparelPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a")).click();

        //Assert
        String expectedMessage = "Apparel";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Apparel Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToDigitalDownloadsPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a")).click();

        //Assert
        String expectedMessage = "Digital downloads";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Digital downloads Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToBooksPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).click();

        //Assert
        String expectedMessage = "Books";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Books Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToJewelryPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).click();

        //Assert
        String expectedMessage = "Jewelry";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Jewelry Page",expectedMessage,actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToGiftCardsPage()
    {
        //Agree the cookies
        WebElement agree = driver.findElement(By.xpath("//div[text()='I agree']"));
        agree.click();

        //Entering text into google search bar
        WebElement googleText = driver.findElement(By.xpath("//input[@title='Search']"));
        googleText.sendKeys("nopCommerce demo store" );

        //Clicking on search
        //WebElement googleSearch = driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[@name='btnK']"));
        WebElement googleSearch = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"));
        googleSearch.submit();

        //Clicking on nopCommerce Website
        driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/a")).click();

        //Clicking on Electronics from top Menu bar
        driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).click();

        //Assert
        String expectedMessage = "Gift Cards";

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        String actualMessage = errorMessage.getText();

        Assert.assertEquals("Not on Gift Cards Page",expectedMessage,actualMessage);
    }
}
