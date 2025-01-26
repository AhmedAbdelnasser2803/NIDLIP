import org.example.SelectCompanyOrAgencyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginAsCompany {
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
        companyLogin.loginViaNafath(nationalId);
        Thread.sleep(10000);
    }

    @AfterTest
    public void AfterTest ()
    {
        driver.close();
    }
}
