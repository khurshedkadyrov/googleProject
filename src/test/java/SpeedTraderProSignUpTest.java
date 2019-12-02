import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SpeedTraderProSignUpTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.speedtrader.com//");
        System.out.println("Step 1 - " + "Opening www.speedtrader.com " + "and performing end to end testing with negative data");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeSpeedTraderProSignUpTest() throws InterruptedException {
        driver.findElement(By.linkText("TRIAL DEMO")).click();
        System.out.println("Step 2 - " + "Opening a page and clicking on Trial Demo button to proceed with trial sign up");
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        System.out.println("Step 3 - " + "Switching from main page to second page to continue with trial sign up");
        driver.findElement(By.name("txtUsername")).sendKeys("FullName");
        System.out.println("Step 4 - " + "Locating username field By.name locator and sending FullName as an input to the field");
        driver.findElement(By.name("txtPassword")).sendKeys("P@ssW~rd");
        System.out.println("Step 5 - " + "Locating password field By.name locator and sending P@ssW~rd as an input to the field");
        driver.findElement(By.name("txtName")).sendKeys("someUsername");
        System.out.println("Step 6 - " + "Locating name field By.name locator and sending someUsername as an input to the field");
        driver.findElement(By.name("txtContact")).sendKeys("somePhoneNUmber");
        System.out.println("Step 7 - " + "Locating phone field By.name locator and sending somePhoneNumber as an input to the field");
        driver.findElement(By.name("txtEmail")).sendKeys("test@speed.com");
        System.out.println("Step 8 - " + "Locating email field By.name locator and sending test@speed.com as an input to the field");
        driver.findElement(By.className("btn-success")).sendKeys(Keys.ENTER);
        System.out.println("Step 9 - " + "Locating Submit button By.classname and clicking on it");
        driver.switchTo().defaultContent();
        System.out.println("Step 10 - " + "Switching from secondary window back to original window using switchTo method");
        Assert.assertEquals("SpeedTrader PRO Demo", driver.findElement(By.tagName("h1")).getText());
        System.out.println("Step 11 - " + "Verifying header SpeedTrader PRO Demo using assertEquals method "  + "locating element using tagname h1 " + "Comparing expected and actual results"  );

    }
}
