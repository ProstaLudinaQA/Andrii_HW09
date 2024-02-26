package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Andrii_HW09 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop.qatestlab.com.ua/uk/authentication?back=my-account#account-creation");
    }
    @Test
    public  void EntranceTest() {
        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("testyasno3@gmail.com");
        driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
        String textSucces = driver.findElement(By.xpath("//*[@id='center_column']/h1")).getText();
        Assert.assertEquals(textSucces, "АВТОРИЗАЦІЯ");
    }

    @Test
    public void EmailInvalid(){
        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("testyasno3.com");
        driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
        String textSucces = driver.findElement(By.xpath("//*[@id='center_column']/h1")).getText();
        Assert.assertEquals(textSucces, "АВТОРИЗАЦІЯ");








}}
