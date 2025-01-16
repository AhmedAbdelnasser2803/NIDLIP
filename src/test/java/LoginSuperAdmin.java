import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSuperAdmin

{
    private static WebDriver driver ;
    @BeforeTest
    public void openBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://nidlpdev.ntgcloud.net/external-login");
        driver.manage().window().maximize();
        //wiat until the page is completed loading
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        /*while (!js.executeScript("return document.readyState").toString().equals("complete")) {
            try {
                // Sleep for a short time to avoid consuming too much CPU
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }
    @Test
    public void login() throws InterruptedException {
        By companyRadioButton = By.xpath("//label[@for='company']");
        By nextBtn = By.xpath("//button[@class='next-button']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(companyRadioButton));
        driver.findElement(companyRadioButton).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*we can scroll down to get the element*/
        //js.executeScript("window.scrollBy(0,10000)");
        /*we can to zoom out to get the elememnt */
        js.executeScript("document.body.style.zoom = '50%'");
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        driver.findElement(nextBtn).click();


    }
    @AfterTest
    public void AfterTest()
    {
      driver.close();
    }
}
