package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectCompanyOrAgencyPage {
    /**/
    private WebDriver driver ;
    private WebDriverWait wait;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    /*declare constructor to control the driver*/
    public SelectCompanyOrAgencyPage(WebDriver driver , JavascriptExecutor js)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = js ;
    }
    /*declare locator*/
    By companyRadioButton = By.xpath("//label[@for='company']");
    By nextBtn = By.xpath("//button[@class='next-button']");
    By agencyRadioButton = By.xpath("//input[@id='government']");
    By nafathBtn =By.xpath("//button[contains(@class, 'next-button') and contains(@class, 'login-button')]");
    By nationalId = By.xpath("//input[@id='idNumber']");

    public void selectCompanyRadioButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyRadioButton));
        driver.findElement(companyRadioButton).click();
        js.executeScript("document.body.style.zoom = '50%'");
        driver.findElement(nextBtn).click();
    }

    public void selectAgencyRadioButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agencyRadioButton));
        driver.findElement(agencyRadioButton).click();
        js.executeScript("document.body.style.zoom = '50%'");
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
        driver.findElement(nextBtn).click();
    }
    public void enterToNafath()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nafathBtn));
        driver.findElement(nafathBtn).click();
    }
    public void enterNationalIdData(String id)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nationalId));
        driver.findElement(nationalId).sendKeys(id);
    }
}
