import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginSuperAdmin
{
    private static String nationalID = "2353300581";
    private static WebDriver driver ;
    @BeforeTest
    public static void openBrowser()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--incognito");
        driver = new EdgeDriver(options);
        driver.get("https://nidlp.ntgcloud.net/login/internal");

    }
    @Test
    public static void login() throws InterruptedException {
        /*define loginBtn through nafath*/
        WebElement loginButton = driver.findElement(By.className("login-button"));
        //loginButton.click();
        /*define the field of national id*/
        /*send data to national id field*/
        //WebElement nationalId = driver.findElement(By.id("idNumber"));
        /*define the login btn*/

        // got to the postman to send the key and go to the landing page

    }
    @AfterTest
    public static void AfterTest()
    {
       // driver.close();
    }
}
