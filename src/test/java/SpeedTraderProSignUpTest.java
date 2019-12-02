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
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeSpeedTraderProSignUpTest() throws InterruptedException {
        driver.findElement(By.linkText("TRIAL DEMO")).click();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.name("txtUsername")).sendKeys("FullName");
        driver.findElement(By.name("txtPassword")).sendKeys("P@ssW~rd");
        driver.findElement(By.name("txtName")).sendKeys("someUsername");
        driver.findElement(By.name("txtContact")).sendKeys("somePhoneNUmber");
        driver.findElement(By.name("txtEmail")).sendKeys("test@speed.com");
        driver.findElement(By.className("btn")).sendKeys(Keys.ENTER);
        driver.switchTo().defaultContent();
        Assert.assertEquals("SpeedTrader PRO Demo", driver.findElement(By.tagName("h1")).getText());

    }
}
