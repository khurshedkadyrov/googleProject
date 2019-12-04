import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InstagramSignUpTestXpath {
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
        driver.findElement(By.xpath("//input [@name=\"emailOrPhone\"]")).sendKeys("test@example.com");
        System.out.println("Finding element of Mobile number or Email input using By.xpath locator and passing test@example.com as an example for the input");
        driver.findElement(By.xpath("//input[contains(@aria-label, 'Full Name')]")).sendKeys("FirstName LastName");
        System.out.println("Finding element of FullName input using By.xpath  locator and passing FirstName LastName as an example for the input");
        driver.findElement(By.xpath("//input[starts-with(@aria-label, 'User')]")).sendKeys("someUsername");
        System.out.println("Finding element of Username input using By.xpath  locator and passing someUsername as an example for the input");
        driver.findElement(By.xpath("//input[contains(@name, 'pass')]")).sendKeys("P@ssw0rd");
        System.out.println("Finding element of Password input using By.xpath  locator and passing P@ssw0rd as an example for the input");
        Assert.assertEquals("Instagram", driver.findElement(By.xpath("//h1 [.='Instagram']")).getText());
        System.out.println("Finding element of Instagram header using By.xpath  locator and verifying that expected header Instagram matches the actual header name");
        driver.findElement(By.xpath("//button [.='Sign up']")).click();
        System.out.println("Finding element of Sign Up button using By.xpath  locator and hitting the button to finish the sign up process");
    }

}

