import org.example.SelectCompanyOrAgencyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSuperAdmin

{
    public static WebDriver driver ;
    private static WebDriver driver2;
    @BeforeTest
    public void openBrowser()
    {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://nidlp2.ntgcloud.net/external-login");
        driver.manage().window().maximize();
    }
    @Test
    public void login() throws InterruptedException {
        /*login as company*/
        String nationalId ="1073984070";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        SelectCompanyOrAgencyPage companyLogin = new SelectCompanyOrAgencyPage(driver , js);
        companyLogin.selectCompanyRadioButton();
        companyLogin.enterToNafath();
        companyLogin.enterNationalIdData(nationalId);
        Thread.sleep(1000);


//        By companyRadioButton = By.xpath("//label[@for='company']");
//        By nextBtn = By.xpath("//button[@class='next-button']");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(companyRadioButton));
//        driver.findElement(companyRadioButton).click();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        /*we can scroll down to get the element*/
//        //js.executeScript("window.scrollBy(0,10000)");
//        /*we can to zoom out to get the elememnt */
//        js.executeScript("document.body.style.zoom = '50%'");
//        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
//        driver.findElement(nextBtn).click();
//        /*click on enter via nafath */
//        // define the element
//        Thread.sleep(1000);
//        String xpathNafathe ="//button[contains(@class, 'next-button') and contains(@class, 'login-button')]";
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathNafathe)));
//        By enterViaNafath = By.xpath(xpathNafathe);
//        driver.findElement(enterViaNafath).click();
//        /*alocate national Id element to be able to insert national id*/
//        String companyNationalIdData = "1073984070";
//        String nationalIdElement = "//input[@id='idNumber']";
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nationalIdElement)));
//        By nationalIdLabel = By.xpath(nationalIdElement);
//        driver.findElement(nationalIdLabel).sendKeys(companyNationalIdData);
//        String loginBtn = "//button[@id='submitButton']";
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginBtn)));
//        By loginBtnElment = By.xpath(loginBtn);
//        driver.findElement(loginBtnElment).click();
//        /*send key to login as postman module*/
//        String URL = "https://auth.nidlp.dev/api/v1/nafath/mock/"+companyNationalIdData;
//        EdgeOptions option2 = new EdgeOptions();
//        driver2 = new EdgeDriver(option2);
//        driver2.get(URL);
//        driver2.close();
//        Thread.sleep(50000);



    }


    @AfterTest
    public void AfterTest ()
    {
      driver.close();
    }
}
