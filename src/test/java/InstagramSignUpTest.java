import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class InstagramSignUpTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void negativeInstagramSignUpTest() throws InterruptedException {
        driver.findElement(By.name("emailOrPhone")).sendKeys("test@example.com");
        System.out.println("Finding element of Mobile number or Email input using By.name locator and passing test@example.com as an example for the input");
        driver.findElement(By.name("fullName")).sendKeys("FirstName LastName");
        System.out.println("Finding element of FullName input using By.name locator and passing FirstName LastName as an example for the input");
        driver.findElement(By.name("username")).sendKeys("someUsername");
        System.out.println("Finding element of Username input using By.name locator and passing someUsername as an example for the input");
        driver.findElement(By.name("password")).sendKeys("P@ssw0rd");
        System.out.println("Finding element of Password input using By.name locator and passing P@ssw0rd as an example for the input");
        Assert.assertEquals("Instagram", driver.findElement(By.tagName("h1")).getText());
        System.out.println("Finding element of Instagram header using By.tagName locator and verifying that expected header Instagram matches the actual header name");
        driver.findElement(By.className("y3zKF")).sendKeys(Keys.ENTER);
        System.out.println("Finding element of Sign Up button using By.classname locator and hitting the button to finish the sign up process");
    }

}